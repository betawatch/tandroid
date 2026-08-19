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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
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
    private final HashSet<String> pendingVoiceLoads;
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

    public static /* synthetic */ void $r8$lambda$1t1axbSYGQIU_GMVkHn-zrj3Llc(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static /* synthetic */ void $r8$lambda$H_bZLJEQVx9OdWW6-ZrpVB2xjp0(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static /* synthetic */ void $r8$lambda$TMEsjTkj9lYdR59uaNuAf1n8IoU(TLObject tLObject, TLRPC.TL_error tL_error) {
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
        NotificationsController notificationsController;
        NotificationsController notificationsController2 = Instance[i];
        if (notificationsController2 != null) {
            return notificationsController2;
        }
        synchronized (lockObjects[i]) {
            try {
                notificationsController = Instance[i];
                if (notificationsController == null) {
                    NotificationsController[] notificationsControllerArr = Instance;
                    NotificationsController notificationsController3 = new NotificationsController(i);
                    notificationsControllerArr[i] = notificationsController3;
                    notificationsController = notificationsController3;
                }
            } catch (Throwable th) {
                throw th;
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
        this.pendingVoiceLoads = new HashSet<>();
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
        this.checkStoryPushesRunnable = new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda67
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
        this.notificationDelayRunnable = new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda68
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$YjlEA4UsSMCZjKLgnFG9tPD1u-Y(NotificationsController.this);
            }
        };
        this.dialogsNotificationsFacade = new NotificationsSettingsFacade(this.currentAccount);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda69
            @Override // java.lang.Runnable
            public final void run() {
                r0.getNotificationCenter().addObserver(NotificationsController.this, NotificationCenter.fileLoaded);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$YjlEA4UsSMCZjKLgnFG9tPD1u-Y(NotificationsController notificationsController) {
        notificationsController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("delay reached");
        }
        if (!notificationsController.delayedPushMessages.isEmpty()) {
            notificationsController.showOrUpdateNotification(true);
            notificationsController.delayedPushMessages.clear();
        }
        try {
            if (notificationsController.notificationDelayWakelock.isHeld()) {
                notificationsController.notificationDelayWakelock.release();
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$j8sc2Oc5thH9qf6t4YZaQzJylYM(NotificationsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$j8sc2Oc5thH9qf6t4YZaQzJylYM(NotificationsController notificationsController) {
        List notificationChannels;
        String id;
        notificationsController.openedDialogId = 0L;
        notificationsController.openedTopicId = 0L;
        notificationsController.total_unread_count = 0;
        notificationsController.personalCount = 0;
        notificationsController.pushMessages.clear();
        notificationsController.pushMessagesDict.clear();
        notificationsController.fcmRandomMessagesDict.clear();
        notificationsController.pushDialogs.clear();
        notificationsController.wearNotificationsIds.clear();
        notificationsController.lastWearNotifiedMessageId.clear();
        notificationsController.openedInBubbleDialogs.clear();
        notificationsController.delayedPushMessages.clear();
        notificationsController.notifyCheck = false;
        notificationsController.lastBadgeCount = 0;
        try {
            if (notificationsController.notificationDelayWakelock.isHeld()) {
                notificationsController.notificationDelayWakelock.release();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        notificationsController.dismissNotification();
        notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        SharedPreferences.Editor edit = notificationsController.getAccountInstance().getNotificationsSettings().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                systemNotificationManager.deleteNotificationChannelGroup("channels" + notificationsController.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("groups" + notificationsController.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("private" + notificationsController.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("stories" + notificationsController.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("other" + notificationsController.currentAccount);
                String str = notificationsController.currentAccount + "channel";
                notificationChannels = systemNotificationManager.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i = 0; i < size; i++) {
                    id = NotificationsController$$ExternalSyntheticApiModelOutline7.m(notificationChannels.get(i)).getId();
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$UkCGl5RrEJ0cfB-QHKFazw8DYEY(NotificationsController.this, j, j2);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$UkCGl5RrEJ0cfB-QHKFazw8DYEY(NotificationsController notificationsController, long j, long j2) {
        notificationsController.openedDialogId = j;
        notificationsController.openedTopicId = j2;
    }

    public void setOpenedInBubble(final long j, final boolean z) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda58
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$tbCTJoUn8gEA9DB5taeF2DHLAKM(NotificationsController.this, z, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$tbCTJoUn8gEA9DB5taeF2DHLAKM(NotificationsController notificationsController, boolean z, long j) {
        if (z) {
            notificationsController.openedInBubbleDialogs.add(Long.valueOf(j));
        } else {
            notificationsController.openedInBubbleDialogs.remove(Long.valueOf(j));
        }
    }

    public void setLastOnlineFromOtherDevice(final int i) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$WBr8c8N60WWOuQsa3c2E9OAODDA(NotificationsController.this, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$WBr8c8N60WWOuQsa3c2E9OAODDA(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("set last online from other device = " + i);
        }
        notificationsController.lastOnlineFromOtherDevice = i;
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda78
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$9je-_l1dCrLbSBh5ZPR5sV7qzY8(NotificationsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$9je-_l1dCrLbSBh5ZPR5sV7qzY8(final NotificationsController notificationsController) {
        notificationsController.getClass();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < notificationsController.pushMessages.size(); i++) {
            MessageObject messageObject = notificationsController.pushMessages.get(i);
            long dialogId = messageObject.getDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !DialogObject.isEncryptedDialog(dialogId) && (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup())) {
                arrayList.add(0, messageObject);
            }
        }
        if (arrayList.isEmpty() || AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda65
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$fWygwckxgAuKqh6UZhdBNL_fb-g(NotificationsController.this, arrayList);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$fWygwckxgAuKqh6UZhdBNL_fb-g(NotificationsController notificationsController, ArrayList arrayList) {
        notificationsController.popupReplyMessages = arrayList;
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupNotificationActivity.class);
        intent.putExtra("force", true);
        intent.putExtra("currentAccount", notificationsController.currentAccount);
        intent.setFlags(268763140);
        ApplicationLoader.applicationContext.startActivity(intent);
        ApplicationLoader.applicationContext.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public void removeDeletedMessagesFromNotifications(final LongSparseArray longSparseArray, final boolean z) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda73
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$XLBG2o6o-PQF1GomXw6vC__VvGI(NotificationsController.this, longSparseArray, z, arrayList);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$XLBG2o6o-PQF1GomXw6vC__VvGI(final NotificationsController notificationsController, LongSparseArray longSparseArray, boolean z, final ArrayList arrayList) {
        Integer num;
        int i;
        Integer num2;
        int i2;
        Integer num3;
        LongSparseArray longSparseArray2 = longSparseArray;
        int i3 = notificationsController.total_unread_count;
        notificationsController.getAccountInstance().getNotificationsSettings();
        Integer num4 = 0;
        int i4 = 0;
        while (i4 < longSparseArray2.size()) {
            long keyAt = longSparseArray2.keyAt(i4);
            SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(keyAt);
            if (sparseArray == null) {
                num = num4;
                i = i4;
            } else {
                ArrayList arrayList2 = (ArrayList) longSparseArray2.get(keyAt);
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    int intValue = ((Integer) arrayList2.get(i5)).intValue();
                    MessageObject messageObject = (MessageObject) sparseArray.get(intValue);
                    if (messageObject == null) {
                        num2 = num4;
                        i2 = i4;
                    } else if (!messageObject.isStoryReactionPush && (!z || messageObject.isReactionPush)) {
                        num2 = num4;
                        long dialogId = messageObject.getDialogId();
                        Integer num5 = (Integer) notificationsController.pushDialogs.get(dialogId);
                        if (num5 == null) {
                            num5 = num2;
                        }
                        int intValue2 = num5.intValue() - 1;
                        Integer valueOf = Integer.valueOf(intValue2);
                        if (intValue2 <= 0) {
                            notificationsController.smartNotificationsDialogs.remove(dialogId);
                            num3 = num2;
                        } else {
                            num3 = valueOf;
                        }
                        if (num3.equals(num5)) {
                            i2 = i4;
                        } else {
                            i2 = i4;
                            if (!notificationsController.getMessagesController().isCommunity(dialogId)) {
                                if (notificationsController.getMessagesController().isForum(dialogId)) {
                                    int i6 = notificationsController.total_unread_count - (num5.intValue() > 0 ? 1 : 0);
                                    notificationsController.total_unread_count = i6;
                                    notificationsController.total_unread_count = i6 + (num3.intValue() > 0 ? 1 : 0);
                                } else {
                                    int intValue3 = notificationsController.total_unread_count - num5.intValue();
                                    notificationsController.total_unread_count = intValue3;
                                    notificationsController.total_unread_count = intValue3 + num3.intValue();
                                }
                            }
                            notificationsController.pushDialogs.put(dialogId, num3);
                        }
                        if (num3.intValue() == 0) {
                            notificationsController.pushDialogs.remove(dialogId);
                            notificationsController.pushDialogsOverrideMention.remove(dialogId);
                        }
                        sparseArray.remove(intValue);
                        notificationsController.delayedPushMessages.remove(messageObject);
                        notificationsController.pushMessages.remove(messageObject);
                        if (notificationsController.isPersonalMessage(messageObject)) {
                            notificationsController.personalCount--;
                        }
                        arrayList.add(messageObject);
                    } else {
                        num2 = num4;
                        i2 = i4;
                    }
                    i5++;
                    num4 = num2;
                    i4 = i2;
                }
                num = num4;
                i = i4;
                if (sparseArray.size() == 0) {
                    notificationsController.pushMessagesDict.remove(keyAt);
                }
            }
            i4 = i + 1;
            longSparseArray2 = longSparseArray;
            num4 = num;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.$r8$lambda$e0LLLsExdVWUR1Y44kQxbBfvchg(NotificationsController.this, arrayList);
                }
            });
        }
        if (i3 != notificationsController.total_unread_count) {
            if (!notificationsController.notifyCheck) {
                notificationsController.delayedPushMessages.clear();
                notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
            } else {
                notificationsController.scheduleNotificationDelay(notificationsController.lastOnlineFromOtherDevice > notificationsController.getConnectionsManager().getCurrentTime());
            }
            final int size2 = notificationsController.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.$r8$lambda$ZP9ImSQZ0gmFLrtAEIkNcDsP4LU(NotificationsController.this, size2);
                }
            });
        }
        notificationsController.notifyCheck = false;
        if (notificationsController.showBadgeNumber) {
            notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        }
    }

    public static /* synthetic */ void $r8$lambda$e0LLLsExdVWUR1Y44kQxbBfvchg(NotificationsController notificationsController, ArrayList arrayList) {
        notificationsController.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            notificationsController.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$ZP9ImSQZ0gmFLrtAEIkNcDsP4LU(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.notificationsCountUpdated, Integer.valueOf(notificationsController.currentAccount));
        notificationsController.getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void removeDeletedHisoryFromNotifications(final LongSparseIntArray longSparseIntArray) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$9joOzTYGXKxyxEjWeGWQfaf61Rg(NotificationsController.this, longSparseIntArray, arrayList);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$9joOzTYGXKxyxEjWeGWQfaf61Rg(final NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, final ArrayList arrayList) {
        Integer num;
        int i = notificationsController.total_unread_count;
        notificationsController.getAccountInstance().getNotificationsSettings();
        Integer num2 = 0;
        int i2 = 0;
        while (i2 < longSparseIntArray.size()) {
            long keyAt = longSparseIntArray.keyAt(i2);
            long j = -keyAt;
            long j2 = longSparseIntArray.get(keyAt);
            Integer num3 = (Integer) notificationsController.pushDialogs.get(j);
            if (num3 == null) {
                num3 = num2;
            }
            Integer num4 = num3;
            int i3 = 0;
            while (i3 < notificationsController.pushMessages.size()) {
                MessageObject messageObject = notificationsController.pushMessages.get(i3);
                if (messageObject.getDialogId() == j) {
                    num = num2;
                    if (messageObject.getId() <= j2) {
                        SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(j);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                            if (sparseArray.size() == 0) {
                                notificationsController.pushMessagesDict.remove(j);
                            }
                        }
                        notificationsController.delayedPushMessages.remove(messageObject);
                        notificationsController.pushMessages.remove(messageObject);
                        i3--;
                        if (notificationsController.isPersonalMessage(messageObject)) {
                            notificationsController.personalCount--;
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
                notificationsController.smartNotificationsDialogs.remove(j);
                num4 = num5;
            }
            if (!num4.equals(num3)) {
                if (!notificationsController.getMessagesController().isCommunity(j)) {
                    if (notificationsController.getMessagesController().isForum(j)) {
                        int i4 = notificationsController.total_unread_count - (num3.intValue() > 0 ? 1 : 0);
                        notificationsController.total_unread_count = i4;
                        notificationsController.total_unread_count = i4 + (num4.intValue() > 0 ? 1 : 0);
                    } else {
                        int intValue = notificationsController.total_unread_count - num3.intValue();
                        notificationsController.total_unread_count = intValue;
                        notificationsController.total_unread_count = intValue + num4.intValue();
                    }
                }
                notificationsController.pushDialogs.put(j, num4);
            }
            if (num4.intValue() == 0) {
                notificationsController.pushDialogs.remove(j);
                notificationsController.pushDialogsOverrideMention.remove(j);
            }
            i2++;
            num2 = num5;
        }
        if (arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda34
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.$r8$lambda$cQtLpzui0CzihBzXg0Zyu_2y-1Y(NotificationsController.this, arrayList);
                }
            });
        }
        if (i != notificationsController.total_unread_count) {
            if (!notificationsController.notifyCheck) {
                notificationsController.delayedPushMessages.clear();
                notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
            } else {
                notificationsController.scheduleNotificationDelay(notificationsController.lastOnlineFromOtherDevice > notificationsController.getConnectionsManager().getCurrentTime());
            }
            final int size = notificationsController.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda35
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.$r8$lambda$tGMVFhSO59Mr0OvrT1oLSEA2DUE(NotificationsController.this, size);
                }
            });
        }
        notificationsController.notifyCheck = false;
        if (notificationsController.showBadgeNumber) {
            notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        }
    }

    public static /* synthetic */ void $r8$lambda$cQtLpzui0CzihBzXg0Zyu_2y-1Y(NotificationsController notificationsController, ArrayList arrayList) {
        notificationsController.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            notificationsController.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$tGMVFhSO59Mr0OvrT1oLSEA2DUE(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.notificationsCountUpdated, Integer.valueOf(notificationsController.currentAccount));
        notificationsController.getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void processSeenStoryReactions(long j, final int i) {
        if (j != getUserConfig().getClientUserId()) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$wikeq51v71LMWj1-H0CS3-F1rH8(NotificationsController.this, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$wikeq51v71LMWj1-H0CS3-F1rH8(NotificationsController notificationsController, int i) {
        int i2 = 0;
        boolean z = false;
        while (i2 < notificationsController.pushMessages.size()) {
            MessageObject messageObject = notificationsController.pushMessages.get(i2);
            if (messageObject.isStoryReactionPush && Math.abs(messageObject.getId()) == i) {
                notificationsController.pushMessages.remove(i2);
                SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    notificationsController.pushMessagesDict.remove(messageObject.getDialogId());
                }
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(messageObject.getId()));
                notificationsController.getMessagesStorage().deletePushMessages(messageObject.getDialogId(), arrayList);
                i2--;
                z = true;
            }
            i2++;
        }
        if (z) {
            notificationsController.showOrUpdateNotification(false);
        }
    }

    public void processDeleteStory(final long j, final int i) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$dNkRwqog2oqXZhDIqfVtPgOMvoA(NotificationsController.this, j, i);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$dNkRwqog2oqXZhDIqfVtPgOMvoA(NotificationsController notificationsController, long j, int i) {
        boolean z;
        int i2;
        StoryNotification storyNotification = (StoryNotification) notificationsController.storyPushMessagesDict.get(j);
        if (storyNotification != null) {
            storyNotification.dateByIds.remove(Integer.valueOf(i));
            if (storyNotification.dateByIds.isEmpty()) {
                notificationsController.storyPushMessagesDict.remove(j);
                notificationsController.storyPushMessages.remove(storyNotification);
                notificationsController.getMessagesStorage().deleteStoryPushMessage(j);
                z = true;
                i2 = 0;
                while (i2 < notificationsController.pushMessages.size()) {
                    MessageObject messageObject = notificationsController.pushMessages.get(i2);
                    if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() == i) {
                        notificationsController.pushMessages.remove(i2);
                        i2--;
                        SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(messageObject.getDialogId());
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            notificationsController.pushMessagesDict.remove(messageObject.getDialogId());
                        }
                        z = true;
                    }
                    i2++;
                }
                if (z) {
                    return;
                }
                notificationsController.showOrUpdateNotification(false);
                return;
            }
            notificationsController.getMessagesStorage().putStoryPushMessage(storyNotification);
        }
        z = false;
        i2 = 0;
        while (i2 < notificationsController.pushMessages.size()) {
        }
        if (z) {
        }
    }

    public void processReadStories(final long j, final int i) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda61
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$fjjypkd1t-kGySJVbOi2WVp2hUo(NotificationsController.this, j, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$fjjypkd1t-kGySJVbOi2WVp2hUo(NotificationsController notificationsController, long j, int i) {
        boolean z;
        StoryNotification storyNotification = (StoryNotification) notificationsController.storyPushMessagesDict.get(j);
        if (storyNotification != null) {
            notificationsController.storyPushMessagesDict.remove(j);
            notificationsController.storyPushMessages.remove(storyNotification);
            notificationsController.getMessagesStorage().deleteStoryPushMessage(j);
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        while (i2 < notificationsController.pushMessages.size()) {
            MessageObject messageObject = notificationsController.pushMessages.get(i2);
            if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() <= i) {
                notificationsController.pushMessages.remove(i2);
                i2--;
                SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    notificationsController.pushMessagesDict.remove(messageObject.getDialogId());
                }
                z = true;
            }
            i2++;
        }
        if (z) {
            notificationsController.showOrUpdateNotification(false);
            notificationsController.updateStoryPushesRunnable();
        }
    }

    public void processIgnoreStories() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda56
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$sxZ2Lkjhs_92-jVazC7vsmujxbc(NotificationsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$sxZ2Lkjhs_92-jVazC7vsmujxbc(NotificationsController notificationsController) {
        boolean isEmpty = notificationsController.storyPushMessages.isEmpty();
        notificationsController.storyPushMessages.clear();
        notificationsController.storyPushMessagesDict.clear();
        notificationsController.getMessagesStorage().deleteAllStoryPushMessages();
        if (isEmpty) {
            return;
        }
        notificationsController.showOrUpdateNotification(false);
    }

    public void processIgnoreStoryReactions() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$Te7iXqov7nGXMKaqGRt6-vHJQvo(NotificationsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Te7iXqov7nGXMKaqGRt6-vHJQvo(NotificationsController notificationsController) {
        int i = 0;
        boolean z = false;
        while (i < notificationsController.pushMessages.size()) {
            MessageObject messageObject = notificationsController.pushMessages.get(i);
            if (messageObject != null && messageObject.isStoryReactionPush) {
                notificationsController.pushMessages.remove(i);
                i--;
                SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    notificationsController.pushMessagesDict.remove(messageObject.getDialogId());
                }
                z = true;
            }
            i++;
        }
        notificationsController.getMessagesStorage().deleteAllStoryReactionPushMessages();
        if (z) {
            notificationsController.showOrUpdateNotification(false);
        }
    }

    public void processIgnoreStories(final long j) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda39
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$067jPUUJzWnsuAGI2YHwwJBOB_o(NotificationsController.this, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$067jPUUJzWnsuAGI2YHwwJBOB_o(NotificationsController notificationsController, long j) {
        boolean isEmpty = notificationsController.storyPushMessages.isEmpty();
        notificationsController.storyPushMessages.clear();
        notificationsController.storyPushMessagesDict.clear();
        notificationsController.getMessagesStorage().deleteStoryPushMessage(j);
        if (isEmpty) {
            return;
        }
        notificationsController.showOrUpdateNotification(false);
    }

    public void processReadMessages(final LongSparseIntArray longSparseIntArray, final long j, final int i, final int i2, final boolean z) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda72
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$eCNzlLQuAUYTZ4ml7Mm4KVdbI_c(NotificationsController.this, longSparseIntArray, arrayList, j, i2, i, z);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$eCNzlLQuAUYTZ4ml7Mm4KVdbI_c(final NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, final ArrayList arrayList, long j, int i, int i2, boolean z) {
        long j2;
        SparseArray sparseArray;
        long j3;
        long j4;
        notificationsController.getClass();
        long j5 = 0;
        if (longSparseIntArray != null) {
            for (int i3 = 0; i3 < longSparseIntArray.size(); i3++) {
                long keyAt = longSparseIntArray.keyAt(i3);
                int i4 = longSparseIntArray.get(keyAt);
                int i5 = 0;
                while (i5 < notificationsController.pushMessages.size()) {
                    MessageObject messageObject = notificationsController.pushMessages.get(i5);
                    if (messageObject.messageOwner.from_scheduled || messageObject.getDialogId() != keyAt || messageObject.getId() > i4 || messageObject.isStoryReactionPush) {
                        j3 = j5;
                    } else {
                        if (notificationsController.isPersonalMessage(messageObject)) {
                            notificationsController.personalCount--;
                        }
                        arrayList.add(messageObject);
                        if (messageObject.isStoryReactionPush) {
                            j4 = messageObject.getDialogId();
                        } else {
                            long j6 = messageObject.messageOwner.peer_id.channel_id;
                            j4 = j6 != j5 ? -j6 : j5;
                        }
                        SparseArray sparseArray2 = (SparseArray) notificationsController.pushMessagesDict.get(j4);
                        j3 = j5;
                        if (sparseArray2 != null) {
                            sparseArray2.remove(messageObject.getId());
                            if (sparseArray2.size() == 0) {
                                notificationsController.pushMessagesDict.remove(j4);
                            }
                        }
                        notificationsController.delayedPushMessages.remove(messageObject);
                        notificationsController.pushMessages.remove(i5);
                        i5--;
                    }
                    i5++;
                    j5 = j3;
                }
            }
        }
        long j7 = j5;
        if (j != j7 && (i != 0 || i2 != 0)) {
            int i6 = 0;
            while (i6 < notificationsController.pushMessages.size()) {
                MessageObject messageObject2 = notificationsController.pushMessages.get(i6);
                if (messageObject2.getDialogId() == j && !messageObject2.isStoryReactionPush) {
                    if (i2 != 0) {
                        if (messageObject2.messageOwner.date > i2) {
                        }
                        if (notificationsController.isPersonalMessage(messageObject2)) {
                            notificationsController.personalCount--;
                        }
                        if (messageObject2.isStoryReactionPush) {
                            j2 = messageObject2.getDialogId();
                        } else {
                            long j8 = messageObject2.messageOwner.peer_id.channel_id;
                            j2 = j8 != j7 ? -j8 : j7;
                        }
                        sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(j2);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject2.getId());
                            if (sparseArray.size() == 0) {
                                notificationsController.pushMessagesDict.remove(j2);
                            }
                        }
                        notificationsController.pushMessages.remove(i6);
                        notificationsController.delayedPushMessages.remove(messageObject2);
                        arrayList.add(messageObject2);
                        i6--;
                    } else if (!z) {
                        if (messageObject2.getId() > i && i >= 0) {
                        }
                        if (notificationsController.isPersonalMessage(messageObject2)) {
                        }
                        if (messageObject2.isStoryReactionPush) {
                        }
                        sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(j2);
                        if (sparseArray != null) {
                        }
                        notificationsController.pushMessages.remove(i6);
                        notificationsController.delayedPushMessages.remove(messageObject2);
                        arrayList.add(messageObject2);
                        i6--;
                    } else {
                        if (messageObject2.getId() != i && i >= 0) {
                        }
                        if (notificationsController.isPersonalMessage(messageObject2)) {
                        }
                        if (messageObject2.isStoryReactionPush) {
                        }
                        sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(j2);
                        if (sparseArray != null) {
                        }
                        notificationsController.pushMessages.remove(i6);
                        notificationsController.delayedPushMessages.remove(messageObject2);
                        arrayList.add(messageObject2);
                        i6--;
                    }
                }
                i6++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$ok-gPiAtDPWzWvHm3PnDTT_MEmc(NotificationsController.this, arrayList);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$ok-gPiAtDPWzWvHm3PnDTT_MEmc(NotificationsController notificationsController, ArrayList arrayList) {
        notificationsController.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            notificationsController.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda79
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$EII47SQDShx1ozUZ9S58yICptT8(NotificationsController.this, longSparseArray);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$EII47SQDShx1ozUZ9S58yICptT8(NotificationsController notificationsController, LongSparseArray longSparseArray) {
        long j;
        notificationsController.getClass();
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
                SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(j);
                if (sparseArray == null) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.get(messageObject.getId());
                if (messageObject2 != null && (messageObject2.isReactionPush || messageObject2.isStoryReactionPush)) {
                    messageObject2 = null;
                }
                if (messageObject2 != null) {
                    sparseArray.put(messageObject.getId(), messageObject);
                    int indexOf = notificationsController.pushMessages.indexOf(messageObject2);
                    if (indexOf >= 0) {
                        notificationsController.pushMessages.set(indexOf, messageObject);
                    }
                    int indexOf2 = notificationsController.delayedPushMessages.indexOf(messageObject2);
                    if (indexOf2 >= 0) {
                        notificationsController.delayedPushMessages.set(indexOf2, messageObject);
                    }
                    z = true;
                }
            }
        }
        if (z) {
            notificationsController.showOrUpdateNotification(false);
        }
    }

    public void processNewMessages(final ArrayList<MessageObject> arrayList, boolean z, boolean z2, final CountDownLatch countDownLatch) {
        final boolean z3;
        final boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationsController: processNewMessages msgs.size()=");
            sb.append(arrayList == null ? "null" : Integer.valueOf(arrayList.size()));
            sb.append(" isLast=");
            z3 = z;
            sb.append(z3);
            sb.append(" isFcm=");
            z4 = z2;
            sb.append(z4);
            sb.append(")");
            FileLog.d(sb.toString());
        } else {
            z3 = z;
            z4 = z2;
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
                            ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                TLRPC.Peer peer = arrayList2.get(i2);
                                i2++;
                                hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                            }
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                long longValue = ((Long) it.next()).longValue();
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
            final ArrayList arrayList3 = new ArrayList(0);
            notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda70
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.$r8$lambda$UcsHZKcLFLi3UyXgliaorOBH9cA(NotificationsController.this, arrayList, arrayList3, z4, z3, countDownLatch);
                }
            });
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$UcsHZKcLFLi3UyXgliaorOBH9cA(NotificationsController notificationsController, ArrayList arrayList, final ArrayList arrayList2, boolean z, boolean z2, CountDownLatch countDownLatch) {
        boolean z3;
        Integer num;
        boolean z4;
        int i;
        boolean z5;
        long j;
        long j2;
        SharedPreferences sharedPreferences;
        long j3;
        long j4;
        int i2;
        String str;
        boolean z6;
        SharedPreferences sharedPreferences2;
        boolean z7;
        boolean z8;
        long j5;
        MessageObject messageObject;
        SparseArray sparseArray;
        long j6;
        final NotificationsController notificationsController2 = notificationsController;
        ArrayList arrayList3 = arrayList;
        notificationsController2.getClass();
        LongSparseArray longSparseArray = new LongSparseArray();
        SharedPreferences notificationsSettings = notificationsController2.getAccountInstance().getNotificationsSettings();
        boolean z9 = notificationsSettings.getBoolean("PinnedMessages", true);
        int i3 = 0;
        boolean z10 = false;
        int i4 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (i3 < arrayList3.size()) {
            MessageObject messageObject2 = (MessageObject) arrayList3.get(i3);
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
                z4 = z9;
                i = i3;
                notificationsSettings = sharedPreferences;
                i3 = i + 1;
                arrayList3 = arrayList;
                z9 = z4;
            }
            if (!MessageObject.isTopicActionMessage(messageObject2)) {
                if (messageObject2.isStoryPush) {
                    long currentTimeMillis = messageObject2.messageOwner == null ? System.currentTimeMillis() : r3.date * 1000;
                    long dialogId = messageObject2.getDialogId();
                    int id = messageObject2.getId();
                    StoryNotification storyNotification = (StoryNotification) notificationsController2.storyPushMessagesDict.get(dialogId);
                    if (storyNotification != null) {
                        storyNotification.dateByIds.put(Integer.valueOf(id), new Pair<>(Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis + 86400000)));
                        boolean z14 = storyNotification.hidden;
                        boolean z15 = messageObject2.isStoryPushHidden;
                        if (z14 != z15) {
                            storyNotification.hidden = z15;
                            z13 = true;
                        }
                        storyNotification.date = storyNotification.getLeastDate();
                        notificationsController2.getMessagesStorage().putStoryPushMessage(storyNotification);
                        z11 = true;
                    } else {
                        StoryNotification storyNotification2 = new StoryNotification(dialogId, messageObject2.localName, id, currentTimeMillis);
                        storyNotification2.hidden = messageObject2.isStoryPushHidden;
                        notificationsController2.storyPushMessages.add(storyNotification2);
                        notificationsController2.storyPushMessagesDict.put(dialogId, storyNotification2);
                        notificationsController2.getMessagesStorage().putStoryPushMessage(storyNotification2);
                        z10 = true;
                        z13 = true;
                    }
                    Collections.sort(notificationsController2.storyPushMessages, Comparator$-CC.comparingLong(new ToLongFunction() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda46
                        @Override // java.util.function.ToLongFunction
                        public final long applyAsLong(Object obj) {
                            long j7;
                            j7 = ((NotificationsController.StoryNotification) obj).date;
                            return j7;
                        }
                    }));
                    z4 = z9;
                    i = i3;
                } else {
                    if (messageObject2.isOauthPush) {
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        if (message2 != null) {
                            final int i5 = message2.id;
                            z4 = z9;
                            long j7 = message2.date + 60;
                            i = i3;
                            long currentTime = ConnectionsManager.getInstance(notificationsController2.currentAccount).getCurrentTime();
                            if (currentTime <= j7) {
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda47
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        NotificationsController.$r8$lambda$uCWKZm0vi9uhobwlW5cR7HSaokI(NotificationsController.this, i5);
                                    }
                                }, (j7 - currentTime) * 1000);
                            }
                            sharedPreferences = notificationsSettings;
                            notificationsSettings = sharedPreferences;
                        }
                        sharedPreferences = notificationsSettings;
                        z4 = z9;
                        i = i3;
                        notificationsSettings = sharedPreferences;
                    } else {
                        z4 = z9;
                        i = i3;
                    }
                    int id2 = messageObject2.getId();
                    long j8 = messageObject2.isFcmMessage() ? messageObject2.messageOwner.random_id : 0L;
                    long dialogId2 = messageObject2.getDialogId();
                    if (messageObject2.isFcmMessage()) {
                        z5 = messageObject2.localChannel;
                    } else {
                        if (DialogObject.isChatDialog(dialogId2)) {
                            TLRPC.Chat chat = notificationsController2.getMessagesController().getChat(Long.valueOf(-dialogId2));
                            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                                z5 = true;
                            }
                        }
                        z5 = false;
                    }
                    if (messageObject2.isStoryReactionPush) {
                        j = messageObject2.getDialogId();
                    } else {
                        long j9 = messageObject2.messageOwner.peer_id.channel_id;
                        j = j9 != 0 ? -j9 : 0L;
                    }
                    SparseArray sparseArray2 = (SparseArray) notificationsController2.pushMessagesDict.get(j);
                    MessageObject messageObject3 = sparseArray2 != null ? (MessageObject) sparseArray2.get(id2) : null;
                    SharedPreferences sharedPreferences3 = notificationsSettings;
                    if (messageObject3 == null) {
                        j2 = j8;
                        long j10 = messageObject2.messageOwner.random_id;
                        if (j10 != 0 && (messageObject3 = (MessageObject) notificationsController2.fcmRandomMessagesDict.get(j10)) != null) {
                            notificationsController2.fcmRandomMessagesDict.remove(messageObject2.messageOwner.random_id);
                        }
                    } else {
                        j2 = j8;
                    }
                    MessageObject messageObject4 = messageObject3;
                    if (messageObject4 != null) {
                        if (messageObject4.isFcmMessage()) {
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                notificationsController2.pushMessagesDict.put(j, sparseArray2);
                            }
                            sparseArray2.put(id2, messageObject2);
                            int indexOf = notificationsController2.pushMessages.indexOf(messageObject4);
                            if (indexOf >= 0) {
                                notificationsController2.pushMessages.set(indexOf, messageObject2);
                                j6 = j;
                                i4 = notificationsController2.addToPopupMessages(arrayList2, messageObject2, dialogId2, z5, sharedPreferences3);
                                notificationsSettings = sharedPreferences3;
                            } else {
                                j6 = j;
                                notificationsSettings = sharedPreferences3;
                            }
                            if (z && (z11 = messageObject2.localEdit)) {
                                notificationsController2.getMessagesStorage().putPushMessage(messageObject2);
                            }
                        } else {
                            j6 = j;
                            notificationsSettings = sharedPreferences3;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + j6 + ", mid=" + id2);
                        }
                    } else {
                        notificationsSettings = sharedPreferences3;
                        long j11 = j;
                        boolean z16 = z5;
                        if (z11) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("skipped message because edited");
                            }
                            sharedPreferences = notificationsSettings;
                            notificationsSettings = sharedPreferences;
                        } else {
                            if (z && !messageObject2.isOauthPush) {
                                notificationsController2.getMessagesStorage().putPushMessage(messageObject2);
                            }
                            sharedPreferences = notificationsSettings;
                            long topicId = MessageObject.getTopicId(notificationsController2.currentAccount, messageObject2.messageOwner, notificationsController2.getMessagesController().isForum(messageObject2));
                            if (dialogId2 == notificationsController2.openedDialogId && ApplicationLoader.isScreenOn && !messageObject2.isStoryReactionPush && !messageObject2.isOauthPush) {
                                if (!z) {
                                    notificationsController2.playInChatSound();
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("skipped message because chat is already opened (openedDialogId = " + notificationsController2.openedDialogId + ")");
                                }
                            } else {
                                TLRPC.Message message3 = messageObject2.messageOwner;
                                if (!message3.mentioned) {
                                    j3 = dialogId2;
                                } else if (!z4 && (message3.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("skipped message because message is mention of pinned");
                                    }
                                } else {
                                    j3 = messageObject2.getFromChatId();
                                }
                                if (notificationsController2.isPersonalMessage(messageObject2)) {
                                    notificationsController2.personalCount++;
                                }
                                DialogObject.isChatDialog(j3);
                                int indexOfKey = longSparseArray.indexOfKey(j3);
                                if (indexOfKey >= 0 && topicId == 0) {
                                    z8 = ((Boolean) longSparseArray.valueAt(indexOfKey)).booleanValue();
                                    j4 = dialogId2;
                                    i2 = i4;
                                    sharedPreferences2 = sharedPreferences;
                                    str = ")";
                                    z6 = z11;
                                } else {
                                    j4 = dialogId2;
                                    i2 = i4;
                                    long j12 = j3;
                                    str = ")";
                                    z6 = z11;
                                    int notifyOverride = notificationsController2.getNotifyOverride(sharedPreferences, j12, topicId);
                                    sharedPreferences2 = sharedPreferences;
                                    topicId = topicId;
                                    if (notifyOverride == -1) {
                                        j3 = j12;
                                        z7 = notificationsController.isGlobalNotificationsEnabled(j3, Boolean.valueOf(z16), messageObject2.isReactionPush, messageObject2.isStoryReactionPush);
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + j3 + ", " + z16 + ", " + messageObject2.isReactionPush + ", " + messageObject2.isStoryReactionPush + ") = " + z7);
                                        }
                                    } else {
                                        j3 = j12;
                                        z7 = notifyOverride != 2;
                                    }
                                    longSparseArray.put(j3, Boolean.valueOf(z7));
                                    z8 = z7;
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("NotificationsController: process new messages, value is " + z8 + " (" + j3 + ", " + z16 + ", " + messageObject2.isReactionPush + ", " + messageObject2.isStoryReactionPush + str);
                                }
                                notificationsController2 = notificationsController;
                                if (z8) {
                                    if (z) {
                                        j5 = j3;
                                        messageObject = messageObject2;
                                        notificationsSettings = sharedPreferences2;
                                        i4 = i2;
                                    } else {
                                        long j13 = j3;
                                        messageObject = messageObject2;
                                        SharedPreferences sharedPreferences4 = sharedPreferences2;
                                        i4 = notificationsController2.addToPopupMessages(arrayList2, messageObject, j13, z16, sharedPreferences4);
                                        j5 = j13;
                                        notificationsSettings = sharedPreferences4;
                                    }
                                    if (!z12) {
                                        z12 = messageObject.messageOwner.from_scheduled;
                                    }
                                    notificationsController2.delayedPushMessages.add(messageObject);
                                    notificationsController2.appendMessage(messageObject);
                                    if (id2 != 0) {
                                        if (sparseArray2 == null) {
                                            sparseArray = new SparseArray();
                                            notificationsController2.pushMessagesDict.put(j11, sparseArray);
                                        } else {
                                            sparseArray = sparseArray2;
                                        }
                                        sparseArray.put(id2, messageObject);
                                    } else if (j2 != 0) {
                                        notificationsController2.fcmRandomMessagesDict.put(j2, messageObject);
                                    }
                                    long j14 = j4;
                                    if (j14 != j5) {
                                        Integer num2 = (Integer) notificationsController2.pushDialogsOverrideMention.get(j14);
                                        notificationsController2.pushDialogsOverrideMention.put(j14, Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1));
                                    }
                                } else {
                                    j5 = j3;
                                    messageObject = messageObject2;
                                    notificationsSettings = sharedPreferences2;
                                    i4 = i2;
                                }
                                if (messageObject.isReactionPush) {
                                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                    sparseBooleanArray.put(id2, true);
                                    notificationsController2.getMessagesController().checkUnreadReactions(j5, topicId, sparseBooleanArray);
                                }
                                z11 = z6;
                                z10 = true;
                            }
                            notificationsSettings = sharedPreferences;
                        }
                    }
                }
                i3 = i + 1;
                arrayList3 = arrayList;
                z9 = z4;
            }
            if (BuildVars.LOGS_ENABLED) {
            }
            sharedPreferences = notificationsSettings;
            z4 = z9;
            i = i3;
            notificationsSettings = sharedPreferences;
            i3 = i + 1;
            arrayList3 = arrayList;
            z9 = z4;
        }
        final int i6 = i4;
        boolean z17 = z11;
        if (z10) {
            notificationsController2.notifyCheck = z2;
        }
        if (!arrayList2.isEmpty() && !AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda48
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.$r8$lambda$bUCpxV4xLTOCbOHcVuSRPm214lI(NotificationsController.this, arrayList2, i6);
                }
            });
        }
        if (z || z12) {
            if (z17) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + notificationsController2.notifyCheck);
                }
                notificationsController2.delayedPushMessages.clear();
                notificationsController2.showOrUpdateNotification(notificationsController2.notifyCheck);
            } else if (z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: added branch");
                }
                MessageObject messageObject5 = (MessageObject) arrayList.get(0);
                long dialogId3 = messageObject5.getDialogId();
                long topicId2 = MessageObject.getTopicId(notificationsController2.currentAccount, messageObject5.messageOwner, notificationsController2.getMessagesController().isForum(dialogId3));
                Boolean valueOf = messageObject5.isFcmMessage() ? Boolean.valueOf(messageObject5.localChannel) : null;
                int i7 = notificationsController2.total_unread_count;
                int notifyOverride2 = notificationsController2.getNotifyOverride(notificationsSettings, dialogId3, topicId2);
                if (notifyOverride2 == -1) {
                    notificationsController2 = notificationsController;
                    z3 = notificationsController2.isGlobalNotificationsEnabled(dialogId3, valueOf, messageObject5.isReactionPush, messageObject5.isStoryReactionPush);
                    dialogId3 = dialogId3;
                } else {
                    notificationsController2 = notificationsController;
                    z3 = notifyOverride2 != 2;
                }
                Integer num3 = (Integer) notificationsController2.pushDialogs.get(dialogId3);
                int intValue = num3 != null ? num3.intValue() + 1 : 1;
                if (notificationsController2.notifyCheck && !z3 && (num = (Integer) notificationsController2.pushDialogsOverrideMention.get(dialogId3)) != null && num.intValue() != 0) {
                    intValue = num.intValue();
                    z3 = true;
                }
                if (z3 && !messageObject5.isStoryPush) {
                    if (!notificationsController2.getMessagesController().isCommunity(dialogId3)) {
                        if (notificationsController2.getMessagesController().isForum(dialogId3)) {
                            int i8 = notificationsController2.total_unread_count - ((num3 == null || num3.intValue() <= 0) ? 0 : 1);
                            notificationsController2.total_unread_count = i8;
                            notificationsController2.total_unread_count = i8 + (intValue > 0 ? 1 : 0);
                        } else {
                            if (num3 != null) {
                                notificationsController2.total_unread_count -= num3.intValue();
                            }
                            notificationsController2.total_unread_count += intValue;
                        }
                    }
                    notificationsController2.pushDialogs.put(dialogId3, Integer.valueOf(intValue));
                }
                if (i7 != notificationsController2.total_unread_count || z13) {
                    notificationsController2.delayedPushMessages.clear();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("NotificationsController processNewMessages: added branch: " + notificationsController2.notifyCheck);
                    }
                    notificationsController2.showOrUpdateNotification(notificationsController2.notifyCheck);
                    final int size = notificationsController2.pushDialogs.size();
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda49
                        @Override // java.lang.Runnable
                        public final void run() {
                            NotificationsController.$r8$lambda$BpO-gJyPo1GDwY3RPWlPuboZ3ZA(NotificationsController.this, size);
                        }
                    });
                }
                notificationsController2.notifyCheck = false;
                if (notificationsController2.showBadgeNumber) {
                    notificationsController2.setBadge(notificationsController2.getTotalAllUnreadCount());
                }
            }
        }
        if (z13) {
            notificationsController2.updateStoryPushesRunnable();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static /* synthetic */ void $r8$lambda$uCWKZm0vi9uhobwlW5cR7HSaokI(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        LongSparseArray longSparseArray = new LongSparseArray();
        longSparseArray.put(0L, Lists.newArrayList(Integer.valueOf(i)));
        notificationsController.removeDeletedMessagesFromNotifications(longSparseArray, false);
    }

    public static /* synthetic */ void $r8$lambda$bUCpxV4xLTOCbOHcVuSRPm214lI(NotificationsController notificationsController, ArrayList arrayList, int i) {
        notificationsController.popupMessages.addAll(0, arrayList);
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

    public static /* synthetic */ void $r8$lambda$BpO-gJyPo1GDwY3RPWlPuboZ3ZA(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.notificationsCountUpdated, Integer.valueOf(notificationsController.currentAccount));
        notificationsController.getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$ALMGl2KEmzFLT-KmQWGOoXdAJO4(NotificationsController.this, longSparseIntArray, arrayList);
            }
        });
    }

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
    public static /* synthetic */ void $r8$lambda$ALMGl2KEmzFLT-KmQWGOoXdAJO4(final NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, final ArrayList arrayList) {
        int i;
        boolean z;
        boolean z2;
        Integer num;
        int i2 = notificationsController.total_unread_count;
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        int i3 = 0;
        while (true) {
            if (i3 >= longSparseIntArray.size()) {
                break;
            }
            long keyAt = longSparseIntArray.keyAt(i3);
            Integer num2 = (Integer) notificationsController.pushDialogs.get(keyAt);
            int i4 = longSparseIntArray.get(keyAt);
            if (DialogObject.isChatDialog(keyAt)) {
                TLRPC.Chat chat = notificationsController.getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat == null || chat.min || ChatObject.isNotInChat(chat) || ChatObject.isCommunity(chat)) {
                    i4 = 0;
                }
                if (chat != null) {
                    z = chat.forum;
                    i = i4;
                    if (!z) {
                        int notifyOverride = notificationsController.getNotifyOverride(notificationsSettings, keyAt, 0L);
                        if (notifyOverride == -1) {
                            z2 = notificationsController.isGlobalNotificationsEnabled(keyAt, false, false);
                        } else if (notifyOverride == 2) {
                            z2 = false;
                        }
                        if (notificationsController.notifyCheck && !z2 && (num = (Integer) notificationsController.pushDialogsOverrideMention.get(keyAt)) != null && num.intValue() != 0) {
                            i = num.intValue();
                            z2 = true;
                        }
                        if (i == 0) {
                            notificationsController.smartNotificationsDialogs.remove(keyAt);
                        }
                        if (i < 0) {
                            if (num2 == null) {
                                i3++;
                            } else {
                                i += num2.intValue();
                            }
                        }
                        if ((!z2 || i == 0) && num2 != null) {
                            if (notificationsController.getMessagesController().isForum(keyAt)) {
                                notificationsController.total_unread_count -= num2.intValue() > 0 ? 1 : 0;
                            } else {
                                notificationsController.total_unread_count -= num2.intValue();
                            }
                        }
                        if (i == 0) {
                            notificationsController.pushDialogs.remove(keyAt);
                            notificationsController.pushDialogsOverrideMention.remove(keyAt);
                            int i5 = 0;
                            while (i5 < notificationsController.pushMessages.size()) {
                                MessageObject messageObject = notificationsController.pushMessages.get(i5);
                                if (!messageObject.messageOwner.from_scheduled && messageObject.getDialogId() == keyAt && !messageObject.isStoryReactionPush) {
                                    if (notificationsController.isPersonalMessage(messageObject)) {
                                        notificationsController.personalCount--;
                                    }
                                    notificationsController.pushMessages.remove(i5);
                                    i5--;
                                    notificationsController.delayedPushMessages.remove(messageObject);
                                    long j = messageObject.messageOwner.peer_id.channel_id;
                                    long j2 = j != 0 ? -j : 0L;
                                    SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(j2);
                                    if (sparseArray != null) {
                                        sparseArray.remove(messageObject.getId());
                                        if (sparseArray.size() == 0) {
                                            notificationsController.pushMessagesDict.remove(j2);
                                        }
                                    }
                                    arrayList.add(messageObject);
                                }
                                i5++;
                            }
                        } else if (z2) {
                            if (!notificationsController.getMessagesController().isCommunity(keyAt)) {
                                if (notificationsController.getMessagesController().isForum(keyAt)) {
                                    notificationsController.total_unread_count += i <= 0 ? 0 : 1;
                                } else {
                                    notificationsController.total_unread_count += i;
                                }
                            }
                            notificationsController.pushDialogs.put(keyAt, Integer.valueOf(i));
                        }
                        i3++;
                    }
                    z2 = true;
                    if (notificationsController.notifyCheck) {
                        i = num.intValue();
                        z2 = true;
                    }
                    if (i == 0) {
                    }
                    if (i < 0) {
                    }
                    if (!z2) {
                    }
                    if (notificationsController.getMessagesController().isForum(keyAt)) {
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
            if (notificationsController.notifyCheck) {
            }
            if (i == 0) {
            }
            if (i < 0) {
            }
            if (!z2) {
            }
            if (notificationsController.getMessagesController().isForum(keyAt)) {
            }
            if (i == 0) {
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda29
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.$r8$lambda$w-Yml7LEGBP9OwuBBoiGkG0553g(NotificationsController.this, arrayList);
                }
            });
        }
        if (i2 != notificationsController.total_unread_count) {
            if (!notificationsController.notifyCheck) {
                notificationsController.delayedPushMessages.clear();
                notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
            } else {
                notificationsController.scheduleNotificationDelay(notificationsController.lastOnlineFromOtherDevice > notificationsController.getConnectionsManager().getCurrentTime());
            }
            final int size = notificationsController.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda30
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.$r8$lambda$kWgqnzNS4Z-r6gXPTRz6HG3Lm0Y(NotificationsController.this, size);
                }
            });
        }
        notificationsController.notifyCheck = false;
        if (notificationsController.showBadgeNumber) {
            notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        }
    }

    public static /* synthetic */ void $r8$lambda$w-Yml7LEGBP9OwuBBoiGkG0553g(NotificationsController notificationsController, ArrayList arrayList) {
        notificationsController.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            notificationsController.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$kWgqnzNS4Z-r6gXPTRz6HG3Lm0Y(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.notificationsCountUpdated, Integer.valueOf(notificationsController.currentAccount));
        notificationsController.getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void processLoadedUnreadMessages(final LongSparseArray longSparseArray, final ArrayList<TLRPC.Message> arrayList, final ArrayList<MessageObject> arrayList2, ArrayList<TLRPC.User> arrayList3, ArrayList<TLRPC.Chat> arrayList4, ArrayList<TLRPC.EncryptedChat> arrayList5, final Collection<StoryNotification> collection) {
        getMessagesController().putUsers(arrayList3, true);
        getMessagesController().putChats(arrayList4, true);
        getMessagesController().putEncryptedChats(arrayList5, true);
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$B_N0ijfPmJGf_Z8SKBJyDCbKwA8(NotificationsController.this, arrayList, longSparseArray, arrayList2, collection);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$B_N0ijfPmJGf_Z8SKBJyDCbKwA8(NotificationsController notificationsController, ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, Collection collection) {
        long j;
        boolean z;
        long j2;
        SharedPreferences sharedPreferences;
        long j3;
        boolean z2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j4;
        int i;
        TLRPC.Message message;
        long j5;
        int i2;
        long j6;
        long j7;
        TLRPC.Message message2;
        boolean z3;
        SharedPreferences sharedPreferences2;
        final NotificationsController notificationsController2 = notificationsController;
        ArrayList arrayList3 = arrayList;
        notificationsController2.pushDialogs.clear();
        notificationsController2.pushMessages.clear();
        notificationsController2.pushMessagesDict.clear();
        notificationsController2.storyPushMessages.clear();
        notificationsController2.storyPushMessagesDict.clear();
        boolean z4 = false;
        notificationsController2.total_unread_count = 0;
        notificationsController2.personalCount = 0;
        SharedPreferences notificationsSettings = notificationsController2.getAccountInstance().getNotificationsSettings();
        LongSparseArray longSparseArray2 = new LongSparseArray();
        long j8 = 0;
        if (arrayList3 != null) {
            int i3 = 0;
            while (i3 < arrayList3.size()) {
                TLRPC.Message message3 = (TLRPC.Message) arrayList3.get(i3);
                if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                    TLRPC.MessageAction messageAction = message3.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                        long j9 = message3.peer_id.channel_id;
                        long j10 = j9 != j8 ? -j9 : j8;
                        SparseArray sparseArray = (SparseArray) notificationsController2.pushMessagesDict.get(j10);
                        j4 = j8;
                        if (sparseArray == null || sparseArray.indexOfKey(message3.id) < 0) {
                            MessageObject messageObject = new MessageObject(notificationsController2.currentAccount, message3, z4, z4);
                            if (notificationsController2.isPersonalMessage(messageObject)) {
                                notificationsController2.personalCount++;
                            }
                            long dialogId = messageObject.getDialogId();
                            long topicId = MessageObject.getTopicId(notificationsController2.currentAccount, messageObject.messageOwner, notificationsController.getMessagesController().isForum(messageObject));
                            if (messageObject.messageOwner.mentioned) {
                                i = i3;
                                message = message3;
                                j5 = messageObject.getFromChatId();
                            } else {
                                i = i3;
                                message = message3;
                                j5 = dialogId;
                            }
                            int indexOfKey = longSparseArray2.indexOfKey(j5);
                            if (indexOfKey >= 0 && topicId == j4) {
                                i2 = i;
                                j6 = j10;
                                j7 = j5;
                                z3 = ((Boolean) longSparseArray2.valueAt(indexOfKey)).booleanValue();
                                message2 = message;
                                notificationsController2 = notificationsController;
                            } else {
                                i2 = i;
                                j6 = j10;
                                TLRPC.Message message4 = message;
                                notificationsController2 = notificationsController;
                                int notifyOverride = notificationsController2.getNotifyOverride(notificationsSettings, j5, topicId);
                                j7 = j5;
                                if (notifyOverride == -1) {
                                    z3 = notificationsController2.isGlobalNotificationsEnabled(j7, messageObject.isReactionPush, messageObject.isStoryReactionPush);
                                    message2 = message4;
                                } else {
                                    message2 = message4;
                                    z3 = notifyOverride != 2;
                                }
                                longSparseArray2.put(j7, Boolean.valueOf(z3));
                            }
                            sharedPreferences2 = notificationsSettings;
                            if (z3 && (j7 != notificationsController2.openedDialogId || !ApplicationLoader.isScreenOn)) {
                                if (sparseArray == null) {
                                    sparseArray = new SparseArray();
                                    notificationsController2.pushMessagesDict.put(j6, sparseArray);
                                }
                                sparseArray.put(message2.id, messageObject);
                                notificationsController2.appendMessage(messageObject);
                                if (dialogId != j7) {
                                    Integer num = (Integer) notificationsController2.pushDialogsOverrideMention.get(dialogId);
                                    notificationsController2.pushDialogsOverrideMention.put(dialogId, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                                }
                            }
                        } else {
                            sharedPreferences2 = notificationsSettings;
                            i2 = i3;
                        }
                        i3 = i2 + 1;
                        arrayList3 = arrayList;
                        notificationsSettings = sharedPreferences2;
                        j8 = j4;
                        z4 = false;
                    }
                }
                sharedPreferences2 = notificationsSettings;
                i2 = i3;
                j4 = j8;
                i3 = i2 + 1;
                arrayList3 = arrayList;
                notificationsSettings = sharedPreferences2;
                j8 = j4;
                z4 = false;
            }
        }
        SharedPreferences sharedPreferences3 = notificationsSettings;
        long j11 = j8;
        int i4 = 0;
        while (i4 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i4);
            int indexOfKey2 = longSparseArray2.indexOfKey(keyAt);
            if (indexOfKey2 >= 0) {
                j3 = keyAt;
                z2 = ((Boolean) longSparseArray2.valueAt(indexOfKey2)).booleanValue();
                sharedPreferences = sharedPreferences3;
            } else {
                sharedPreferences = sharedPreferences3;
                int notifyOverride2 = notificationsController2.getNotifyOverride(sharedPreferences, keyAt, 0L);
                j3 = keyAt;
                if (notifyOverride2 == -1) {
                    z2 = notificationsController2.isGlobalNotificationsEnabled(j3, false, false);
                } else {
                    z2 = notifyOverride2 != 2;
                }
                longSparseArray2.put(j3, Boolean.valueOf(z2));
            }
            if (z2) {
                Integer num2 = (Integer) longSparseArray.valueAt(i4);
                int intValue = num2.intValue();
                notificationsController2.pushDialogs.put(j3, num2);
                if (!notificationsController2.getMessagesController().isCommunity(j3)) {
                    if (notificationsController2.getMessagesController().isForum(j3)) {
                        notificationsController2.total_unread_count += intValue > 0 ? 1 : 0;
                    } else {
                        notificationsController2.total_unread_count += intValue;
                    }
                }
            }
            i4++;
            sharedPreferences3 = sharedPreferences;
        }
        SharedPreferences sharedPreferences4 = sharedPreferences3;
        if (arrayList2 != null) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i5);
                int id = messageObject2.getId();
                if (notificationsController2.pushMessagesDict.indexOfKey(id) < 0) {
                    if (notificationsController2.isPersonalMessage(messageObject2)) {
                        notificationsController2.personalCount++;
                    }
                    long dialogId2 = messageObject2.getDialogId();
                    long topicId2 = MessageObject.getTopicId(notificationsController2.currentAccount, messageObject2.messageOwner, notificationsController2.getMessagesController().isForum(messageObject2));
                    TLRPC.Message message5 = messageObject2.messageOwner;
                    long j12 = message5.random_id;
                    long fromChatId = message5.mentioned ? messageObject2.getFromChatId() : dialogId2;
                    int indexOfKey3 = longSparseArray2.indexOfKey(fromChatId);
                    if (indexOfKey3 >= 0 && topicId2 == j11) {
                        z = ((Boolean) longSparseArray2.valueAt(indexOfKey3)).booleanValue();
                        j = fromChatId;
                    } else {
                        int notifyOverride3 = notificationsController2.getNotifyOverride(sharedPreferences4, fromChatId, topicId2);
                        j = fromChatId;
                        if (notifyOverride3 == -1) {
                            z = notificationsController2.isGlobalNotificationsEnabled(j, messageObject2.isReactionPush, messageObject2.isStoryReactionPush);
                        } else {
                            z = notifyOverride3 != 2;
                        }
                        longSparseArray2.put(j, Boolean.valueOf(z));
                    }
                    if (z && (j != notificationsController2.openedDialogId || !ApplicationLoader.isScreenOn)) {
                        if (id != 0) {
                            if (messageObject2.isStoryReactionPush) {
                                j2 = messageObject2.getDialogId();
                            } else {
                                long j13 = messageObject2.messageOwner.peer_id.channel_id;
                                j2 = j13 != j11 ? -j13 : j11;
                            }
                            SparseArray sparseArray2 = (SparseArray) notificationsController2.pushMessagesDict.get(j2);
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                notificationsController2.pushMessagesDict.put(j2, sparseArray2);
                            }
                            sparseArray2.put(id, messageObject2);
                        } else if (j12 != j11) {
                            notificationsController2.fcmRandomMessagesDict.put(j12, messageObject2);
                        }
                        notificationsController2.appendMessage(messageObject2);
                        if (dialogId2 != j) {
                            Integer num3 = (Integer) notificationsController2.pushDialogsOverrideMention.get(dialogId2);
                            notificationsController2.pushDialogsOverrideMention.put(dialogId2, Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1));
                        }
                        Integer num4 = (Integer) notificationsController2.pushDialogs.get(j);
                        int intValue2 = num4 != null ? num4.intValue() + 1 : 1;
                        if (!notificationsController2.getMessagesController().isCommunity(j)) {
                            if (notificationsController2.getMessagesController().isForum(j)) {
                                if (num4 != null) {
                                    notificationsController2.total_unread_count -= num4.intValue() > 0 ? 1 : 0;
                                }
                                notificationsController2.total_unread_count += intValue2 > 0 ? 1 : 0;
                            } else {
                                if (num4 != null) {
                                    notificationsController2.total_unread_count -= num4.intValue();
                                }
                                notificationsController2.total_unread_count += intValue2;
                            }
                        }
                        notificationsController2.pushDialogs.put(j, Integer.valueOf(intValue2));
                    }
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                StoryNotification storyNotification = (StoryNotification) it.next();
                long j14 = storyNotification.dialogId;
                StoryNotification storyNotification2 = (StoryNotification) notificationsController2.storyPushMessagesDict.get(j14);
                if (storyNotification2 != null) {
                    storyNotification2.dateByIds.putAll(storyNotification.dateByIds);
                } else {
                    notificationsController2.storyPushMessages.add(storyNotification);
                    notificationsController2.storyPushMessagesDict.put(j14, storyNotification);
                }
            }
            Collections.sort(notificationsController2.storyPushMessages, Comparator$-CC.comparingLong(new ToLongFunction() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda54
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long j15;
                    j15 = ((NotificationsController.StoryNotification) obj).date;
                    return j15;
                }
            }));
        }
        final int size = notificationsController2.pushDialogs.size();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda55
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$RyBK0Nfd-MZ-xyaUBSyeUzVqpw0(NotificationsController.this, size);
            }
        });
        notificationsController2.showOrUpdateNotification(SystemClock.elapsedRealtime() / 1000 < 60);
        if (notificationsController2.showBadgeNumber) {
            notificationsController2.setBadge(notificationsController2.getTotalAllUnreadCount());
        }
    }

    public static /* synthetic */ void $r8$lambda$RyBK0Nfd-MZ-xyaUBSyeUzVqpw0(NotificationsController notificationsController, int i) {
        if (notificationsController.total_unread_count == 0) {
            notificationsController.popupMessages.clear();
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.notificationsCountUpdated, Integer.valueOf(notificationsController.currentAccount));
        notificationsController.getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
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
                                    if (dialog != null && DialogObject.isChatDialog(dialog.id)) {
                                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-dialog.id));
                                        if (!ChatObject.isNotInChat(chat)) {
                                            if (ChatObject.isCommunity(chat)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
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
                                if (DialogObject.isChatDialog(dialog2.id)) {
                                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-dialog2.id));
                                    if (!ChatObject.isNotInChat(chat2)) {
                                        if (ChatObject.isCommunity(chat2)) {
                                        }
                                    }
                                }
                                if (MessagesController.getInstance(i2).getDialogUnreadCount(dialog2) != 0) {
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

    public void updateBadge() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda57
            @Override // java.lang.Runnable
            public final void run() {
                r0.setBadge(NotificationsController.this.getTotalAllUnreadCount());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(int i) {
        if (this.lastBadgeCount == i) {
            return;
        }
        FileLog.d("setBadge " + i);
        this.lastBadgeCount = i;
        NotificationBadge.applyCount(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0222, code lost:
    
        if (r7.getBoolean("EnablePreviewAll", true) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x023a, code lost:
    
        r2 = r30.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x024c, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageService) == false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x024e, code lost:
    
        r31[0] = r25;
        r2 = r2.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0254, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetSameChatWallPaper) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.WallpaperSameNotification);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x025f, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatWallPaper) == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0267, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.WallpaperNotification);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x026a, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGeoProximityReached) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0272, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0275, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0279, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionContactSignUp) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0280, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserUpdatedPhoto) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x028d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationContactNewPhoto, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0290, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionLoginUnknownLocation) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0292, code lost:
    
        r2 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.formatDateAtTime, org.telegram.messenger.LocaleController.getInstance().getFormatterYear().format(r30.messageOwner.date * 1000), org.telegram.messenger.LocaleController.getInstance().getFormatterDay().format(r30.messageOwner.date * 1000));
        r3 = org.telegram.messenger.R.string.NotificationUnrecognizedDevice;
        r4 = getUserConfig().getCurrentUser().first_name;
        r1 = r30.messageOwner.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02f0, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r3, r4, r2, r1.title, r1.address);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032b, code lost:
    
        if (org.telegram.messenger.utils.tlutils.TlUtils.isInstance(r2, org.telegram.tgnet.TLRPC.TL_messageActionGameScore.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSent.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSentMe.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGift.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftPremium.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesPrice.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesRefunded.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftTon.class) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0333, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0334, code lost:
    
        r2 = r30.messageOwner;
        r3 = r2.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033a, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPhoneCall) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x033e, code lost:
    
        if (r3.video == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0346, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageVideoIncomingMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x034d, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageIncomingMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0350, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionConferenceCall) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0354, code lost:
    
        if (r3.video == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x035c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageVideoIncomingConferenceMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0363, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageIncomingConferenceMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x036a, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatAddUser) == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x036c, code lost:
    
        r7 = r3.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0370, code lost:
    
        if (r7 != 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0379, code lost:
    
        if (r3.users.size() != 1) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x037b, code lost:
    
        r7 = r30.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x038e, code lost:
    
        if (r7 == 0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0398, code lost:
    
        if (r30.messageOwner.peer_id.channel_id == 0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x039c, code lost:
    
        if (r5.megagroup != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03b3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelAddedByNotification, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03bb, code lost:
    
        if (r7 != r22) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03cd, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroup, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03ce, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03da, code lost:
    
        if (r1 != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03dc, code lost:
    
        return r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03e1, code lost:
    
        if (r14 != r1.id) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03e5, code lost:
    
        if (r5.megagroup == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03fc, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelfMega, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0412, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelf, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x042f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r6, getTitle(r5), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0430, code lost:
    
        r2 = new java.lang.StringBuilder();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0440, code lost:
    
        if (r3 >= r30.messageOwner.action.users.size()) goto L918;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0442, code lost:
    
        r7 = getMessagesController().getUser(r30.messageOwner.action.users.get(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0456, code lost:
    
        if (r7 == null) goto L920;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0458, code lost:
    
        r7 = org.telegram.messenger.UserObject.getUserName(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0460, code lost:
    
        if (r2.length() == 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0462, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0465, code lost:
    
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0468, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0489, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r6, getTitle(r5), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x048c, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCall) == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0490, code lost:
    
        if (r3.duration == 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04a7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupEndedCall, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04bd, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupCreatedCall, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04c0, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCallScheduled) == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04c8, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04cb, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionInviteToGroupCall) == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04cd, code lost:
    
        r7 = r3.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04d1, code lost:
    
        if (r7 != 0) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04da, code lost:
    
        if (r3.users.size() != 1) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04dc, code lost:
    
        r7 = r30.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04ef, code lost:
    
        if (r7 == 0) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04f3, code lost:
    
        if (r7 != r22) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x050a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedYouToCall, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x050b, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0517, code lost:
    
        if (r1 != null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0519, code lost:
    
        return r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0537, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r6, getTitle(r5), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0538, code lost:
    
        r2 = new java.lang.StringBuilder();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0548, code lost:
    
        if (r3 >= r30.messageOwner.action.users.size()) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x054a, code lost:
    
        r7 = getMessagesController().getUser(r30.messageOwner.action.users.get(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x055e, code lost:
    
        if (r7 == null) goto L923;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0560, code lost:
    
        r7 = org.telegram.messenger.UserObject.getUserName(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0568, code lost:
    
        if (r2.length() == 0) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x056a, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x056d, code lost:
    
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0570, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0592, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r6, getTitle(r5), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0595, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x059d, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingReceivedGiftNoName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x05a0, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByLink) == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x05b7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroupByLink, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x05bf, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditTitle) == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x05cf, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupName, r6, r3.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x05d2, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditPhoto) != false) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05d6, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeletePhoto) == false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x05dc, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeleteUser) == false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x05de, code lost:
    
        r2 = r3.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x05e2, code lost:
    
        if (r2 != r22) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x05f9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickYou, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0601, code lost:
    
        if (r2 != r14) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0613, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupLeftMember, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0614, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r30.messageOwner.action.user_id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0626, code lost:
    
        if (r1 != null) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0628, code lost:
    
        return r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0646, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickMember, r6, getTitle(r5), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0649, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatCreate) == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0651, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0654, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelCreate) == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x065c, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x065f, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatMigrateTo) == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0672, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0678, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0686, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, r3.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0689, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionScreenshotTaken) == false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0691, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0694, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayLaunch) == false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x069c, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x069f, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayResults) == false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06a7, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x06aa, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSuggestBirthday) == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x06b2, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x06b5, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPinMessage) == false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x06bb, code lost:
    
        if (r5 == null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x06c1, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r5) == false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x06c5, code lost:
    
        if (r5.megagroup == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x06cc, code lost:
    
        r1 = r30.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x06ce, code lost:
    
        if (r1 != null) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x06e5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x06ef, code lost:
    
        if (r1.isMusic() == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0701, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusic, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0706, code lost:
    
        if (r1.isVideo() == false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0710, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x073d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r6, "📹 " + r1.messageOwner.message, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0753, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideo, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0758, code lost:
    
        if (r1.isGif() == false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0762, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x078f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r6, "🎬 " + r1.messageOwner.message, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x07a5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGif, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x07af, code lost:
    
        if (r1.isVoice() == false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x07c1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoice, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x07c6, code lost:
    
        if (r1.isRoundVideo() == false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x07d8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRound, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x07dd, code lost:
    
        if (r1.isSticker() != false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x07e3, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x07e9, code lost:
    
        r4 = r1.messageOwner;
        r8 = r4.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x07ef, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x07f7, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0824, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r6, "📎 " + r1.messageOwner.message, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x083a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFile, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x083d, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0841, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x084a, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0861, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLive, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0864, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0866, code lost:
    
        r8 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0889, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContact2, r6, getTitle(r5), org.telegram.messenger.ContactsController.formatName(r8.first_name, r8.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x088c, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x088e, code lost:
    
        r8 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0894, code lost:
    
        if (r8.poll.quiz == false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x08b5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuiz2, r6, getTitle(r5), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x08d5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPoll2, r6, getTitle(r5), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x08d8, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x08fb, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodo2, r6, getTitle(r5), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r8).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08fe, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0906, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0933, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r6, "🖼 " + r1.messageOwner.message, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0949, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhoto, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0951, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0963, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGame, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0964, code lost:
    
        r4 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0966, code lost:
    
        if (r4 == null) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x096c, code lost:
    
        if (r4.length() <= 0) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x096e, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0974, code lost:
    
        if (r1.length() <= 20) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0976, code lost:
    
        r4 = new java.lang.StringBuilder();
        r8 = 0;
        r4.append((java.lang.Object) r1.subSequence(0, 20));
        r4.append("...");
        r1 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x098c, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedText;
        r3 = getTitle(r5);
        r4 = new java.lang.Object[3];
        r4[r8] = r6;
        r4[1] = r1;
        r4[2] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x09a1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x098b, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x09b5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x09c6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeo, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x09c7, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x09cb, code lost:
    
        if (r1 == null) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x09e1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmoji, r6, getTitle(r5), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x09f3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedSticker, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x09f4, code lost:
    
        if (r5 == null) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x09f6, code lost:
    
        r1 = r30.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x09f8, code lost:
    
        if (r1 != null) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0a08, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0a0d, code lost:
    
        if (r1.isMusic() == false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0a1d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0a22, code lost:
    
        if (r1.isVideo() == false) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0a2c, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0a55, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r5), "📹 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a67, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0a6c, code lost:
    
        if (r1.isGif() == false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0a76, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0a9f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r5), "🎬 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0ab1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0ab9, code lost:
    
        if (r1.isVoice() == false) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0ac9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0ace, code lost:
    
        if (r1.isRoundVideo() == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0ade, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0ae3, code lost:
    
        if (r1.isSticker() != false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0ae9, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0aef, code lost:
    
        r4 = r1.messageOwner;
        r6 = r4.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0af5, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0afd, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0b26, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r5), "📎 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0b38, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0b3b, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b3f, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0b47, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0b5a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0b5d, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0b5f, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0b7e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactChannel2, getTitle(r5), org.telegram.messenger.ContactsController.formatName(r6.first_name, r6.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0b81, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0b83, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0b89, code lost:
    
        if (r6.poll.quiz == false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0ba6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizChannel2, getTitle(r5), r6.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0bc2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollChannel2, getTitle(r5), r6.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0bc5, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0be4, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoChannel2, getTitle(r5), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r6).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0be7, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0bef, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0c18, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r5), "🖼 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0c2a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0c30, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0c40, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0c41, code lost:
    
        r4 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0c43, code lost:
    
        if (r4 == null) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0c49, code lost:
    
        if (r4.length() <= 0) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0c4b, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0c51, code lost:
    
        if (r1.length() <= 20) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0c53, code lost:
    
        r4 = new java.lang.StringBuilder();
        r8 = 0;
        r4.append((java.lang.Object) r1.subSequence(0, 20));
        r4.append("...");
        r1 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0c69, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedTextChannel;
        r4 = new java.lang.Object[2];
        r4[r8] = getTitle(r5);
        r4[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0c7b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0c68, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0c8c, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0c9b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0c9c, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0ca0, code lost:
    
        if (r1 == null) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0cb3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(r5), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0cc2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerChannel, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0cc3, code lost:
    
        r1 = r30.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0cc5, code lost:
    
        if (r1 != null) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0cd1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0cd6, code lost:
    
        if (r1.isMusic() == false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0ce2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0ce7, code lost:
    
        if (r1.isVideo() == false) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0cf1, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0d16, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r6, "📹 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0d24, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0d29, code lost:
    
        if (r1.isGif() == false) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0d33, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d58, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r6, "🎬 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d66, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0d6e, code lost:
    
        if (r1.isVoice() == false) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0d7a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0d7f, code lost:
    
        if (r1.isRoundVideo() == false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0d8b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0d90, code lost:
    
        if (r1.isSticker() != false) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0d96, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0d9c, code lost:
    
        r4 = r1.messageOwner;
        r5 = r4.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0da2, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0daa, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0dcf, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r6, "📎 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0ddd, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0de0, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0de4, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0dec, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0dfb, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0e00, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0e02, code lost:
    
        r5 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0e1b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactUser, r6, org.telegram.messenger.ContactsController.formatName(r5.first_name, r5.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0e1e, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0e20, code lost:
    
        r1 = ((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r5).poll;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0e26, code lost:
    
        if (r1.quiz == false) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0e3d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizUser, r6, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0e53, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollUser, r6, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0e56, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0e71, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoUser, r6, ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r5).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0e74, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0e7c, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L649;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0ea1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r6, "🖼 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0eaf, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0eb5, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0ec1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0ec2, code lost:
    
        r4 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0ec4, code lost:
    
        if (r4 == null) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0eca, code lost:
    
        if (r4.length() <= 0) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0ecc, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0ed2, code lost:
    
        if (r1.length() <= 20) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0ed4, code lost:
    
        r4 = new java.lang.StringBuilder();
        r8 = 0;
        r4.append((java.lang.Object) r1.subSequence(0, 20));
        r4.append("...");
        r1 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0eea, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedTextUser;
        r3 = new java.lang.Object[2];
        r3[r8] = r6;
        r3[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0ef8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0ee9, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0f05, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0f10, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0f11, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0f15, code lost:
    
        if (r1 == null) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0f24, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiUser, r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0f2f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerUser, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0f32, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) == false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0f34, code lost:
    
        r1 = org.telegram.messenger.utils.tlutils.TlUtils.getThemeEmoticonOrGiftTitle(((org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) r3).theme);
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0f40, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0f44, code lost:
    
        if (r8 != r22) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0f4f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabledYou, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0f5f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabled, r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0f64, code lost:
    
        if (r8 != r22) goto L689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0f70, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedYou, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0f7e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedTo, r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0f81, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByRequest) == false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0f89, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0f8c, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) == false) goto L706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0f8e, code lost:
    
        r3 = (org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) r3;
        r1 = org.telegram.messenger.DialogObject.getPeerDialogId(r3.boost_peer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0f98, code lost:
    
        if (r1 < 0) goto L700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0f9a, code lost:
    
        r4 = org.telegram.messenger.UserObject.getForcedFirstName(getMessagesController().getUser(java.lang.Long.valueOf(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0fd1, code lost:
    
        return org.telegram.messenger.LocaleController.formatPluralStringComma("BoostingReceivedStars", (int) r3.stars, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0fab, code lost:
    
        r1 = getMessagesController().getChat(java.lang.Long.valueOf(-r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x0fb8, code lost:
    
        if (r1 != null) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0fba, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0fbd, code lost:
    
        r4 = getTitle(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0fd4, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPaymentRefunded) == false) goto L710;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0fdc, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x0fdf, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoCompletions) == false) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0fe7, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0fea, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoAppendTasks) == false) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0ff2, code lost:
    
        return r30.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0ff3, code lost:
    
        return r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0ffa, code lost:
    
        if (r2.peer_id.channel_id == 0) goto L729;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x0ffe, code lost:
    
        if (r5.megagroup != false) goto L729;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x1004, code lost:
    
        if (r30.isVideoAvatar() == false) goto L727;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x1017, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelVideoEditNotification, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x1029, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelPhotoEditNotification, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x1030, code lost:
    
        if (r30.isVideoAvatar() == false) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x1044, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupVideo, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x1057, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupPhoto, r6, getTitle(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1062, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationContactJoined, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x1069, code lost:
    
        if (r30.isMediaEmpty() == false) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x1073, code lost:
    
        if (android.text.TextUtils.isEmpty(r30.messageOwner.message) != false) goto L743;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x1079, code lost:
    
        return replaceSpoilers(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x1080, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x1085, code lost:
    
        if (r30.type != 29) goto L783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x108d, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r30) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x108f, code lost:
    
        r1 = (org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.MessageObject.getMedia(r30);
        r2 = r1.extended_media.size();
        r3 = 0;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x109d, code lost:
    
        if (r3 >= r2) goto L925;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x109f, code lost:
    
        r5 = r1.extended_media.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x10a9, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) == false) goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x10ab, code lost:
    
        r4 = ((org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) r5).media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x10b1, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L758;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x10b9, code lost:
    
        if (org.telegram.messenger.MessageObject.isVideoDocument(r4.document) == false) goto L758;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x10cf, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x10d5, code lost:
    
        if (r4 == false) goto L768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x10d9, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x10dc, code lost:
    
        r1 = org.telegram.messenger.R.string.AttachPaidMedia;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x10de, code lost:
    
        if (r2 != 1) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x10e0, code lost:
    
        if (r4 == false) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x10e2, code lost:
    
        r2 = org.telegram.messenger.R.string.AttachVideo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x10e7, code lost:
    
        r2 = org.telegram.messenger.LocaleController.getString(r2);
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x10fe, code lost:
    
        r3 = new java.lang.Object[1];
        r3[r8] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x1106, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x10e5, code lost:
    
        r2 = org.telegram.messenger.R.string.AttachPhoto;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x10ee, code lost:
    
        if (r4 == false) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x10f0, code lost:
    
        r3 = "Media";
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x10f2, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x10f7, code lost:
    
        r2 = org.telegram.messenger.LocaleController.formatPluralString(r3, r2, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x10f4, code lost:
    
        r3 = "Photos";
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x10d1, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x10c3, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) == false) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x10cd, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r5).flags & 4) == 0) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x110b, code lost:
    
        if (r30.isVoiceOnce() == false) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x1113, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachOnceAudio);
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x1118, code lost:
    
        if (r30.isRoundOnce() == false) goto L791;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x1120, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachOnceRound);
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x1121, code lost:
    
        r2 = r30.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x1127, code lost:
    
        if ((r2.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L803;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x112f, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x1144, code lost:
    
        return "🖼 " + replaceSpoilers(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x114b, code lost:
    
        if (r30.messageOwner.media.ttl_seconds == 0) goto L801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x1153, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDestructingPhoto);
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x115a, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachPhoto);
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x115f, code lost:
    
        if (r30.isVideo() == false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x1169, code lost:
    
        if (android.text.TextUtils.isEmpty(r30.messageOwner.message) != false) goto L809;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x117e, code lost:
    
        return "📹 " + replaceSpoilers(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x1185, code lost:
    
        if (r30.messageOwner.media.ttl_seconds == 0) goto L813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x118d, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDestructingVideo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x1194, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachVideo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x1199, code lost:
    
        if (r30.isGame() == false) goto L819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x11a1, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachGame);
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x11a6, code lost:
    
        if (r30.isVoice() == false) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x11ae, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachAudio);
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x11b3, code lost:
    
        if (r30.isRoundVideo() == false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x11bb, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachRound);
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x11c0, code lost:
    
        if (r30.isMusic() == false) goto L831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x11c8, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachMusic);
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x11c9, code lost:
    
        r2 = r30.messageOwner.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x11cf, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x11d7, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachContact);
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x11da, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L843;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x11e2, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r2).poll.quiz == false) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x11ea, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.QuizPoll);
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x11f1, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Poll);
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x11f4, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L847;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x11fc, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Todo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x11ff, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x1207, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveaway);
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x120a, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveawayResults) == false) goto L855;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x1212, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveawayResults);
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x1215, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x1219, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L860;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x121f, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x1227, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachLiveLocation);
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x122a, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x1230, code lost:
    
        if (r30.isSticker() != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x1236, code lost:
    
        if (r30.isAnimatedSticker() == false) goto L871;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x123d, code lost:
    
        if (r30.isGif() == false) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x1247, code lost:
    
        if (android.text.TextUtils.isEmpty(r30.messageOwner.message) != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x125c, code lost:
    
        return "🎬 " + replaceSpoilers(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x1263, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachGif);
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x126c, code lost:
    
        if (android.text.TextUtils.isEmpty(r30.messageOwner.message) != false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x1281, code lost:
    
        return "📎 " + replaceSpoilers(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x1288, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDocument);
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x1289, code lost:
    
        r1 = r30.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x128d, code lost:
    
        if (r1 == null) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x12a9, code lost:
    
        return r1 + " " + org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachSticker);
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x12b0, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachSticker);
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x12b3, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaStory) == false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x12b9, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaStory) r2).via_mention == false) goto L902;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x12bb, code lost:
    
        r1 = org.telegram.messenger.R.string.StoryNotificationMention;
        r2 = r31[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x12c1, code lost:
    
        if (r2 != null) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x12c3, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x12d1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x12c7, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x12d8, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Story);
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x12df, code lost:
    
        if (android.text.TextUtils.isEmpty(r30.messageText) != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x12e5, code lost:
    
        return replaceSpoilers(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x12ec, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x12f3, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachLocation);
     */
    /* JADX WARN: Code restructure failed: missing block: B:893:0x0230, code lost:
    
        if (r7.getBoolean(r27, r11) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x0238, code lost:
    
        if (r7.getBoolean("EnablePreviewChannel", r11) != false) goto L161;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getShortStringForMessage(MessageObject messageObject, String[] strArr, boolean[] zArr) {
        String str;
        String str2;
        String title;
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
        boolean z = notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + j, true);
        if (messageObject.isFcmMessage()) {
            if (j2 == 0 && j3 != 0) {
                if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = messageObject.localName;
                }
                if (!z || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                    if (zArr != null) {
                        zArr[0] = false;
                    }
                    return LocaleController.getString(R.string.Message);
                }
            } else if (j2 != 0) {
                if (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) {
                    strArr[0] = messageObject.localUserName;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = messageObject.localName;
                }
                if (!z || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true)))) {
                    if (zArr != null) {
                        zArr[0] = false;
                    }
                    return (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, messageObject.localUserName, messageObject.localName) : LocaleController.formatString(R.string.ChannelMessageNoText, messageObject.localName);
                }
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
            str = null;
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
                str2 = "EnablePreviewGroup";
            } else {
                str2 = "EnablePreviewGroup";
                title = str;
            }
        } else {
            str = null;
            str2 = "EnablePreviewGroup";
            TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j3));
            if (chat3 != null) {
                title = getTitle(chat3);
                strArr[0] = title;
            }
            title = str;
        }
        if (title != null && j3 > 0 && UserObject.isReplyUser(j) && (messageFwdHeader = messageObject.messageOwner.fwd_from) != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long peerId = MessageObject.getPeerId(peer);
            if (DialogObject.isChatDialog(peerId) && (chat2 = getMessagesController().getChat(Long.valueOf(-peerId))) != null) {
                title = title + " @ " + getTitle(chat2);
                if (strArr[0] != null) {
                    strArr[0] = title;
                }
            }
        }
        if (title == null) {
            return str;
        }
        if (j2 != 0) {
            chat = getMessagesController().getChat(Long.valueOf(j2));
            if (chat == null) {
                return str;
            }
            if (ChatObject.isChannel(chat) && !chat.megagroup && Build.VERSION.SDK_INT <= 27) {
                strArr[0] = str;
            }
        } else {
            chat = str;
        }
        if (DialogObject.isEncryptedDialog(j)) {
            strArr[0] = str;
            return LocaleController.getString(R.string.NotificationHiddenMessage);
        }
        boolean z2 = ChatObject.isChannel(chat) && !chat.megagroup;
        TLRPC.Message message2 = messageObject.messageOwner;
        if (message2 != null && message2.rich_message != null) {
            return messageObject.messageText.toString();
        }
        if (z) {
            boolean z3 = (j2 != 0 || j3 == 0) ? true : true;
            if (j2 != 0) {
                if (!z2) {
                }
                if (z2) {
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

    private String getStringForMessage(MessageObject messageObject, boolean z, boolean[] zArr, boolean[] zArr2) {
        SharedPreferences sharedPreferences;
        String string;
        TLRPC.Chat chat;
        char c;
        char c2;
        char c3;
        boolean z2;
        String formatString;
        String userName;
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
            sharedPreferences = notificationsSettings;
            string = LocaleController.getString(R.string.BotAuthNotificationTitle);
        } else if (j3 > 0) {
            if (!messageObject.messageOwner.from_scheduled) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    userName = UserObject.getUserName(user);
                } else {
                    sharedPreferences = notificationsSettings;
                    string = null;
                }
            } else if (j == clientUserId) {
                userName = LocaleController.getString(R.string.MessageScheduledReminderNotification);
            } else {
                userName = LocaleController.getString(R.string.NotificationMessageScheduledName);
            }
            string = userName;
            sharedPreferences = notificationsSettings;
        } else {
            sharedPreferences = notificationsSettings;
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
        if (DialogObject.isEncryptedDialog(j)) {
            return LocaleController.getString(R.string.YouHaveNewMessage);
        }
        String str = string;
        if (j2 == 0 && j3 != 0) {
            if (!z3 || !sharedPreferences.getBoolean("EnablePreviewAll", true)) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                return LocaleController.formatString(R.string.NotificationMessageNoText, str);
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            if (message2 instanceof TLRPC.TL_messageService) {
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
                    return LocaleController.formatString(R.string.NotificationContactJoined, str);
                }
                if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                    return LocaleController.formatString(R.string.NotificationContactNewPhoto, str);
                }
                if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                    String formatString2 = LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(messageObject.messageOwner.date * 1000), LocaleController.getInstance().getFormatterDay().format(messageObject.messageOwner.date * 1000));
                    int i = R.string.NotificationUnrecognizedDevice;
                    String str2 = getUserConfig().getCurrentUser().first_name;
                    TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                    return LocaleController.formatString(i, str2, formatString2, messageAction2.title, messageAction2.address);
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
                    if (messageAction.video) {
                        return LocaleController.getString(R.string.CallMessageVideoIncomingMissed);
                    }
                    return LocaleController.getString(R.string.CallMessageIncomingMissed);
                }
                if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                    if (messageAction.video) {
                        return LocaleController.getString(R.string.CallMessageVideoIncomingConferenceMissed);
                    }
                    return LocaleController.getString(R.string.CallMessageIncomingConferenceMissed);
                }
                if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                    String themeEmoticonOrGiftTitle = TlUtils.getThemeEmoticonOrGiftTitle(((TLRPC.TL_messageActionSetChatTheme) messageAction).theme);
                    if (!TextUtils.isEmpty(themeEmoticonOrGiftTitle)) {
                        c3 = 0;
                        z2 = true;
                        if (j == clientUserId) {
                            formatString = LocaleController.formatString(R.string.ChatThemeChangedYou, themeEmoticonOrGiftTitle);
                        } else {
                            formatString = LocaleController.formatString(R.string.ChatThemeChangedTo, str, themeEmoticonOrGiftTitle);
                        }
                    } else if (j == clientUserId) {
                        c3 = 0;
                        formatString = LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]);
                        z2 = true;
                    } else {
                        c3 = 0;
                        z2 = true;
                        formatString = LocaleController.formatString(R.string.ChatThemeDisabled, str, themeEmoticonOrGiftTitle);
                    }
                    zArr[c3] = z2;
                    return formatString;
                }
            } else {
                if (messageObject.isMediaEmpty()) {
                    if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        String formatString3 = LocaleController.formatString(R.string.NotificationMessageText, str, messageObject.messageOwner.message);
                        zArr[0] = true;
                        return formatString3;
                    }
                    return LocaleController.formatString(R.string.NotificationMessageNoText, str);
                }
                TLRPC.Message message3 = messageObject.messageOwner;
                if (message3.media instanceof TLRPC.TL_messageMediaPhoto) {
                    if (z || TextUtils.isEmpty(message3.message)) {
                        return messageObject.messageOwner.media.ttl_seconds != 0 ? LocaleController.formatString(R.string.NotificationMessageSDPhoto, str) : LocaleController.formatString(R.string.NotificationMessagePhoto, str);
                    }
                    String formatString4 = LocaleController.formatString(R.string.NotificationMessageText, str, "🖼 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return formatString4;
                }
                if (messageObject.isVideo()) {
                    if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return messageObject.messageOwner.media.ttl_seconds != 0 ? LocaleController.formatString(R.string.NotificationMessageSDVideo, str) : LocaleController.formatString(R.string.NotificationMessageVideo, str);
                    }
                    String formatString5 = LocaleController.formatString(R.string.NotificationMessageText, str, "📹 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return formatString5;
                }
                if (messageObject.isGame()) {
                    return LocaleController.formatString(R.string.NotificationMessageGame, str, messageObject.messageOwner.media.game.title);
                }
                if (messageObject.isVoice()) {
                    return LocaleController.formatString(R.string.NotificationMessageAudio, str);
                }
                if (messageObject.isRoundVideo()) {
                    return LocaleController.formatString(R.string.NotificationMessageRound, str);
                }
                if (messageObject.isMusic()) {
                    return LocaleController.formatString(R.string.NotificationMessageMusic, str);
                }
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                    TLRPC.TL_messageMediaContact tL_messageMediaContact = (TLRPC.TL_messageMediaContact) messageMedia;
                    return LocaleController.formatString(R.string.NotificationMessageContact2, str, ContactsController.formatName(tL_messageMediaContact.first_name, tL_messageMediaContact.last_name));
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                    return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, str, Integer.valueOf(tL_messageMediaGiveaway.quantity), Integer.valueOf(tL_messageMediaGiveaway.months));
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    return LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    return poll.quiz ? LocaleController.formatString(R.string.NotificationMessageQuiz2, str, poll.question.text) : LocaleController.formatString(R.string.NotificationMessagePoll2, str, poll.question.text);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    return LocaleController.formatString(R.string.NotificationMessageTodo2, str, ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                }
                if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                    return LocaleController.formatString(R.string.NotificationMessageMap, str);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
                    return LocaleController.formatString(R.string.NotificationMessageLiveLocation, str);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                        String stickerEmoji = messageObject.getStickerEmoji();
                        return stickerEmoji != null ? LocaleController.formatString(R.string.NotificationMessageStickerEmoji, str, stickerEmoji) : LocaleController.formatString(R.string.NotificationMessageSticker, str);
                    }
                    if (messageObject.isGif()) {
                        if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGif, str);
                        }
                        String formatString6 = LocaleController.formatString(R.string.NotificationMessageText, str, "🎬 " + messageObject.messageOwner.message);
                        zArr[0] = true;
                        return formatString6;
                    }
                    if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationMessageDocument, str);
                    }
                    String formatString7 = LocaleController.formatString(R.string.NotificationMessageText, str, "📎 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return formatString7;
                }
                if (z || TextUtils.isEmpty(messageObject.messageText)) {
                    return LocaleController.formatString(R.string.NotificationMessageNoText, str);
                }
                String formatString8 = LocaleController.formatString(R.string.NotificationMessageText, str, messageObject.messageText);
                zArr[0] = true;
                return formatString8;
            }
        } else if (j2 != 0) {
            boolean z4 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (!z3 || ((z4 || !sharedPreferences.getBoolean("EnablePreviewGroup", true)) && !(z4 && sharedPreferences.getBoolean("EnablePreviewChannel", true)))) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                return (!ChatObject.isChannel(chat) || chat.megagroup) ? (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) ? LocaleController.formatPluralString("NotificationMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, str) : LocaleController.formatString(R.string.NotificationMessageGroupNoText, str, getTitle(chat)) : LocaleController.formatString(R.string.ChannelMessageNoText, str);
            }
            TLRPC.Message message4 = messageObject.messageOwner;
            if (message4 instanceof TLRPC.TL_messageService) {
                TLRPC.MessageAction messageAction3 = message4.action;
                if (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser) {
                    long j4 = messageAction3.user_id;
                    if (j4 == 0 && messageAction3.users.size() == 1) {
                        j4 = messageObject.messageOwner.action.users.get(0).longValue();
                    }
                    if (j4 != 0) {
                        if (messageObject.messageOwner.peer_id.channel_id != 0 && !chat.megagroup) {
                            return LocaleController.formatString(R.string.ChannelAddedByNotification, str, getTitle(chat));
                        }
                        if (j4 == clientUserId) {
                            return LocaleController.formatString(R.string.NotificationInvitedToGroup, str, getTitle(chat));
                        }
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j4));
                        if (user2 == null) {
                            return null;
                        }
                        return j3 == user2.id ? chat.megagroup ? LocaleController.formatString(R.string.NotificationGroupAddSelfMega, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupAddSelf, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupAddMember, str, getTitle(chat), UserObject.getUserName(user2));
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < messageObject.messageOwner.action.users.size(); i2++) {
                        TLRPC.User user3 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i2));
                        if (user3 != null) {
                            String userName2 = UserObject.getUserName(user3);
                            if (sb.length() != 0) {
                                sb.append(", ");
                            }
                            sb.append(userName2);
                        }
                    }
                    return LocaleController.formatString(R.string.NotificationGroupAddMember, str, getTitle(chat), sb.toString());
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionGroupCall) {
                    return messageAction3.duration != 0 ? LocaleController.formatString(R.string.NotificationGroupEndedCall, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupCreatedCall, str, getTitle(chat));
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                    return messageObject.messageText.toString();
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                    long j5 = messageAction3.user_id;
                    if (j5 == 0 && messageAction3.users.size() == 1) {
                        j5 = messageObject.messageOwner.action.users.get(0).longValue();
                    }
                    if (j5 != 0) {
                        if (j5 == clientUserId) {
                            return LocaleController.formatString(R.string.NotificationGroupInvitedYouToCall, str, getTitle(chat));
                        }
                        TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j5));
                        if (user4 == null) {
                            return null;
                        }
                        return LocaleController.formatString(R.string.NotificationGroupInvitedToCall, str, getTitle(chat), UserObject.getUserName(user4));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i3 = 0; i3 < messageObject.messageOwner.action.users.size(); i3++) {
                        TLRPC.User user5 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i3));
                        if (user5 != null) {
                            String userName3 = UserObject.getUserName(user5);
                            if (sb2.length() != 0) {
                                sb2.append(", ");
                            }
                            sb2.append(userName3);
                        }
                    }
                    return LocaleController.formatString(R.string.NotificationGroupInvitedToCall, str, getTitle(chat), sb2.toString());
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionGiftCode) {
                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction3;
                    TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
                    String title = chat3 == null ? null : getTitle(chat3);
                    return title == null ? LocaleController.getString(R.string.BoostingReceivedGiftNoName) : LocaleController.formatString(R.string.NotificationMessageGiftCode, title, LocaleController.formatPluralString("Months", tL_messageActionGiftCode.months, new Object[0]));
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                    return LocaleController.formatString(R.string.NotificationInvitedToGroupByLink, str, getTitle(chat));
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionChatEditTitle) {
                    return LocaleController.formatString(R.string.NotificationEditedGroupName, str, messageAction3.title);
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionTodoCompletions) {
                    return messageObject.messageText.toString();
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                    return messageObject.messageText.toString();
                }
                if ((messageAction3 instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction3 instanceof TLRPC.TL_messageActionChatDeletePhoto)) {
                    return (message4.peer_id.channel_id == 0 || chat.megagroup) ? messageObject.isVideoAvatar() ? LocaleController.formatString(R.string.NotificationEditedGroupVideo, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationEditedGroupPhoto, str, getTitle(chat)) : messageObject.isVideoAvatar() ? LocaleController.formatString(R.string.ChannelVideoEditNotification, getTitle(chat)) : LocaleController.formatString(R.string.ChannelPhotoEditNotification, getTitle(chat));
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionChatDeleteUser) {
                    long j6 = messageAction3.user_id;
                    if (j6 == clientUserId) {
                        return LocaleController.formatString(R.string.NotificationGroupKickYou, str, getTitle(chat));
                    }
                    if (j6 == j3) {
                        return LocaleController.formatString(R.string.NotificationGroupLeftMember, str, getTitle(chat));
                    }
                    TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.action.user_id));
                    if (user6 == null) {
                        return null;
                    }
                    return LocaleController.formatString(R.string.NotificationGroupKickMember, str, getTitle(chat), UserObject.getUserName(user6));
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
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        MessageObject messageObject2 = messageObject.replyMessageObject;
                        if (messageObject2 == null) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedNoText, str, getTitle(chat));
                        }
                        if (messageObject2.isMusic()) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedMusic, str, getTitle(chat));
                        }
                        if (messageObject2.isVideo()) {
                            if (TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedVideo, str, getTitle(chat));
                            }
                            return LocaleController.formatString(R.string.NotificationActionPinnedText, str, "📹 " + messageObject2.messageOwner.message, getTitle(chat));
                        }
                        if (messageObject2.isGif()) {
                            if (TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedGif, str, getTitle(chat));
                            }
                            return LocaleController.formatString(R.string.NotificationActionPinnedText, str, "🎬 " + messageObject2.messageOwner.message, getTitle(chat));
                        }
                        if (messageObject2.isVoice()) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedVoice, str, getTitle(chat));
                        }
                        if (messageObject2.isRoundVideo()) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedRound, str, getTitle(chat));
                        }
                        if (messageObject2.isSticker() || messageObject2.isAnimatedSticker()) {
                            String stickerEmoji2 = messageObject2.getStickerEmoji();
                            return stickerEmoji2 != null ? LocaleController.formatString(R.string.NotificationActionPinnedStickerEmoji, str, getTitle(chat), stickerEmoji2) : LocaleController.formatString(R.string.NotificationActionPinnedSticker, str, getTitle(chat));
                        }
                        TLRPC.Message message5 = messageObject2.messageOwner;
                        TLRPC.MessageMedia messageMedia2 = message5.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                            if (TextUtils.isEmpty(message5.message)) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedFile, str, getTitle(chat));
                            }
                            return LocaleController.formatString(R.string.NotificationActionPinnedText, str, "📎 " + messageObject2.messageOwner.message, getTitle(chat));
                        }
                        if ((messageMedia2 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia2 instanceof TLRPC.TL_messageMediaVenue)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedGeo, str, getTitle(chat));
                        }
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaGeoLive) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedGeoLive, str, getTitle(chat));
                        }
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaContact) {
                            TLRPC.TL_messageMediaContact tL_messageMediaContact2 = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                            return LocaleController.formatString(R.string.NotificationActionPinnedContact2, str, getTitle(chat), ContactsController.formatName(tL_messageMediaContact2.first_name, tL_messageMediaContact2.last_name));
                        }
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                            return tL_messageMediaPoll.poll.quiz ? LocaleController.formatString(R.string.NotificationActionPinnedQuiz2, str, getTitle(chat), tL_messageMediaPoll.poll.question.text) : LocaleController.formatString(R.string.NotificationActionPinnedPoll2, str, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                        }
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedTodo2, str, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia2).todo.title.text);
                        }
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                            if (TextUtils.isEmpty(message5.message)) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedPhoto, str, getTitle(chat));
                            }
                            return LocaleController.formatString(R.string.NotificationActionPinnedText, str, "🖼 " + messageObject2.messageOwner.message, getTitle(chat));
                        }
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedGame, str, getTitle(chat));
                        }
                        CharSequence charSequence = messageObject2.messageText;
                        if (charSequence == null || charSequence.length() <= 0) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedNoText, str, getTitle(chat));
                        }
                        CharSequence charSequence2 = messageObject2.messageText;
                        if (charSequence2.length() > 20) {
                            StringBuilder sb3 = new StringBuilder();
                            c = 0;
                            sb3.append((Object) charSequence2.subSequence(0, 20));
                            sb3.append("...");
                            charSequence2 = sb3.toString();
                        } else {
                            c = 0;
                        }
                        int i4 = R.string.NotificationActionPinnedText;
                        String title2 = getTitle(chat);
                        Object[] objArr = new Object[3];
                        objArr[c] = str;
                        objArr[1] = charSequence2;
                        objArr[2] = title2;
                        return LocaleController.formatString(i4, objArr);
                    }
                    MessageObject messageObject3 = messageObject.replyMessageObject;
                    if (messageObject3 == null) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                    }
                    if (messageObject3.isMusic()) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedMusicChannel, getTitle(chat));
                    }
                    if (messageObject3.isVideo()) {
                        if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedVideoChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📹 " + messageObject3.messageOwner.message);
                    }
                    if (messageObject3.isGif()) {
                        if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedGifChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🎬 " + messageObject3.messageOwner.message);
                    }
                    if (messageObject3.isVoice()) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedVoiceChannel, getTitle(chat));
                    }
                    if (messageObject3.isRoundVideo()) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedRoundChannel, getTitle(chat));
                    }
                    if (messageObject3.isSticker() || messageObject3.isAnimatedSticker()) {
                        String stickerEmoji3 = messageObject3.getStickerEmoji();
                        return stickerEmoji3 != null ? LocaleController.formatString(R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(chat), stickerEmoji3) : LocaleController.formatString(R.string.NotificationActionPinnedStickerChannel, getTitle(chat));
                    }
                    TLRPC.Message message6 = messageObject3.messageOwner;
                    TLRPC.MessageMedia messageMedia3 = message6.media;
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        if (TextUtils.isEmpty(message6.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedFileChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📎 " + messageObject3.messageOwner.message);
                    }
                    if ((messageMedia3 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia3 instanceof TLRPC.TL_messageMediaVenue)) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGeoChannel, getTitle(chat));
                    }
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaGeoLive) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveChannel, getTitle(chat));
                    }
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaContact) {
                        TLRPC.TL_messageMediaContact tL_messageMediaContact3 = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                        return LocaleController.formatString(R.string.NotificationActionPinnedContactChannel2, getTitle(chat), ContactsController.formatName(tL_messageMediaContact3.first_name, tL_messageMediaContact3.last_name));
                    }
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia3;
                        return tL_messageMediaPoll2.poll.quiz ? LocaleController.formatString(R.string.NotificationActionPinnedQuizChannel2, getTitle(chat), tL_messageMediaPoll2.poll.question.text) : LocaleController.formatString(R.string.NotificationActionPinnedPollChannel2, getTitle(chat), tL_messageMediaPoll2.poll.question.text);
                    }
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedTodoChannel2, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia3).todo.title.text);
                    }
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        if (TextUtils.isEmpty(message6.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedPhotoChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🖼 " + messageObject3.messageOwner.message);
                    }
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaGame) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGameChannel, getTitle(chat));
                    }
                    CharSequence charSequence3 = messageObject3.messageText;
                    if (charSequence3 == null || charSequence3.length() <= 0) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                    }
                    CharSequence charSequence4 = messageObject3.messageText;
                    if (charSequence4.length() > 20) {
                        StringBuilder sb4 = new StringBuilder();
                        c2 = 0;
                        sb4.append((Object) charSequence4.subSequence(0, 20));
                        sb4.append("...");
                        charSequence4 = sb4.toString();
                    } else {
                        c2 = 0;
                    }
                    int i5 = R.string.NotificationActionPinnedTextChannel;
                    Object[] objArr2 = new Object[2];
                    objArr2[c2] = getTitle(chat);
                    objArr2[1] = charSequence4;
                    return LocaleController.formatString(i5, objArr2);
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionGameScore) {
                    return messageObject.messageText.toString();
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionSetChatTheme) {
                    String themeEmoticonOrGiftTitle2 = TlUtils.getThemeEmoticonOrGiftTitle(((TLRPC.TL_messageActionSetChatTheme) messageAction3).theme);
                    return TextUtils.isEmpty(themeEmoticonOrGiftTitle2) ? j == clientUserId ? LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]) : LocaleController.formatString("ChatThemeDisabled", R.string.ChatThemeDisabled, str, themeEmoticonOrGiftTitle2) : j == clientUserId ? LocaleController.formatString(R.string.ChatThemeChangedYou, themeEmoticonOrGiftTitle2) : LocaleController.formatString(R.string.ChatThemeChangedTo, str, themeEmoticonOrGiftTitle2);
                }
                if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                    return messageObject.messageText.toString();
                }
            } else {
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (messageObject.isMediaEmpty()) {
                        if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.ChannelMessageNoText, str);
                        }
                        String formatString9 = LocaleController.formatString(R.string.NotificationMessageText, str, messageObject.messageOwner.message);
                        zArr[0] = true;
                        return formatString9;
                    }
                    if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                        return LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, getTitle(chat));
                    }
                    TLRPC.Message message7 = messageObject.messageOwner;
                    if (message7.media instanceof TLRPC.TL_messageMediaPhoto) {
                        if (z || TextUtils.isEmpty(message7.message)) {
                            return LocaleController.formatString(R.string.ChannelMessagePhoto, str);
                        }
                        String formatString10 = LocaleController.formatString(R.string.NotificationMessageText, str, "🖼 " + messageObject.messageOwner.message);
                        zArr[0] = true;
                        return formatString10;
                    }
                    if (messageObject.isVideo()) {
                        if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.ChannelMessageVideo, str);
                        }
                        String formatString11 = LocaleController.formatString(R.string.NotificationMessageText, str, "📹 " + messageObject.messageOwner.message);
                        zArr[0] = true;
                        return formatString11;
                    }
                    if (messageObject.isVoice()) {
                        return LocaleController.formatString(R.string.ChannelMessageAudio, str);
                    }
                    if (messageObject.isRoundVideo()) {
                        return LocaleController.formatString(R.string.ChannelMessageRound, str);
                    }
                    if (messageObject.isMusic()) {
                        return LocaleController.formatString(R.string.ChannelMessageMusic, str);
                    }
                    TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaContact) {
                        TLRPC.TL_messageMediaContact tL_messageMediaContact4 = (TLRPC.TL_messageMediaContact) messageMedia4;
                        return LocaleController.formatString(R.string.ChannelMessageContact2, str, ContactsController.formatName(tL_messageMediaContact4.first_name, tL_messageMediaContact4.last_name));
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.Poll poll2 = ((TLRPC.TL_messageMediaPoll) messageMedia4).poll;
                        return poll2.quiz ? LocaleController.formatString(R.string.ChannelMessageQuiz2, str, poll2.question.text) : LocaleController.formatString(R.string.ChannelMessagePoll2, str, poll2.question.text);
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaToDo) {
                        return LocaleController.formatString(R.string.ChannelMessageTodo2, str, ((TLRPC.TL_messageMediaToDo) messageMedia4).todo.title.text);
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaGiveaway) {
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageMedia4;
                        return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway2.quantity), Integer.valueOf(tL_messageMediaGiveaway2.months));
                    }
                    if ((messageMedia4 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia4 instanceof TLRPC.TL_messageMediaVenue)) {
                        return LocaleController.formatString(R.string.ChannelMessageMap, str);
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaGeoLive) {
                        return LocaleController.formatString(R.string.ChannelMessageLiveLocation, str);
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaDocument) {
                        if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                            String stickerEmoji4 = messageObject.getStickerEmoji();
                            return stickerEmoji4 != null ? LocaleController.formatString(R.string.ChannelMessageStickerEmoji, str, stickerEmoji4) : LocaleController.formatString(R.string.ChannelMessageSticker, str);
                        }
                        if (messageObject.isGif()) {
                            if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                return LocaleController.formatString(R.string.ChannelMessageGIF, str);
                            }
                            String formatString12 = LocaleController.formatString(R.string.NotificationMessageText, str, "🎬 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return formatString12;
                        }
                        if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.ChannelMessageDocument, str);
                        }
                        String formatString13 = LocaleController.formatString(R.string.NotificationMessageText, str, "📎 " + messageObject.messageOwner.message);
                        zArr[0] = true;
                        return formatString13;
                    }
                    if (z || TextUtils.isEmpty(messageObject.messageText)) {
                        return LocaleController.formatString(R.string.ChannelMessageNoText, str);
                    }
                    String formatString14 = LocaleController.formatString(R.string.NotificationMessageText, str, messageObject.messageText);
                    zArr[0] = true;
                    return formatString14;
                }
                if (messageObject.isMediaEmpty()) {
                    return (z || TextUtils.isEmpty(messageObject.messageOwner.message)) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), messageObject.messageOwner.message);
                }
                if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    return LocaleController.formatPluralString("NotificationChatMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, str, getTitle(chat));
                }
                TLRPC.Message message8 = messageObject.messageOwner;
                if (message8.media instanceof TLRPC.TL_messageMediaPhoto) {
                    if (z || TextUtils.isEmpty(message8.message)) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupPhoto, str, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), "🖼 " + messageObject.messageOwner.message);
                }
                if (messageObject.isVideo()) {
                    if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupVideo, str, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), "📹 " + messageObject.messageOwner.message);
                }
                if (messageObject.isVoice()) {
                    return LocaleController.formatString(R.string.NotificationMessageGroupAudio, str, getTitle(chat));
                }
                if (messageObject.isRoundVideo()) {
                    return LocaleController.formatString(R.string.NotificationMessageGroupRound, str, getTitle(chat));
                }
                if (messageObject.isMusic()) {
                    return LocaleController.formatString(R.string.NotificationMessageGroupMusic, str, getTitle(chat));
                }
                TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaContact) {
                    TLRPC.TL_messageMediaContact tL_messageMediaContact5 = (TLRPC.TL_messageMediaContact) messageMedia5;
                    return LocaleController.formatString(R.string.NotificationMessageGroupContact2, str, getTitle(chat), ContactsController.formatName(tL_messageMediaContact5.first_name, tL_messageMediaContact5.last_name));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) messageMedia5;
                    return tL_messageMediaPoll3.poll.quiz ? LocaleController.formatString(R.string.NotificationMessageGroupQuiz2, str, getTitle(chat), tL_messageMediaPoll3.poll.question.text) : LocaleController.formatString(R.string.NotificationMessageGroupPoll2, str, getTitle(chat), tL_messageMediaPoll3.poll.question.text);
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaToDo) {
                    return LocaleController.formatString(R.string.NotificationMessageGroupTodo2, str, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia5).todo.title.text);
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaGame) {
                    return LocaleController.formatString(R.string.NotificationMessageGroupGame, str, getTitle(chat), messageObject.messageOwner.media.game.title);
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaGiveaway) {
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = (TLRPC.TL_messageMediaGiveaway) messageMedia5;
                    return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway3.quantity), Integer.valueOf(tL_messageMediaGiveaway3.months));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    return LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                }
                if ((messageMedia5 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia5 instanceof TLRPC.TL_messageMediaVenue)) {
                    return LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, str, getTitle(chat));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaGeoLive) {
                    return LocaleController.formatString(R.string.NotificationMessageGroupLiveLocation, str, getTitle(chat));
                }
                if (!(messageMedia5 instanceof TLRPC.TL_messageMediaDocument)) {
                    return (z || TextUtils.isEmpty(messageObject.messageText)) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), messageObject.messageText);
                }
                if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                    String stickerEmoji5 = messageObject.getStickerEmoji();
                    return stickerEmoji5 != null ? LocaleController.formatString(R.string.NotificationMessageGroupStickerEmoji, str, getTitle(chat), stickerEmoji5) : LocaleController.formatString(R.string.NotificationMessageGroupSticker, str, getTitle(chat));
                }
                if (messageObject.isGif()) {
                    if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupGif, str, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), "🎬 " + messageObject.messageOwner.message);
                }
                if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                    return LocaleController.formatString(R.string.NotificationMessageGroupDocument, str, getTitle(chat));
                }
                return LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), "📎 " + messageObject.messageOwner.message);
            }
        }
        return null;
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

    public void showNotifications() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda77
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.showOrUpdateNotification(false);
            }
        });
    }

    public void hideNotifications() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$A3HJIpMiVTz6qC9GdrpDpkcVtwA(NotificationsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$A3HJIpMiVTz6qC9GdrpDpkcVtwA(NotificationsController notificationsController) {
        notificationManager.cancel(notificationsController.notificationId);
        notificationsController.lastWearNotifiedMessageId.clear();
        for (int i = 0; i < notificationsController.wearNotificationsIds.size(); i++) {
            notificationManager.cancel(((Integer) notificationsController.wearNotificationsIds.valueAt(i)).intValue());
        }
        notificationsController.wearNotificationsIds.clear();
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
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda37
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public ArrayList<MessageObject> getPushMessagesSnapshot() {
        ArrayList<MessageObject> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>(this.pushMessages);
        }
        return arrayList;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.fileLoaded) {
            final String str = (String) objArr[0];
            notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda71
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.$r8$lambda$tCp5deJHIKLKtDtGtmJreFj2_M0(NotificationsController.this, str);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$tCp5deJHIKLKtDtGtmJreFj2_M0(NotificationsController notificationsController, String str) {
        if (notificationsController.pendingVoiceLoads.remove(str)) {
            notificationsController.showOrUpdateNotification(true);
        }
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return;
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (getNotifyOverride(getAccountInstance().getNotificationsSettings(), this.openedDialogId, this.openedTopicId) == 2) {
                return;
            }
            notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.$r8$lambda$fo8d0a1DCcD93QBhKMJlqvVt1o0(NotificationsController.this);
                }
            });
        } catch (Exception e3) {
            e = e3;
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$fo8d0a1DCcD93QBhKMJlqvVt1o0(NotificationsController notificationsController) {
        notificationsController.getClass();
        if (Math.abs(SystemClock.elapsedRealtime() - notificationsController.lastSoundPlay) <= 500) {
            return;
        }
        try {
            if (notificationsController.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                notificationsController.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda76
                    @Override // android.media.SoundPool.OnLoadCompleteListener
                    public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                        NotificationsController.$r8$lambda$FC_HwUM3QBEiCRgKZAe2XqW3hzc(soundPool2, i, i2);
                    }
                });
            }
            if (notificationsController.soundIn == 0 && !notificationsController.soundInLoaded) {
                notificationsController.soundInLoaded = true;
                notificationsController.soundIn = notificationsController.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_in, 1);
            }
            int i = notificationsController.soundIn;
            if (i != 0) {
                try {
                    notificationsController.soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static /* synthetic */ void $r8$lambda$FC_HwUM3QBEiCRgKZAe2XqW3hzc(SoundPool soundPool, int i, int i2) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public void repeatNotificationMaybe() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$aIvWURtIq5Q37hUZhEHyIGJwbZc(NotificationsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$aIvWURtIq5Q37hUZhEHyIGJwbZc(NotificationsController notificationsController) {
        notificationsController.getClass();
        int i = Calendar.getInstance().get(11);
        if (i >= 11 && i <= 22) {
            notificationManager.cancel(notificationsController.notificationId);
            notificationsController.showOrUpdateNotification(true);
        } else {
            notificationsController.scheduleNotificationRepeat();
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
    public void deleteNotificationChannelInternal(long j, long j2, int i) {
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
                NotificationsController.this.deleteNotificationChannelInternal(j, j2, i);
            }
        });
    }

    public void deleteNotificationChannelGlobal(int i) {
        deleteNotificationChannelGlobal(i, -1);
    }

    public void deleteNotificationChannelGlobalInternal(int i, int i2) {
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
                NotificationsController.this.deleteNotificationChannelGlobalInternal(i, i2);
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
                NotificationsController.$r8$lambda$Nfmwpr5cW8zxAuxZyE34tMoFAF8(NotificationsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Nfmwpr5cW8zxAuxZyE34tMoFAF8(NotificationsController notificationsController) {
        notificationsController.getClass();
        try {
            SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4 A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:8:0x0021, B:11:0x0062, B:12:0x006d, B:15:0x007d, B:17:0x00a6, B:19:0x00b6, B:20:0x00c0, B:22:0x00f4, B:23:0x00fc, B:25:0x0105, B:27:0x0126, B:30:0x013d, B:34:0x0154, B:37:0x010c, B:39:0x0112, B:40:0x0117, B:41:0x0115, B:42:0x011c, B:43:0x00f8, B:45:0x0079, B:46:0x0069), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105 A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:8:0x0021, B:11:0x0062, B:12:0x006d, B:15:0x007d, B:17:0x00a6, B:19:0x00b6, B:20:0x00c0, B:22:0x00f4, B:23:0x00fc, B:25:0x0105, B:27:0x0126, B:30:0x013d, B:34:0x0154, B:37:0x010c, B:39:0x0112, B:40:0x0117, B:41:0x0115, B:42:0x011c, B:43:0x00f8, B:45:0x0079, B:46:0x0069), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126 A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:8:0x0021, B:11:0x0062, B:12:0x006d, B:15:0x007d, B:17:0x00a6, B:19:0x00b6, B:20:0x00c0, B:22:0x00f4, B:23:0x00fc, B:25:0x0105, B:27:0x0126, B:30:0x013d, B:34:0x0154, B:37:0x010c, B:39:0x0112, B:40:0x0117, B:41:0x0115, B:42:0x011c, B:43:0x00f8, B:45:0x0079, B:46:0x0069), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154 A[Catch: Exception -> 0x0066, TRY_LEAVE, TryCatch #0 {Exception -> 0x0066, blocks: (B:8:0x0021, B:11:0x0062, B:12:0x006d, B:15:0x007d, B:17:0x00a6, B:19:0x00b6, B:20:0x00c0, B:22:0x00f4, B:23:0x00fc, B:25:0x0105, B:27:0x0126, B:30:0x013d, B:34:0x0154, B:37:0x010c, B:39:0x0112, B:40:0x0117, B:41:0x0115, B:42:0x011c, B:43:0x00f8, B:45:0x0079, B:46:0x0069), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8 A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:8:0x0021, B:11:0x0062, B:12:0x006d, B:15:0x007d, B:17:0x00a6, B:19:0x00b6, B:20:0x00c0, B:22:0x00f4, B:23:0x00fc, B:25:0x0105, B:27:0x0126, B:30:0x013d, B:34:0x0154, B:37:0x010c, B:39:0x0112, B:40:0x0117, B:41:0x0115, B:42:0x011c, B:43:0x00f8, B:45:0x0079, B:46:0x0069), top: B:7:0x0021 }] */
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
                        return str2;
                    }
                    builder.setBubbleMetadata(null);
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
                    NotificationChannel m = NotificationsController$$ExternalSyntheticApiModelOutline7.m(notificationChannels.get(i));
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x058a A[LOOP:1: B:100:0x0587->B:102:0x058a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x053c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x057b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String validateChannelId(long j, long j2, String str, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        String str2;
        String str3;
        String str4;
        String uri2;
        String str5;
        String formatString;
        String str6;
        String str7;
        String string;
        boolean z4;
        int i4;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        SharedPreferences sharedPreferences;
        String str13;
        String str14;
        String str15;
        String str16;
        long[] jArr2;
        StringBuilder sb;
        String str17;
        String str18;
        String str19;
        boolean z5;
        String str20;
        int i5;
        String MD5;
        boolean z6;
        boolean z7;
        NotificationChannel notificationChannel;
        int importance;
        Uri sound;
        long[] vibrationPattern;
        boolean shouldVibrate;
        long j3;
        long[] jArr3;
        int lightColor;
        String str21;
        String str22;
        String str23;
        long[] jArr4;
        SharedPreferences.Editor editor;
        boolean z8;
        String str24;
        StringBuilder sb2;
        ensureGroupsCreated();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        String str25 = "stories";
        if (z3) {
            str2 = "other" + this.currentAccount;
            str3 = null;
        } else if (i3 == 2) {
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
        boolean z9 = !z && DialogObject.isEncryptedDialog(j);
        boolean z10 = (z2 || str3 == null || !notificationsSettings.getBoolean(str3, false)) ? false : true;
        if (uri == null) {
            StringBuilder sb3 = new StringBuilder();
            str4 = "reactions";
            sb3.append("NoSound");
            sb3.append(2);
            uri2 = sb3.toString();
        } else {
            str4 = "reactions";
            uri2 = uri.toString();
        }
        String MD52 = Utilities.MD5(uri2);
        if (MD52 != null) {
            str5 = "private";
            if (MD52.length() > 5) {
                MD52 = MD52.substring(0, 5);
            }
        } else {
            str5 = "private";
        }
        if (z3) {
            formatString = LocaleController.getString(R.string.NotificationsSilent);
            str25 = "silent";
        } else {
            if (z) {
                String string2 = LocaleController.getString(z2 ? R.string.NotificationsInAppDefault : R.string.NotificationsDefault);
                if (i3 != 2) {
                    if (i3 == 0) {
                        str7 = z2 ? "groups_ia" : "groups";
                    } else if (i3 == 3) {
                        if (z2) {
                            str7 = "stories_ia";
                        } else {
                            str6 = string2;
                            str7 = str25;
                        }
                    } else if (i3 == 4 || i3 == 5) {
                        if (z2) {
                            str7 = "reactions_ia";
                        } else {
                            str6 = string2;
                            str7 = str4;
                        }
                    } else if (z2) {
                        str7 = "private_ia";
                    } else {
                        str6 = string2;
                        str7 = str5;
                    }
                    str6 = string2;
                } else if (z2) {
                    str7 = "channels_ia";
                    str6 = string2;
                } else {
                    str6 = string2;
                    str7 = "channels";
                }
                String str26 = str7 + "_" + MD52;
                string = notificationsSettings.getString(str26, null);
                String string3 = notificationsSettings.getString(str26 + "_s", null);
                StringBuilder sb4 = new StringBuilder();
                z4 = z10;
                if (string != null) {
                    i4 = i;
                    str8 = string;
                    str9 = string3;
                    str10 = "channel_";
                    str11 = str2;
                    str12 = "secret";
                    sharedPreferences = notificationsSettings;
                    str13 = str6;
                    str14 = str26;
                    str15 = "_";
                    str16 = "_s";
                    jArr2 = jArr;
                    sb = sb4;
                } else {
                    sharedPreferences = notificationsSettings;
                    notificationChannel = systemNotificationManager.getNotificationChannel(string);
                    str13 = str6;
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb5 = new StringBuilder();
                        str11 = str2;
                        sb5.append("current channel for ");
                        sb5.append(string);
                        sb5.append(" = ");
                        sb5.append(notificationChannel);
                        FileLog.d(sb5.toString());
                    } else {
                        str11 = str2;
                    }
                    if (notificationChannel == null) {
                        jArr2 = jArr;
                        i4 = i;
                        sb = sb4;
                        str10 = "channel_";
                        str12 = "secret";
                        str14 = str26;
                        str15 = "_";
                        str16 = "_s";
                        str19 = null;
                        str18 = null;
                        str17 = null;
                        z5 = false;
                        if (z5) {
                        }
                        str20 = str14;
                        if (!z4) {
                        }
                        while (r11 < jArr2.length) {
                        }
                        sb.append(i4);
                        if (uri != null) {
                        }
                        i5 = i2;
                        sb.append(i5);
                        if (!z) {
                            sb.append(str12);
                        }
                        MD5 = Utilities.MD5(sb.toString());
                        if (!z3) {
                            systemNotificationManager.deleteNotificationChannel(str17);
                            if (BuildVars.LOGS_ENABLED) {
                            }
                            str17 = null;
                        }
                        if (str17 == null) {
                        }
                        return str17;
                    }
                    if (z3 || z4) {
                        i4 = i;
                        sb = sb4;
                        str8 = string;
                        str9 = string3;
                        str10 = "channel_";
                        str12 = "secret";
                        str14 = str26;
                        str15 = "_";
                        str16 = "_s";
                        jArr2 = jArr;
                    } else {
                        importance = notificationChannel.getImportance();
                        sound = notificationChannel.getSound();
                        vibrationPattern = notificationChannel.getVibrationPattern();
                        shouldVibrate = notificationChannel.shouldVibrate();
                        str14 = str26;
                        str15 = "_";
                        if (shouldVibrate || vibrationPattern != null) {
                            j3 = 0;
                            jArr3 = vibrationPattern;
                        } else {
                            j3 = 0;
                            jArr3 = new long[]{0, 0};
                        }
                        lightColor = notificationChannel.getLightColor();
                        str10 = "channel_";
                        if (jArr3 != null) {
                            int i6 = 0;
                            while (i6 < jArr3.length) {
                                int i7 = i6;
                                long[] jArr5 = jArr3;
                                sb4.append(jArr5[i7]);
                                i6 = i7 + 1;
                                jArr3 = jArr5;
                            }
                        }
                        long[] jArr6 = jArr3;
                        sb4.append(lightColor);
                        if (sound != null) {
                            sb4.append(sound.toString());
                        }
                        sb4.append(importance);
                        if (!z && z9) {
                            sb4.append("secret");
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("current channel settings for " + string + " = " + ((Object) sb4) + " old = " + string3);
                        }
                        String MD53 = Utilities.MD5(sb4.toString());
                        sb4.setLength(0);
                        if (z2 && i2 != importance) {
                            str16 = "_s";
                            i4 = i;
                            str21 = string;
                            str22 = string3;
                            str12 = "secret";
                            str23 = MD53;
                            z5 = false;
                            z4 = true;
                            jArr2 = jArr;
                            sb = sb4;
                        } else if (MD53.equals(string3)) {
                            str16 = "_s";
                            i4 = i;
                            str21 = string;
                            str22 = string3;
                            str12 = "secret";
                            str23 = MD53;
                            jArr2 = jArr;
                            sb = sb4;
                            z5 = false;
                        } else {
                            str21 = string;
                            str22 = string3;
                            if (importance == 0) {
                                SharedPreferences.Editor edit = sharedPreferences.edit();
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
                                    str24 = "_s";
                                    sb2 = sb4;
                                } else {
                                    if (i3 == 3) {
                                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + getSharedPrefKey(j, j3), false);
                                    } else {
                                        edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + getSharedPrefKey(j, j3), 2);
                                    }
                                    str24 = "_s";
                                    sb2 = sb4;
                                    updateServerNotificationsSettings(j, 0L, true);
                                }
                                editor = edit;
                                jArr4 = jArr6;
                                str12 = "secret";
                                str23 = MD53;
                                str16 = str24;
                                sb = sb2;
                            } else {
                                str16 = "_s";
                                jArr4 = jArr6;
                                sb = sb4;
                                str23 = MD53;
                                str12 = "secret";
                                if (importance == i2) {
                                    editor = null;
                                    z8 = false;
                                    jArr2 = jArr;
                                    if ((!isEmptyVibration(jArr2)) != shouldVibrate) {
                                        if (!z2) {
                                            if (editor == null) {
                                                editor = sharedPreferences.edit();
                                            }
                                            if (!z) {
                                                editor.putInt("vibrate_" + j, shouldVibrate ? 0 : 2);
                                            } else if (i3 == 2) {
                                                editor.putInt("vibrate_channel", shouldVibrate ? 0 : 2);
                                            } else if (i3 == 0) {
                                                editor.putInt("vibrate_group", shouldVibrate ? 0 : 2);
                                            } else if (i3 == 3) {
                                                editor.putInt("vibrate_stories", shouldVibrate ? 0 : 2);
                                            } else if (i3 == 4 || i3 == 5) {
                                                editor.putInt("vibrate_react", shouldVibrate ? 0 : 2);
                                            } else {
                                                editor.putInt("vibrate_messages", shouldVibrate ? 0 : 2);
                                            }
                                        }
                                        jArr2 = jArr4;
                                        z8 = true;
                                    }
                                    i4 = i;
                                    if (lightColor != i4) {
                                        if (!z2) {
                                            if (editor == null) {
                                                editor = sharedPreferences.edit();
                                            }
                                            if (!z) {
                                                editor.putInt("color_" + j, lightColor);
                                            } else if (i3 == 2) {
                                                editor.putInt("ChannelLed", lightColor);
                                            } else if (i3 == 0) {
                                                editor.putInt("GroupLed", lightColor);
                                            } else if (i3 == 3) {
                                                editor.putInt("StoriesLed", lightColor);
                                            } else if (i3 == 5 || i3 == 4) {
                                                editor.putInt("ReactionsLed", lightColor);
                                            } else {
                                                editor.putInt("MessagesLed", lightColor);
                                            }
                                        }
                                        i4 = lightColor;
                                        z8 = true;
                                    }
                                    if (editor != null) {
                                        editor.commit();
                                    }
                                    z5 = z8;
                                } else if (z2) {
                                    editor = null;
                                } else {
                                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
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
                                        edit2.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + j, true);
                                    } else {
                                        edit2.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + j, 0);
                                        edit2.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + j);
                                        edit2.putInt("priority_" + j, i8);
                                    }
                                    editor = edit2;
                                }
                            }
                            z8 = true;
                            jArr2 = jArr;
                            if ((!isEmptyVibration(jArr2)) != shouldVibrate) {
                            }
                            i4 = i;
                            if (lightColor != i4) {
                            }
                            if (editor != null) {
                            }
                            z5 = z8;
                        }
                        str18 = str23;
                        str17 = str21;
                        str19 = str22;
                        if (z5 || str18 == null) {
                            str20 = str14;
                            if (!z4 || str18 == null || !z2 || !z) {
                                for (long j4 : jArr2) {
                                    sb.append(j4);
                                }
                                sb.append(i4);
                                if (uri != null) {
                                    sb.append(uri.toString());
                                }
                                i5 = i2;
                                sb.append(i5);
                                if (!z && z9) {
                                    sb.append(str12);
                                }
                                MD5 = Utilities.MD5(sb.toString());
                                if (!z3 && str17 != null && (z4 || !str19.equals(MD5))) {
                                    try {
                                        systemNotificationManager.deleteNotificationChannel(str17);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("delete channel by settings change " + str17);
                                    }
                                    str17 = null;
                                }
                                if (str17 == null) {
                                    str17 = z ? this.currentAccount + str10 + str20 + str15 + Utilities.random.nextLong() : this.currentAccount + str10 + j + str15 + Utilities.random.nextLong();
                                    SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                                    NotificationChannel m = zzo$$ExternalSyntheticApiModelOutline2.m(str17, z9 ? LocaleController.getString(R.string.SecretChatName) : str13, i5);
                                    m.setGroup(str11);
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
                                    if (!isEmptyVibration(jArr2)) {
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
                                    if (uri != null) {
                                        m.setSound(uri, builder.build());
                                    } else {
                                        m.setSound(null, builder.build());
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("create new channel " + str17);
                                    }
                                    this.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                                    systemNotificationManager.createNotificationChannel(m);
                                    sharedPreferences.edit().putString(str20, str17).putString(str20 + str16, MD5).commit();
                                }
                                return str17;
                            }
                        } else {
                            str20 = str14;
                            sharedPreferences.edit().putString(str20, str17).putString(str20 + str16, str18).commit();
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("change edited channel " + str17);
                            }
                        }
                        MD5 = str18;
                        i5 = i2;
                        if (str17 == null) {
                        }
                        return str17;
                    }
                }
                str17 = str8;
                str19 = str9;
                str18 = null;
                z5 = false;
                if (z5) {
                }
                str20 = str14;
                if (!z4) {
                }
                while (r11 < jArr2.length) {
                }
                sb.append(i4);
                if (uri != null) {
                }
                i5 = i2;
                sb.append(i5);
                if (!z) {
                }
                MD5 = Utilities.MD5(sb.toString());
                if (!z3) {
                }
                if (str17 == null) {
                }
                return str17;
            }
            formatString = z2 ? LocaleController.formatString(R.string.NotificationsChatInApp, str) : str;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(z2 ? "org.telegram.keyia" : "org.telegram.key");
            sb6.append(j);
            sb6.append("_");
            sb6.append(j2);
            str25 = sb6.toString();
        }
        str6 = formatString;
        str7 = str25;
        String str262 = str7 + "_" + MD52;
        string = notificationsSettings.getString(str262, null);
        String string32 = notificationsSettings.getString(str262 + "_s", null);
        StringBuilder sb42 = new StringBuilder();
        z4 = z10;
        if (string != null) {
        }
        str17 = str8;
        str19 = str9;
        str18 = null;
        z5 = false;
        if (z5) {
        }
        str20 = str14;
        if (!z4) {
        }
        while (r11 < jArr2.length) {
        }
        sb.append(i4);
        if (uri != null) {
        }
        i5 = i2;
        sb.append(i5);
        if (!z) {
        }
        MD5 = Utilities.MD5(sb.toString());
        if (!z3) {
        }
        if (str17 == null) {
        }
        return str17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(58:126|127|(7:129|(2:131|(1:133)(1:586))(1:587)|134|(2:139|140)|581|582|(2:584|140)(1:585))(1:588)|141|142|(3:563|564|(2:566|567)(4:(1:(2:576|(1:578)(1:579))(1:571))(1:580)|572|(1:574)|575))(4:145|(3:147|(6:156|(1:158)(1:171)|159|(2:(1:163)(2:165|(1:167)(1:168))|164)|169|170)|155)|173|174)|(50:182|(1:561)(4:187|(1:189)(1:560)|(2:191|(1:193)(2:194|(1:196)(49:555|(1:557)(1:558)|(2:199|(41:201|202|(5:204|(1:206)(1:551)|207|(1:209)(1:550)|210)(1:552)|211|(5:541|542|(1:544)(1:549)|545|(1:547)(1:548))(1:(1:(3:217|(1:219)(1:517)|220)(3:518|(1:520)(1:522)|521))(38:523|(5:(1:526)(1:539)|527|(1:529)(2:(1:536)(1:538)|537)|530|(33:532|(1:223)(1:516)|224|(1:515)(1:228)|229|(1:514)(1:232)|(1:236)|(1:513)(1:241)|(6:243|(1:245)(1:511)|246|(1:248)|249|(1:251)(1:510))(1:512)|(3:255|256|(1:260))|(1:265)(1:509)|266|(1:268)|269|270|(1:272)(2:449|(2:(1:452)(2:454|(1:456))|453)(2:457|(4:459|(2:462|460)|463|464)(18:465|(4:467|(1:(1:470)(2:471|(1:473)))|474|(16:(3:483|(1:491)|492)(3:493|(2:495|(1:503))|492)|275|(1:282)|283|284|285|(1:287)|288|(3:290|291|292)(1:445)|293|(1:295)(1:(14:429|(1:431)(3:432|433|(4:435|(1:437)(1:442)|438|(1:440)))|297|(2:425|426)(1:(4:302|303|(1:305)|405)(5:406|(2:408|(1:410)(3:411|(2:413|(1:415))(2:416|(2:418|(2:420|421)))|405))|422|(1:424)|405))|306|(1:404)(7:(3:400|(1:402)|403)|(2:316|(8:318|(1:(5:324|(1:326)(1:381)|327|(1:329)(2:369|(1:371)(8:(2:379|380)(2:375|(1:377))|378|333|(2:339|(7:341|(4:343|(4:345|(3:347|(1:349)|350)(1:353)|351|352)|354|355)|356|357|(1:365)|366|367))|368|(4:359|361|363|365)|366|367))|330)(6:382|383|(0)(0)|327|(0)(0)|330))|384|383|(0)(0)|327|(0)(0)|330)(2:385|(1:387)(3:388|(2:390|(2:394|395))|398)))|399|(0)(0)|327|(0)(0)|330)|331|332|333|(4:335|337|339|(0))|368|(0)|366|367))|296|297|(1:299)|425|426))(2:504|(1:508))|274|275|(3:278|280|282)|283|284|285|(0)|288|(0)(0)|293|(0)(0)|296|297|(0)|425|426)))|273|274|275|(0)|283|284|285|(0)|288|(0)(0)|293|(0)(0)|296|297|(0)|425|426)(1:533))(1:540)|534|(0)(0)|224|(1:226)|515|229|(0)|514|(2:234|236)|(1:238)|513|(0)(0)|(4:253|255|256|(2:258|260))|(0)(0)|266|(0)|269|270|(0)(0)|273|274|275|(0)|283|284|285|(0)|288|(0)(0)|293|(0)(0)|296|297|(0)|425|426))|221|(0)(0)|224|(0)|515|229|(0)|514|(0)|(0)|513|(0)(0)|(0)|(0)(0)|266|(0)|269|270|(0)(0)|273|274|275|(0)|283|284|285|(0)|288|(0)(0)|293|(0)(0)|296|297|(0)|425|426))(1:554)|553|202|(0)(0)|211|(1:213)|541|542|(0)(0)|545|(0)(0)|221|(0)(0)|224|(0)|515|229|(0)|514|(0)|(0)|513|(0)(0)|(0)|(0)(0)|266|(0)|269|270|(0)(0)|273|274|275|(0)|283|284|285|(0)|288|(0)(0)|293|(0)(0)|296|297|(0)|425|426)))|559)|197|(0)(0)|553|202|(0)(0)|211|(0)|541|542|(0)(0)|545|(0)(0)|221|(0)(0)|224|(0)|515|229|(0)|514|(0)|(0)|513|(0)(0)|(0)|(0)(0)|266|(0)|269|270|(0)(0)|273|274|275|(0)|283|284|285|(0)|288|(0)(0)|293|(0)(0)|296|297|(0)|425|426)|562|(1:184)|561|197|(0)(0)|553|202|(0)(0)|211|(0)|541|542|(0)(0)|545|(0)(0)|221|(0)(0)|224|(0)|515|229|(0)|514|(0)|(0)|513|(0)(0)|(0)|(0)(0)|266|(0)|269|270|(0)(0)|273|274|275|(0)|283|284|285|(0)|288|(0)(0)|293|(0)(0)|296|297|(0)|425|426) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r56.currentAccount != org.telegram.messenger.UserConfig.selectedAccount) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0c91, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0bd2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0bee, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0429 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0447 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0528 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0722 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0767 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x07de A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x095c A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x096f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0977 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0990 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0a05 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0a13 A[Catch: Exception -> 0x0066, TRY_ENTER, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0b8a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0bca A[Catch: all -> 0x0bd2, TryCatch #0 {all -> 0x0bd2, blocks: (B:285:0x0baf, B:287:0x0bca, B:288:0x0bd4, B:292:0x0bdc, B:293:0x0be4), top: B:284:0x0baf }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0bf3 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0d95 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0da5 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0e06 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0eb4 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0db0  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0da0  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a2a A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0909 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0915 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140 A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x043c A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x041e A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:599:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x014d A[Catch: Exception -> 0x0066, TryCatch #3 {Exception -> 0x0066, blocks: (B:12:0x003a, B:13:0x0045, B:15:0x004d, B:19:0x0064, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:36:0x008f, B:39:0x0095, B:40:0x00a9, B:42:0x00b1, B:44:0x00eb, B:46:0x0110, B:48:0x0119, B:50:0x0122, B:53:0x0129, B:56:0x0140, B:58:0x021e, B:59:0x0251, B:61:0x0263, B:63:0x0269, B:65:0x026d, B:67:0x0289, B:68:0x0290, B:71:0x02a5, B:75:0x02b1, B:77:0x02bd, B:78:0x02c3, B:80:0x02ce, B:82:0x02d4, B:84:0x02e0, B:85:0x02fc, B:87:0x030c, B:89:0x031c, B:91:0x0322, B:94:0x037e, B:609:0x039b, B:102:0x03bd, B:104:0x03c3, B:105:0x03d1, B:107:0x03d7, B:112:0x03e2, B:115:0x03f5, B:121:0x0425, B:123:0x0429, B:129:0x0447, B:131:0x0450, B:133:0x0458, B:134:0x0485, B:136:0x0490, B:141:0x050e, B:145:0x0533, B:147:0x0555, B:149:0x056b, B:151:0x056f, B:158:0x0579, B:159:0x0581, B:163:0x058e, B:165:0x05a3, B:167:0x05a9, B:168:0x05bd, B:169:0x05d1, B:155:0x05d6, B:174:0x05e0, B:177:0x0661, B:187:0x067a, B:189:0x0698, B:191:0x06c9, B:193:0x06d3, B:194:0x06e8, B:196:0x06f7, B:199:0x0722, B:202:0x0746, B:204:0x0767, B:206:0x0795, B:207:0x07af, B:209:0x07bf, B:211:0x07d8, B:213:0x07de, B:217:0x07f0, B:219:0x0804, B:220:0x0817, B:224:0x0956, B:226:0x095c, B:234:0x0977, B:236:0x097d, B:243:0x0990, B:246:0x099d, B:249:0x09a6, B:263:0x09c7, B:266:0x09d2, B:268:0x0a05, B:269:0x0a0c, B:272:0x0a13, B:275:0x0b38, B:278:0x0b8c, B:280:0x0b90, B:282:0x0b96, B:295:0x0bf3, B:303:0x0c58, B:310:0x0c9d, B:314:0x0cd6, B:316:0x0cde, B:318:0x0ce2, B:320:0x0cea, B:324:0x0cf5, B:326:0x0d95, B:329:0x0da5, B:333:0x0de9, B:335:0x0def, B:337:0x0df3, B:339:0x0dfe, B:341:0x0e06, B:343:0x0e12, B:345:0x0e22, B:347:0x0e36, B:349:0x0e55, B:350:0x0e5a, B:352:0x0e87, B:355:0x0e94, B:359:0x0eb4, B:361:0x0eba, B:363:0x0ec2, B:365:0x0ec8, B:366:0x0eea, B:371:0x0db3, B:377:0x0dc7, B:380:0x0dd3, B:382:0x0d1f, B:384:0x0d26, B:385:0x0d29, B:387:0x0d35, B:390:0x0d40, B:392:0x0d48, B:397:0x0d81, B:398:0x0d8a, B:400:0x0ca7, B:402:0x0caf, B:403:0x0cd1, B:404:0x0ddb, B:413:0x0c6d, B:418:0x0c7a, B:422:0x0c83, B:426:0x0c8c, B:429:0x0bfb, B:431:0x0c08, B:448:0x0bee, B:449:0x0a2a, B:452:0x0a30, B:453:0x0a49, B:456:0x0a42, B:457:0x0a5e, B:459:0x0a74, B:460:0x0a7d, B:462:0x0a85, B:464:0x0a96, B:465:0x0a9f, B:467:0x0aa5, B:470:0x0ab2, B:473:0x0abc, B:474:0x0abf, B:476:0x0ac5, B:478:0x0ace, B:480:0x0ad7, B:483:0x0adf, B:485:0x0ae5, B:487:0x0ae9, B:489:0x0af1, B:495:0x0b00, B:497:0x0b06, B:499:0x0b0a, B:501:0x0b12, B:504:0x0b19, B:506:0x0b28, B:508:0x0b2e, B:517:0x0810, B:518:0x083f, B:520:0x0853, B:521:0x0866, B:522:0x085f, B:527:0x089f, B:529:0x08a7, B:530:0x08bf, B:537:0x08ba, B:542:0x08fd, B:544:0x0909, B:545:0x091c, B:549:0x0915, B:551:0x07a1, B:555:0x0703, B:557:0x0707, B:564:0x05ef, B:571:0x0607, B:572:0x064a, B:575:0x0650, B:576:0x061b, B:578:0x0621, B:579:0x0635, B:581:0x049f, B:584:0x04ac, B:585:0x04c7, B:586:0x0465, B:589:0x0431, B:591:0x043c, B:594:0x0410, B:596:0x0417, B:597:0x041e, B:602:0x03c8, B:603:0x03cd, B:615:0x033a, B:617:0x0340, B:622:0x02ed, B:624:0x02a2, B:626:0x014d, B:628:0x0153, B:629:0x0156, B:632:0x015f, B:633:0x0168, B:634:0x017d, B:636:0x0184, B:637:0x019f, B:639:0x01a6, B:641:0x01ae, B:642:0x01ea, B:643:0x0134, B:645:0x0240, B:256:0x09b9, B:395:0x0d52), top: B:11:0x003a, inners: #2, #4 }] */
    /* JADX WARN: Type inference failed for: r0v89, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v92, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v94, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v12, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.telegram.messenger.BaseController, org.telegram.messenger.NotificationsController] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r3v168, types: [org.telegram.messenger.MessageObject] */
    /* JADX WARN: Type inference failed for: r3v51, types: [android.net.Uri] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showOrUpdateNotification(boolean z) {
        String str;
        int i;
        MessageObject messageObject;
        Bitmap bitmap;
        long j;
        long j2;
        long j3;
        boolean z2;
        SharedPreferences sharedPreferences;
        long j4;
        String str2;
        String str3;
        int i2;
        String str4;
        long j5;
        TLRPC.Chat chat;
        boolean z3;
        TLRPC.User user;
        String str5;
        long j6;
        long j7;
        boolean isGlobalNotificationsEnabled;
        SharedPreferences sharedPreferences2;
        ?? r1;
        String userName;
        boolean z4;
        boolean z5;
        String string;
        boolean z6;
        String str6;
        String string2;
        boolean z7;
        Bitmap bitmap2;
        String str7;
        TLRPC.Chat chat2;
        String str8;
        String str9;
        long j8;
        SharedPreferences sharedPreferences3;
        MessageObject messageObject2;
        String stringForMessage;
        boolean isSilentMessage;
        String str10;
        String str11;
        boolean z8;
        String str12;
        SharedPreferences sharedPreferences4;
        long j9;
        boolean z9;
        long j10;
        boolean z10;
        boolean z11;
        long j11;
        long j12;
        long j13;
        boolean z12;
        int i3;
        String str13;
        int i4;
        Integer num;
        boolean z13;
        String str14;
        String str15;
        Integer num2;
        boolean z14;
        long j14;
        String string3;
        boolean z15;
        int i5;
        int i6;
        int i7;
        boolean z16;
        String str16;
        int i8;
        String str17;
        int i9;
        boolean z17;
        String str18;
        boolean z18;
        int i10;
        boolean z19;
        String str19;
        int i11;
        boolean z20;
        int i12;
        boolean z21;
        int i13;
        Object obj;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        long[] jArr;
        int i14;
        int i15;
        long[] jArr2;
        ?? r11;
        int i16;
        int i17;
        boolean z22;
        TLRPC.ReplyMarkup replyMarkup;
        int i18;
        int i19;
        int i20;
        long[] jArr3;
        int i21;
        ?? r0;
        int i22;
        String str20;
        int ringerMode;
        String string4;
        boolean z23;
        String string5;
        boolean z24;
        String string6;
        boolean z25;
        boolean z26;
        int i23;
        String str21;
        String replace;
        int i24;
        String formatPluralString;
        String str22 = "file://";
        if (getUserConfig().isClientActivated() && (!this.pushMessages.isEmpty() || !this.storyPushMessages.isEmpty())) {
            long j15 = !SharedConfig.showNotificationsForAllAccounts ? 0L : 0L;
            try {
                getConnectionsManager().resumeNetworkMaybe();
                long j16 = j15;
                StoryNotification storyNotification = null;
                for (int i25 = 0; i25 < this.pushMessages.size(); i25++) {
                    MessageObject messageObject3 = this.pushMessages.get(i25);
                    long j17 = messageObject3.messageOwner.date;
                    if (j16 < j17) {
                        j16 = j17;
                        storyNotification = messageObject3;
                    }
                }
                for (int i26 = 0; i26 < this.storyPushMessages.size(); i26++) {
                    StoryNotification storyNotification2 = this.storyPushMessages.get(i26);
                    long j18 = storyNotification2.date;
                    if (j16 < j18 / 1000) {
                        storyNotification = storyNotification2;
                        j16 = j18 / 1000;
                    }
                }
                if (storyNotification == null) {
                    return;
                }
                if (!(storyNotification instanceof StoryNotification)) {
                    str = "file://";
                    i = 0;
                    messageObject = this.pushMessages.get(0);
                    bitmap = null;
                } else {
                    StoryNotification storyNotification3 = storyNotification;
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    int i27 = 0;
                    int i28 = 0;
                    boolean z27 = false;
                    while (i27 < this.storyPushMessages.size()) {
                        z27 |= this.storyPushMessages.get(i27).hidden;
                        tL_message.date = Math.min(tL_message.date, (int) (this.storyPushMessages.get(i27).date / 1000));
                        i28 += this.storyPushMessages.get(i27).dateByIds.size();
                        i27++;
                        str22 = str22;
                    }
                    str = str22;
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    long j19 = storyNotification3.dialogId;
                    tL_peerUser.user_id = j19;
                    tL_message.dialog_id = j19;
                    tL_message.peer_id = tL_peerUser;
                    ArrayList<String> arrayList = new ArrayList<>();
                    ArrayList<Object> arrayList2 = new ArrayList<>();
                    parseStoryPushes(arrayList, arrayList2);
                    Bitmap loadMultipleAvatars = SharedConfig.getDevicePerformanceClass() >= 1 ? loadMultipleAvatars(arrayList2) : null;
                    if (!z27 && this.storyPushMessages.size() < 2 && !arrayList.isEmpty()) {
                        formatPluralString = arrayList.get(0);
                        i24 = 0;
                        String str23 = formatPluralString;
                        if (!z27) {
                            tL_message.message = LocaleController.formatPluralString("StoryNotificationHidden", i28, new Object[i24]);
                        } else if (arrayList.isEmpty()) {
                            tL_message.message = "";
                        } else if (arrayList.size() == 1) {
                            if (i28 == 1) {
                                tL_message.message = LocaleController.getString("StoryNotificationSingle");
                            } else {
                                tL_message.message = LocaleController.formatPluralString("StoryNotification1", i28, arrayList.get(0));
                            }
                        } else if (arrayList.size() == 2) {
                            tL_message.message = LocaleController.formatString(R.string.StoryNotification2, arrayList.get(0), arrayList.get(1));
                        } else if (arrayList.size() == 3 && this.storyPushMessages.size() == 3) {
                            tL_message.message = LocaleController.formatString(R.string.StoryNotification3, cutLastName(arrayList.get(0)), cutLastName(arrayList.get(1)), cutLastName(arrayList.get(2)));
                        } else {
                            tL_message.message = LocaleController.formatPluralString("StoryNotification4", this.storyPushMessages.size() - 2, cutLastName(arrayList.get(0)), cutLastName(arrayList.get(1)));
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, tL_message, tL_message.message, str23, str23, false, false, false, false);
                            messageObject4.isStoryPush = true;
                            messageObject = messageObject4;
                            bitmap = loadMultipleAvatars;
                            i = 0;
                        }
                        MessageObject messageObject42 = new MessageObject(this.currentAccount, tL_message, tL_message.message, str23, str23, false, false, false, false);
                        messageObject42.isStoryPush = true;
                        messageObject = messageObject42;
                        bitmap = loadMultipleAvatars;
                        i = 0;
                    }
                    i24 = 0;
                    formatPluralString = LocaleController.formatPluralString("Stories", i28, new Object[0]);
                    String str232 = formatPluralString;
                    if (!z27) {
                    }
                    MessageObject messageObject422 = new MessageObject(this.currentAccount, tL_message, tL_message.message, str232, str232, false, false, false, false);
                    messageObject422.isStoryPush = true;
                    messageObject = messageObject422;
                    bitmap = loadMultipleAvatars;
                    i = 0;
                }
                SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
                int i29 = notificationsSettings.getInt("dismissDate", i);
                if (!messageObject.isStoryPush && messageObject.messageOwner.date <= i29) {
                    dismissNotification();
                    return;
                }
                long dialogId = messageObject.getDialogId();
                long topicId = MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, getMessagesController().isForum(messageObject));
                boolean z28 = messageObject.isStoryPush;
                long fromChatId = messageObject.messageOwner.mentioned ? messageObject.getFromChatId() : dialogId;
                messageObject.getId();
                TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                long j20 = peer.chat_id;
                if (j20 == j15) {
                    j20 = peer.channel_id;
                }
                long j21 = j20;
                long j22 = peer.user_id;
                if (messageObject.isFromUser() && (j22 == j15 || j22 == getUserConfig().getClientUserId())) {
                    j22 = messageObject.messageOwner.from_id.user_id;
                }
                if (messageObject.getDialogId() != UserObject.VERIFY || messageObject.getForwardedFromId() == null) {
                    j = j22;
                    j2 = j21;
                } else if (messageObject.getForwardedFromId().longValue() >= j15) {
                    j = messageObject.getForwardedFromId().longValue();
                    j2 = j15;
                } else {
                    j2 = messageObject.getForwardedFromId().longValue();
                    j = j15;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j));
                int i30 = (j2 > j15 ? 1 : (j2 == j15 ? 0 : -1));
                if (i30 != 0) {
                    long j23 = j2;
                    TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(j23));
                    if (chat4 == null && messageObject.isFcmMessage()) {
                        z3 = messageObject.localChannel;
                        z2 = z28;
                        sharedPreferences = notificationsSettings;
                        j4 = fromChatId;
                        str2 = "com.android.systemui";
                        str3 = ".provider";
                        i2 = i30;
                        str4 = "";
                        j5 = topicId;
                        j3 = j23;
                    } else if (!ChatObject.isChannel(chat4) || chat4.megagroup) {
                        z2 = z28;
                        sharedPreferences = notificationsSettings;
                        j4 = fromChatId;
                        str2 = "com.android.systemui";
                        str3 = ".provider";
                        i2 = i30;
                        str4 = "";
                        j5 = topicId;
                        j3 = j23;
                        z3 = false;
                    } else {
                        z2 = z28;
                        sharedPreferences = notificationsSettings;
                        j4 = fromChatId;
                        str2 = "com.android.systemui";
                        str3 = ".provider";
                        i2 = i30;
                        str4 = "";
                        j5 = topicId;
                        j3 = j23;
                        z3 = true;
                    }
                    chat = chat4;
                } else {
                    j3 = j2;
                    z2 = z28;
                    sharedPreferences = notificationsSettings;
                    j4 = fromChatId;
                    str2 = "com.android.systemui";
                    str3 = ".provider";
                    i2 = i30;
                    str4 = "";
                    j5 = topicId;
                    chat = null;
                    z3 = false;
                }
                int notifyOverride = getNotifyOverride(sharedPreferences, j4, j5);
                long j24 = j4;
                long j25 = j5;
                if (notifyOverride == -1) {
                    try {
                        Boolean valueOf = Boolean.valueOf(z3);
                        boolean z29 = messageObject.isReactionPush;
                        NotificationsController notificationsController = this;
                        SharedPreferences sharedPreferences5 = sharedPreferences;
                        user = user3;
                        str5 = "userId";
                        j6 = dialogId;
                        j7 = j25;
                        isGlobalNotificationsEnabled = notificationsController.isGlobalNotificationsEnabled(j6, valueOf, z29, z29);
                        sharedPreferences2 = sharedPreferences5;
                        r1 = notificationsController;
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                        return;
                    }
                } else {
                    NotificationsController notificationsController2 = this;
                    sharedPreferences2 = sharedPreferences;
                    user = user3;
                    str5 = "userId";
                    j6 = dialogId;
                    j7 = j25;
                    if (notifyOverride != 2) {
                        isGlobalNotificationsEnabled = true;
                        r1 = notificationsController2;
                    } else {
                        isGlobalNotificationsEnabled = false;
                        r1 = notificationsController2;
                    }
                }
                if (((i2 != 0 && chat == null) || user == null) && messageObject.isFcmMessage()) {
                    userName = messageObject.localName;
                } else if (chat != null) {
                    userName = r1.getTitle(chat);
                } else {
                    userName = UserObject.getUserName(user);
                }
                if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
                    z4 = false;
                    boolean z30 = isGlobalNotificationsEnabled;
                    String str24 = userName;
                    boolean equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                    if (DialogObject.isEncryptedDialog(j6)) {
                        if (equalsIgnoreCase) {
                            z5 = equalsIgnoreCase;
                        } else {
                            z5 = equalsIgnoreCase;
                            if (r1.pushDialogs.size() <= 1) {
                            }
                        }
                        if (!z4) {
                            string = str24;
                            z6 = true;
                            if (!messageObject.isReactionPush && !messageObject.isStoryReactionPush) {
                                str6 = string;
                                string2 = str6;
                                if (z5) {
                                    z7 = z6;
                                    if (UserConfig.getActivatedAccountsCount() <= 1) {
                                        str9 = str4;
                                    } else if (r1.pushDialogs.size() == 1) {
                                        str9 = UserObject.getFirstName(r1.getUserConfig().getCurrentUser());
                                    } else {
                                        str9 = UserObject.getFirstName(r1.getUserConfig().getCurrentUser()) + "・";
                                    }
                                    bitmap2 = bitmap;
                                    if (r1.pushDialogs.size() == 1 && Build.VERSION.SDK_INT >= 23) {
                                        str7 = "currentAccount";
                                        chat2 = chat;
                                        str8 = "chatId";
                                    }
                                    str7 = "currentAccount";
                                    if (r1.pushDialogs.size() == 1) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str9);
                                        chat2 = chat;
                                        sb.append(LocaleController.formatPluralString("NewMessages", r1.total_unread_count, new Object[0]));
                                        str9 = sb.toString();
                                        str8 = "chatId";
                                    } else {
                                        chat2 = chat;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str9);
                                        str8 = "chatId";
                                        sb2.append(LocaleController.formatString(R.string.NotificationMessagesPeopleDisplayOrder, LocaleController.formatPluralString("NewMessages", r1.total_unread_count, new Object[0]), LocaleController.formatPluralString("FromChats", r1.pushDialogs.size(), new Object[0])));
                                        str9 = sb2.toString();
                                    }
                                } else {
                                    z7 = z6;
                                    bitmap2 = bitmap;
                                    str7 = "currentAccount";
                                    chat2 = chat;
                                    str8 = "chatId";
                                    str9 = str4;
                                }
                                NotificationCompat.Builder builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                                long j26 = j7;
                                if (r1.pushMessages.size() > 1 || z5) {
                                    j8 = j6;
                                    sharedPreferences3 = sharedPreferences2;
                                    boolean[] zArr = new boolean[1];
                                    messageObject2 = messageObject;
                                    stringForMessage = r1.getStringForMessage(messageObject2, false, zArr, null);
                                    isSilentMessage = r1.isSilentMessage(messageObject2);
                                    if (stringForMessage != null) {
                                        return;
                                    }
                                    if (!z7) {
                                        str10 = stringForMessage;
                                    } else if (chat2 != null && !z5) {
                                        str10 = stringForMessage.replace(" @ " + string2, str4);
                                    } else if (zArr[0]) {
                                        str10 = stringForMessage.replace(string2 + ": ", str4);
                                    } else {
                                        str10 = stringForMessage.replace(string2 + " ", str4);
                                    }
                                    builder.setContentText(str10);
                                    if (z5) {
                                        str9 = str10;
                                    }
                                    builder.setStyle(new NotificationCompat.BigTextStyle().bigText(str10));
                                    str11 = stringForMessage;
                                } else {
                                    builder.setContentText(str9);
                                    NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                                    inboxStyle.setBigContentTitle(string2);
                                    int min = Math.min(10, r1.pushMessages.size());
                                    sharedPreferences3 = sharedPreferences2;
                                    boolean[] zArr2 = new boolean[1];
                                    j8 = j6;
                                    ?? r2 = 2;
                                    int i31 = 0;
                                    String str25 = null;
                                    while (i31 < min) {
                                        MessageObject messageObject5 = r1.pushMessages.get(i31);
                                        MessageObject messageObject6 = messageObject;
                                        int i32 = i31;
                                        int i33 = min;
                                        String stringForMessage2 = r1.getStringForMessage(messageObject5, false, zArr2, null);
                                        if (stringForMessage2 != null && (messageObject5.isStoryPush || messageObject5.messageOwner.date > i29)) {
                                            if (r2 == 2) {
                                                str21 = stringForMessage2;
                                                r2 = r1.isSilentMessage(messageObject5);
                                            } else {
                                                str21 = str25;
                                                r2 = r2;
                                            }
                                            if (r1.pushDialogs.size() == 1 && z7) {
                                                if (chat2 != null) {
                                                    replace = stringForMessage2.replace(" @ " + string2, str4);
                                                } else if (zArr2[0]) {
                                                    replace = stringForMessage2.replace(string2 + ": ", str4);
                                                } else {
                                                    replace = stringForMessage2.replace(string2 + " ", str4);
                                                }
                                                stringForMessage2 = replace;
                                            }
                                            inboxStyle.addLine(stringForMessage2);
                                            str25 = str21;
                                        }
                                        i31 = i32 + 1;
                                        min = i33;
                                        messageObject = messageObject6;
                                        r2 = r2;
                                    }
                                    inboxStyle.setSummaryText(str9);
                                    builder.setStyle(inboxStyle);
                                    isSilentMessage = r2 == true ? 1 : 0;
                                    str11 = str25;
                                    messageObject2 = messageObject;
                                }
                                if (z && z30 && !MediaController.getInstance().isRecordingAudio() && !isSilentMessage) {
                                    z8 = false;
                                    if (z8 && j8 == j24 && chat2 != null) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(NotificationsSettingsFacade.PROPERTY_CUSTOM);
                                        j9 = j8;
                                        sb3.append(j9);
                                        sharedPreferences4 = sharedPreferences3;
                                        boolean z31 = sharedPreferences4.getBoolean(sb3.toString(), false);
                                        int i34 = NotificationCenter.needDeleteDialog;
                                        if (z31) {
                                            i23 = sharedPreferences4.getInt("smart_max_count_" + j9, 2);
                                            i34 = sharedPreferences4.getInt("smart_delay_" + j9, NotificationCenter.needDeleteDialog);
                                        } else {
                                            i23 = 2;
                                        }
                                        if (i23 != 0) {
                                            Point point = (Point) r1.smartNotificationsDialogs.get(j9);
                                            if (point == null) {
                                                r1.smartNotificationsDialogs.put(j9, new Point(1, (int) (SystemClock.elapsedRealtime() / 1000)));
                                            } else {
                                                int i35 = point.y + i34;
                                                str12 = str4;
                                                if (i35 < SystemClock.elapsedRealtime() / 1000) {
                                                    point.set(1, (int) (SystemClock.elapsedRealtime() / 1000));
                                                } else {
                                                    int i36 = point.x;
                                                    if (i36 < i23) {
                                                        z9 = isSilentMessage;
                                                        point.set(i36 + 1, (int) (SystemClock.elapsedRealtime() / 1000));
                                                    } else {
                                                        z9 = isSilentMessage;
                                                        z8 = true;
                                                    }
                                                    if (z8) {
                                                        j10 = j26;
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder();
                                                        sb4.append("sound_enabled_");
                                                        j10 = j26;
                                                        sb4.append(getSharedPrefKey(j9, j10));
                                                        if (!sharedPreferences4.getBoolean(sb4.toString(), true)) {
                                                            z10 = true;
                                                            String path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                                            z11 = ApplicationLoader.mainInterfacePaused;
                                                            boolean z32 = !z11;
                                                            getSharedPrefKey(j9, j10);
                                                            j11 = j9;
                                                            j12 = j10;
                                                            if (r1.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j11, j12, false)) {
                                                                j13 = j11;
                                                                z12 = z10;
                                                                i3 = 3;
                                                                str13 = null;
                                                                i4 = 0;
                                                                num = null;
                                                                z13 = false;
                                                            } else {
                                                                int property = r1.dialogsNotificationsFacade.getProperty("vibrate_", j11, j12, 0);
                                                                int property2 = r1.dialogsNotificationsFacade.getProperty("priority_", j11, j12, 3);
                                                                long property3 = r1.dialogsNotificationsFacade.getProperty("sound_document_id_", j11, j12, 0L);
                                                                if (property3 != 0) {
                                                                    str13 = r1.getMediaDataController().ringtoneDataStore.getSoundPath(property3);
                                                                    z26 = true;
                                                                } else {
                                                                    str13 = r1.dialogsNotificationsFacade.getPropertyString("sound_path_", j11, j12, null);
                                                                    z26 = false;
                                                                }
                                                                int property4 = r1.dialogsNotificationsFacade.getProperty("color_", j11, j12, 0);
                                                                j13 = j11;
                                                                if (property4 != 0) {
                                                                    num = Integer.valueOf(property4);
                                                                    z12 = z10;
                                                                    z13 = z26;
                                                                } else {
                                                                    z12 = z10;
                                                                    z13 = z26;
                                                                    num = null;
                                                                }
                                                                i4 = property;
                                                                i3 = property2;
                                                            }
                                                            if (!messageObject2.isReactionPush || messageObject2.isStoryReactionPush) {
                                                                str14 = string2;
                                                                str15 = str9;
                                                                num2 = num;
                                                                z14 = z13;
                                                                j14 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                                                                if (j14 == 0) {
                                                                    string3 = r1.getMediaDataController().ringtoneDataStore.getSoundPath(j14);
                                                                    z15 = true;
                                                                } else {
                                                                    string3 = sharedPreferences4.getString("ReactionSoundPath", path);
                                                                    z15 = false;
                                                                }
                                                                int i37 = sharedPreferences4.getInt("vibrate_react", 0);
                                                                int i38 = sharedPreferences4.getInt("priority_react", 1);
                                                                String str26 = string3;
                                                                int i39 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                                                                if (messageObject2.isStoryReactionPush) {
                                                                    i5 = i39;
                                                                    i6 = i38;
                                                                    i7 = i37;
                                                                    z16 = z15;
                                                                    str16 = str26;
                                                                    i8 = 4;
                                                                } else {
                                                                    i5 = i39;
                                                                    i6 = i38;
                                                                    i7 = i37;
                                                                    z16 = z15;
                                                                    str16 = str26;
                                                                    i8 = 5;
                                                                }
                                                            } else if (i2 == 0) {
                                                                str14 = string2;
                                                                str15 = str9;
                                                                num2 = num;
                                                                z14 = z13;
                                                                if (j != 0) {
                                                                    long j27 = sharedPreferences4.getLong(z2 ? "StoriesSoundDocId" : "GlobalSoundDocId", 0L);
                                                                    if (j27 != 0) {
                                                                        string4 = r1.getMediaDataController().ringtoneDataStore.getSoundPath(j27);
                                                                        z23 = true;
                                                                    } else {
                                                                        string4 = sharedPreferences4.getString(z2 ? "StoriesSoundPath" : "GlobalSoundPath", path);
                                                                        z23 = false;
                                                                    }
                                                                    int i40 = sharedPreferences4.getInt("vibrate_messages", 0);
                                                                    int i41 = sharedPreferences4.getInt("priority_messages", 1);
                                                                    String str27 = string4;
                                                                    i5 = sharedPreferences4.getInt("MessagesLed", -16776961);
                                                                    i6 = i41;
                                                                    i7 = i40;
                                                                    z16 = z23;
                                                                    if (z2) {
                                                                        str17 = str12;
                                                                        str16 = str27;
                                                                        i9 = 4;
                                                                        i8 = 3;
                                                                        if (i7 != i9) {
                                                                            z17 = true;
                                                                            i7 = 0;
                                                                        } else {
                                                                            z17 = false;
                                                                        }
                                                                        if (!TextUtils.isEmpty(str13) || TextUtils.equals(str16, str13)) {
                                                                            str18 = str16;
                                                                            z18 = true;
                                                                        } else {
                                                                            z16 = z14;
                                                                            str18 = str13;
                                                                            z18 = false;
                                                                        }
                                                                        if (i3 != 3 || i6 == i3) {
                                                                            i10 = i6;
                                                                        } else {
                                                                            i10 = i3;
                                                                            z18 = false;
                                                                        }
                                                                        if (num2 != null && num2.intValue() != i5) {
                                                                            i5 = num2.intValue();
                                                                            z18 = false;
                                                                        }
                                                                        if (i4 != 0 || i4 == 4 || i4 == i7) {
                                                                            i4 = i7;
                                                                            z19 = z18;
                                                                        } else {
                                                                            z19 = false;
                                                                        }
                                                                        if (z11) {
                                                                            str19 = !sharedPreferences4.getBoolean("EnableInAppSounds", true) ? null : str18;
                                                                            if (!sharedPreferences4.getBoolean("EnableInAppVibrate", true)) {
                                                                                i4 = 2;
                                                                            }
                                                                            i10 = sharedPreferences4.getBoolean("EnableInAppPopup", true) ? 2 : 0;
                                                                        } else {
                                                                            str19 = str18;
                                                                        }
                                                                        if (z17 && i4 != 2) {
                                                                            try {
                                                                                ringerMode = audioManager.getRingerMode();
                                                                                if (ringerMode != 0 && ringerMode != 1) {
                                                                                    i4 = 2;
                                                                                }
                                                                            } catch (Exception e2) {
                                                                                FileLog.e(e2);
                                                                            }
                                                                        }
                                                                        if (z12) {
                                                                            i11 = i5;
                                                                        } else {
                                                                            str19 = null;
                                                                            i10 = 0;
                                                                            i4 = 0;
                                                                            i11 = 0;
                                                                        }
                                                                        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                                        StringBuilder sb5 = new StringBuilder();
                                                                        sb5.append("com.tmessages.openchat");
                                                                        boolean z33 = z19;
                                                                        boolean z34 = z16;
                                                                        sb5.append(Math.random());
                                                                        sb5.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                                        intent.setAction(sb5.toString());
                                                                        intent.setFlags(67108864);
                                                                        if (messageObject2.isOauthPush) {
                                                                            intent.putExtra("oauth_url", messageObject2.localName);
                                                                        }
                                                                        if (!messageObject2.isStoryReactionPush) {
                                                                            intent.putExtra("storyId", Math.abs(messageObject2.getId()));
                                                                            obj = path;
                                                                            z21 = z34;
                                                                            i13 = i4;
                                                                            i12 = i11;
                                                                            z20 = z9;
                                                                        } else if (messageObject2.isLiveStoryPush) {
                                                                            if (i2 != 0) {
                                                                                z20 = z9;
                                                                                intent.putExtra(str8, j3);
                                                                            } else {
                                                                                z20 = z9;
                                                                                if (j != 0) {
                                                                                    intent.putExtra(str5, j);
                                                                                }
                                                                            }
                                                                            intent.putExtra("storyId", Math.abs(messageObject2.getId()));
                                                                            obj = path;
                                                                            z21 = z34;
                                                                            i13 = i4;
                                                                            i12 = i11;
                                                                        } else {
                                                                            z20 = z9;
                                                                            long j28 = j3;
                                                                            String str28 = str5;
                                                                            String str29 = str8;
                                                                            i12 = i11;
                                                                            long j29 = j;
                                                                            z21 = z34;
                                                                            i13 = i4;
                                                                            if (messageObject2.isStoryPush) {
                                                                                long[] jArr4 = new long[r1.storyPushMessages.size()];
                                                                                for (int i42 = 0; i42 < r1.storyPushMessages.size(); i42++) {
                                                                                    jArr4[i42] = r1.storyPushMessages.get(i42).dialogId;
                                                                                }
                                                                                intent.putExtra("storyDialogIds", jArr4);
                                                                                obj = path;
                                                                            } else {
                                                                                if (!DialogObject.isEncryptedDialog(j13)) {
                                                                                    obj = path;
                                                                                    if (r1.pushDialogs.size() == 1) {
                                                                                        if (i2 != 0) {
                                                                                            intent.putExtra(str29, j28);
                                                                                        } else if (j29 != 0) {
                                                                                            intent.putExtra(str28, j29);
                                                                                        }
                                                                                    }
                                                                                    if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter && r1.pushDialogs.size() == 1 && Build.VERSION.SDK_INT < 28) {
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
                                                                                        String str30 = str7;
                                                                                        intent.putExtra(str30, r1.currentAccount);
                                                                                        builder.setContentTitle(str14).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(r1.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688)).setGroup(r1.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                                                        builder.setCategory("msg");
                                                                                        if (chat3 == null && user2 != null && (str20 = user2.phone) != null && str20.length() > 0) {
                                                                                            builder.addPerson("tel:+" + user2.phone);
                                                                                        }
                                                                                        Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                                        intent2.putExtra("messageDate", messageObject2.messageOwner.date);
                                                                                        intent2.putExtra(str30, r1.currentAccount);
                                                                                        if (messageObject2.isStoryPush) {
                                                                                            intent2.putExtra("story", true);
                                                                                        }
                                                                                        if (messageObject2.isStoryReactionPush) {
                                                                                            i22 = 1;
                                                                                        } else {
                                                                                            i22 = 1;
                                                                                            intent2.putExtra("storyReaction", true);
                                                                                        }
                                                                                        builder.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i22, intent2, 167772160));
                                                                                        if (bitmap2 == null) {
                                                                                            builder.setLargeIcon(bitmap2);
                                                                                        } else if (fileLocation != null) {
                                                                                            jArr = null;
                                                                                            BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                                                                            if (imageFromMemory != null) {
                                                                                                builder.setLargeIcon(imageFromMemory.getBitmap());
                                                                                            } else {
                                                                                                try {
                                                                                                    File pathToAttach = r1.getFileLoader().getPathToAttach(fileLocation, true);
                                                                                                    if (pathToAttach.exists()) {
                                                                                                        float dp = 160.0f / AndroidUtilities.dp(50.0f);
                                                                                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                                        options.inSampleSize = dp < 1.0f ? 1 : (int) dp;
                                                                                                        Bitmap decodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options);
                                                                                                        if (decodeFile != null) {
                                                                                                            builder.setLargeIcon(decodeFile);
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable unused) {
                                                                                                }
                                                                                            }
                                                                                            boolean z35 = z20;
                                                                                            if (z || z35) {
                                                                                                builder.setPriority(-1);
                                                                                            } else if (i10 == 0) {
                                                                                                builder.setPriority(0);
                                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                                    i14 = 3;
                                                                                                }
                                                                                                i14 = 0;
                                                                                            } else {
                                                                                                int i43 = 1;
                                                                                                if (i10 != 1) {
                                                                                                    if (i10 == 2) {
                                                                                                        i43 = 1;
                                                                                                    } else {
                                                                                                        if (i10 == 4) {
                                                                                                            builder.setPriority(-2);
                                                                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                                                                i14 = 1;
                                                                                                            }
                                                                                                        } else if (i10 == 5) {
                                                                                                            builder.setPriority(-1);
                                                                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                                                                i14 = 2;
                                                                                                            }
                                                                                                        }
                                                                                                        i14 = 0;
                                                                                                    }
                                                                                                }
                                                                                                builder.setPriority(i43);
                                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                                    i14 = 4;
                                                                                                }
                                                                                                i14 = 0;
                                                                                            }
                                                                                            if (!z35 && !z12) {
                                                                                                if (z11 || (sharedPreferences4.getBoolean("EnableInAppPreview", true) && str11 != null)) {
                                                                                                    if (str11.length() > 100) {
                                                                                                        str11 = str11.substring(0, 100).replace('\n', ' ').trim() + "...";
                                                                                                    }
                                                                                                    builder.setTicker(str11);
                                                                                                }
                                                                                                if (str19 != null && !str19.equalsIgnoreCase("NoSound")) {
                                                                                                    int i44 = Build.VERSION.SDK_INT;
                                                                                                    if (i44 >= 26) {
                                                                                                        if (!str19.equalsIgnoreCase("Default") && !str19.equals(obj)) {
                                                                                                            if (z21) {
                                                                                                                ?? uriForFile = FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + str3, new File(str19));
                                                                                                                ApplicationLoader.applicationContext.grantUriPermission(str2, uriForFile, 1);
                                                                                                                jArr3 = uriForFile;
                                                                                                                if (i12 == 0) {
                                                                                                                    i15 = i12;
                                                                                                                    builder.setLights(i15, MediaDataController.MAX_STYLE_RUNS_COUNT, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                                                                                                } else {
                                                                                                                    i15 = i12;
                                                                                                                }
                                                                                                                i21 = i13;
                                                                                                                if (i21 != 2) {
                                                                                                                    jArr2 = new long[]{0, 0};
                                                                                                                    builder.setVibrate(jArr2);
                                                                                                                } else if (i21 == 1) {
                                                                                                                    jArr2 = new long[]{0, 100, 0, 100};
                                                                                                                    builder.setVibrate(jArr2);
                                                                                                                } else {
                                                                                                                    if (i21 == 0 || i21 == 4) {
                                                                                                                        builder.setDefaults(2);
                                                                                                                        jArr = new long[0];
                                                                                                                    } else if (i21 == 3) {
                                                                                                                        jArr2 = new long[]{0, 1000};
                                                                                                                        builder.setVibrate(jArr2);
                                                                                                                    }
                                                                                                                    r11 = jArr3;
                                                                                                                    if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter && messageObject2.getDialogId() == 777000) {
                                                                                                                        replyMarkup = messageObject2.messageOwner.reply_markup;
                                                                                                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                                                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                                                                                            int size = arrayList3.size();
                                                                                                                            int i45 = 0;
                                                                                                                            boolean z36 = false;
                                                                                                                            while (i45 < size) {
                                                                                                                                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i45);
                                                                                                                                int size2 = keyboardInlineButtonRow.buttons.size();
                                                                                                                                boolean z37 = z36;
                                                                                                                                int i46 = 0;
                                                                                                                                while (i46 < size2) {
                                                                                                                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow.buttons.get(i46);
                                                                                                                                    MessageObject messageObject7 = messageObject2;
                                                                                                                                    TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) TLKeyboardHelper.getType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                                                                                    if (tL_inlineButtonTypeCallback != null) {
                                                                                                                                        i18 = size;
                                                                                                                                        i19 = i14;
                                                                                                                                        Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                                                                                                        intent3.putExtra(str30, r1.currentAccount);
                                                                                                                                        i20 = i15;
                                                                                                                                        long j30 = j13;
                                                                                                                                        intent3.putExtra("did", j30);
                                                                                                                                        byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                                                                                        if (bArr != null) {
                                                                                                                                            intent3.putExtra("data", bArr);
                                                                                                                                        }
                                                                                                                                        intent3.putExtra("mid", messageObject7.getId());
                                                                                                                                        String str31 = keyboardInlineButton.text;
                                                                                                                                        Context context = ApplicationLoader.applicationContext;
                                                                                                                                        int i47 = r1.lastButtonId;
                                                                                                                                        j13 = j30;
                                                                                                                                        r1.lastButtonId = i47 + 1;
                                                                                                                                        builder.addAction(0, str31, PendingIntent.getBroadcast(context, i47, intent3, 167772160));
                                                                                                                                        z37 = true;
                                                                                                                                    } else {
                                                                                                                                        i18 = size;
                                                                                                                                        i19 = i14;
                                                                                                                                        i20 = i15;
                                                                                                                                    }
                                                                                                                                    i46++;
                                                                                                                                    size = i18;
                                                                                                                                    i14 = i19;
                                                                                                                                    i15 = i20;
                                                                                                                                    messageObject2 = messageObject7;
                                                                                                                                }
                                                                                                                                i45++;
                                                                                                                                z36 = z37;
                                                                                                                            }
                                                                                                                            i16 = i14;
                                                                                                                            i17 = i15;
                                                                                                                            z22 = z36;
                                                                                                                            if (!z22 && Build.VERSION.SDK_INT < 24 && SharedConfig.passcodeHash.length() == 0 && r1.hasMessagesToReply()) {
                                                                                                                                Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                                                                                                intent4.putExtra(str30, r1.currentAccount);
                                                                                                                                builder.addAction(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent4, 167772160));
                                                                                                                            }
                                                                                                                            r1.showExtraNotifications(builder, str15, j13, j12, str24, jArr, i17, r11, i16, z33, z32, z12, i8);
                                                                                                                            scheduleNotificationRepeat();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i16 = i14;
                                                                                                                    i17 = i15;
                                                                                                                    z22 = false;
                                                                                                                    if (!z22) {
                                                                                                                        Intent intent42 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                                                                                        intent42.putExtra(str30, r1.currentAccount);
                                                                                                                        builder.addAction(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent42, 167772160));
                                                                                                                    }
                                                                                                                    r1.showExtraNotifications(builder, str15, j13, j12, str24, jArr, i17, r11, i16, z33, z32, z12, i8);
                                                                                                                    scheduleNotificationRepeat();
                                                                                                                    return;
                                                                                                                }
                                                                                                                jArr = jArr3;
                                                                                                            } else {
                                                                                                                r0 = Uri.parse(str19);
                                                                                                                jArr3 = r0;
                                                                                                                if (i12 == 0) {
                                                                                                                }
                                                                                                                i21 = i13;
                                                                                                                if (i21 != 2) {
                                                                                                                }
                                                                                                                jArr = jArr3;
                                                                                                            }
                                                                                                        }
                                                                                                        r0 = Settings.System.DEFAULT_NOTIFICATION_URI;
                                                                                                        jArr3 = r0;
                                                                                                        if (i12 == 0) {
                                                                                                        }
                                                                                                        i21 = i13;
                                                                                                        if (i21 != 2) {
                                                                                                        }
                                                                                                        jArr = jArr3;
                                                                                                    } else {
                                                                                                        String str32 = str2;
                                                                                                        String str33 = str3;
                                                                                                        if (str19.equals(obj)) {
                                                                                                            builder.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, 5);
                                                                                                        } else {
                                                                                                            if (i44 >= 24) {
                                                                                                                String str34 = str;
                                                                                                                if (str19.startsWith(str34) && !AndroidUtilities.isInternalUri(Uri.parse(str19))) {
                                                                                                                    try {
                                                                                                                        Uri uriForFile2 = FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + str33, new File(str19.replace(str34, str17)));
                                                                                                                        ApplicationLoader.applicationContext.grantUriPermission(str32, uriForFile2, 1);
                                                                                                                        builder.setSound(uriForFile2, 5);
                                                                                                                    } catch (Exception unused2) {
                                                                                                                        builder.setSound(Uri.parse(str19), 5);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            builder.setSound(Uri.parse(str19), 5);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                jArr3 = jArr;
                                                                                                if (i12 == 0) {
                                                                                                }
                                                                                                i21 = i13;
                                                                                                if (i21 != 2) {
                                                                                                }
                                                                                                jArr = jArr3;
                                                                                            } else {
                                                                                                i15 = i12;
                                                                                                jArr2 = new long[]{0, 0};
                                                                                                builder.setVibrate(jArr2);
                                                                                            }
                                                                                            r11 = jArr;
                                                                                            jArr = jArr2;
                                                                                            if (!AndroidUtilities.needShowPasscode()) {
                                                                                                replyMarkup = messageObject2.messageOwner.reply_markup;
                                                                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                                                }
                                                                                            }
                                                                                            i16 = i14;
                                                                                            i17 = i15;
                                                                                            z22 = false;
                                                                                            if (!z22) {
                                                                                            }
                                                                                            r1.showExtraNotifications(builder, str15, j13, j12, str24, jArr, i17, r11, i16, z33, z32, z12, i8);
                                                                                            scheduleNotificationRepeat();
                                                                                            return;
                                                                                        }
                                                                                        jArr = null;
                                                                                        boolean z352 = z20;
                                                                                        if (z) {
                                                                                        }
                                                                                        builder.setPriority(-1);
                                                                                    }
                                                                                } else {
                                                                                    obj = path;
                                                                                    user2 = user;
                                                                                    chat3 = chat2;
                                                                                    if (r1.pushDialogs.size() == 1 && j13 != globalSecretChatId) {
                                                                                        intent.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                                                                                    }
                                                                                }
                                                                                fileLocation = null;
                                                                                String str302 = str7;
                                                                                intent.putExtra(str302, r1.currentAccount);
                                                                                builder.setContentTitle(str14).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(r1.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688)).setGroup(r1.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                                                builder.setCategory("msg");
                                                                                if (chat3 == null) {
                                                                                    builder.addPerson("tel:+" + user2.phone);
                                                                                }
                                                                                Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                                intent22.putExtra("messageDate", messageObject2.messageOwner.date);
                                                                                intent22.putExtra(str302, r1.currentAccount);
                                                                                if (messageObject2.isStoryPush) {
                                                                                }
                                                                                if (messageObject2.isStoryReactionPush) {
                                                                                }
                                                                                builder.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i22, intent22, 167772160));
                                                                                if (bitmap2 == null) {
                                                                                }
                                                                                jArr = null;
                                                                                boolean z3522 = z20;
                                                                                if (z) {
                                                                                }
                                                                                builder.setPriority(-1);
                                                                            }
                                                                        }
                                                                        user2 = user;
                                                                        chat3 = chat2;
                                                                        fileLocation = null;
                                                                        String str3022 = str7;
                                                                        intent.putExtra(str3022, r1.currentAccount);
                                                                        builder.setContentTitle(str14).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(r1.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688)).setGroup(r1.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                                        builder.setCategory("msg");
                                                                        if (chat3 == null) {
                                                                        }
                                                                        Intent intent222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                        intent222.putExtra("messageDate", messageObject2.messageOwner.date);
                                                                        intent222.putExtra(str3022, r1.currentAccount);
                                                                        if (messageObject2.isStoryPush) {
                                                                        }
                                                                        if (messageObject2.isStoryReactionPush) {
                                                                        }
                                                                        builder.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i22, intent222, 167772160));
                                                                        if (bitmap2 == null) {
                                                                        }
                                                                        jArr = null;
                                                                        boolean z35222 = z20;
                                                                        if (z) {
                                                                        }
                                                                        builder.setPriority(-1);
                                                                    } else {
                                                                        str17 = str12;
                                                                        str16 = str27;
                                                                        i9 = 4;
                                                                    }
                                                                } else {
                                                                    str17 = str12;
                                                                    i6 = 0;
                                                                    str16 = null;
                                                                    i5 = -16776961;
                                                                    i9 = 4;
                                                                    i7 = 0;
                                                                    z16 = false;
                                                                }
                                                                i8 = 1;
                                                                if (i7 != i9) {
                                                                }
                                                                if (TextUtils.isEmpty(str13)) {
                                                                }
                                                                str18 = str16;
                                                                z18 = true;
                                                                if (i3 != 3) {
                                                                }
                                                                i10 = i6;
                                                                if (num2 != null) {
                                                                    i5 = num2.intValue();
                                                                    z18 = false;
                                                                }
                                                                if (i4 != 0) {
                                                                }
                                                                i4 = i7;
                                                                z19 = z18;
                                                                if (z11) {
                                                                }
                                                                if (z17) {
                                                                    ringerMode = audioManager.getRingerMode();
                                                                    if (ringerMode != 0) {
                                                                        i4 = 2;
                                                                    }
                                                                }
                                                                if (z12) {
                                                                }
                                                                Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                                StringBuilder sb52 = new StringBuilder();
                                                                sb52.append("com.tmessages.openchat");
                                                                boolean z332 = z19;
                                                                boolean z342 = z16;
                                                                sb52.append(Math.random());
                                                                sb52.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                                intent5.setAction(sb52.toString());
                                                                intent5.setFlags(67108864);
                                                                if (messageObject2.isOauthPush) {
                                                                }
                                                                if (!messageObject2.isStoryReactionPush) {
                                                                }
                                                                user2 = user;
                                                                chat3 = chat2;
                                                                fileLocation = null;
                                                                String str30222 = str7;
                                                                intent5.putExtra(str30222, r1.currentAccount);
                                                                builder.setContentTitle(str14).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(r1.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent5, 1140850688)).setGroup(r1.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                                builder.setCategory("msg");
                                                                if (chat3 == null) {
                                                                }
                                                                Intent intent2222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                intent2222.putExtra("messageDate", messageObject2.messageOwner.date);
                                                                intent2222.putExtra(str30222, r1.currentAccount);
                                                                if (messageObject2.isStoryPush) {
                                                                }
                                                                if (messageObject2.isStoryReactionPush) {
                                                                }
                                                                builder.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i22, intent2222, 167772160));
                                                                if (bitmap2 == null) {
                                                                }
                                                                jArr = null;
                                                                boolean z352222 = z20;
                                                                if (z) {
                                                                }
                                                                builder.setPriority(-1);
                                                            } else if (z3) {
                                                                str14 = string2;
                                                                str15 = str9;
                                                                num2 = num;
                                                                z14 = z13;
                                                                long j31 = sharedPreferences4.getLong("ChannelSoundDocId", 0L);
                                                                if (j31 != 0) {
                                                                    string6 = r1.getMediaDataController().ringtoneDataStore.getSoundPath(j31);
                                                                    z25 = true;
                                                                } else {
                                                                    string6 = sharedPreferences4.getString("ChannelSoundPath", path);
                                                                    z25 = false;
                                                                }
                                                                int i48 = sharedPreferences4.getInt("vibrate_channel", 0);
                                                                int i49 = sharedPreferences4.getInt("priority_channel", 1);
                                                                String str35 = string6;
                                                                i5 = sharedPreferences4.getInt("ChannelLed", -16776961);
                                                                i6 = i49;
                                                                i7 = i48;
                                                                z16 = z25;
                                                                str16 = str35;
                                                                i8 = 2;
                                                            } else {
                                                                str14 = string2;
                                                                str15 = str9;
                                                                num2 = num;
                                                                z14 = z13;
                                                                long j32 = sharedPreferences4.getLong("GroupSoundDocId", 0L);
                                                                if (j32 != 0) {
                                                                    string5 = r1.getMediaDataController().ringtoneDataStore.getSoundPath(j32);
                                                                    z24 = true;
                                                                } else {
                                                                    string5 = sharedPreferences4.getString("GroupSoundPath", path);
                                                                    z24 = false;
                                                                }
                                                                int i50 = sharedPreferences4.getInt("vibrate_group", 0);
                                                                int i51 = sharedPreferences4.getInt("priority_group", 1);
                                                                String str36 = string5;
                                                                i5 = sharedPreferences4.getInt("GroupLed", -16776961);
                                                                i6 = i51;
                                                                i7 = i50;
                                                                z16 = z24;
                                                                str16 = str36;
                                                                i8 = 0;
                                                            }
                                                            str17 = str12;
                                                            i9 = 4;
                                                            if (i7 != i9) {
                                                            }
                                                            if (TextUtils.isEmpty(str13)) {
                                                            }
                                                            str18 = str16;
                                                            z18 = true;
                                                            if (i3 != 3) {
                                                            }
                                                            i10 = i6;
                                                            if (num2 != null) {
                                                            }
                                                            if (i4 != 0) {
                                                            }
                                                            i4 = i7;
                                                            z19 = z18;
                                                            if (z11) {
                                                            }
                                                            if (z17) {
                                                            }
                                                            if (z12) {
                                                            }
                                                            Intent intent52 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                            StringBuilder sb522 = new StringBuilder();
                                                            sb522.append("com.tmessages.openchat");
                                                            boolean z3322 = z19;
                                                            boolean z3422 = z16;
                                                            sb522.append(Math.random());
                                                            sb522.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                            intent52.setAction(sb522.toString());
                                                            intent52.setFlags(67108864);
                                                            if (messageObject2.isOauthPush) {
                                                            }
                                                            if (!messageObject2.isStoryReactionPush) {
                                                            }
                                                            user2 = user;
                                                            chat3 = chat2;
                                                            fileLocation = null;
                                                            String str302222 = str7;
                                                            intent52.putExtra(str302222, r1.currentAccount);
                                                            builder.setContentTitle(str14).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(r1.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent52, 1140850688)).setGroup(r1.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                            builder.setCategory("msg");
                                                            if (chat3 == null) {
                                                            }
                                                            Intent intent22222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                            intent22222.putExtra("messageDate", messageObject2.messageOwner.date);
                                                            intent22222.putExtra(str302222, r1.currentAccount);
                                                            if (messageObject2.isStoryPush) {
                                                            }
                                                            if (messageObject2.isStoryReactionPush) {
                                                            }
                                                            builder.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i22, intent22222, 167772160));
                                                            if (bitmap2 == null) {
                                                            }
                                                            jArr = null;
                                                            boolean z3522222 = z20;
                                                            if (z) {
                                                            }
                                                            builder.setPriority(-1);
                                                        }
                                                    }
                                                    z10 = z8;
                                                    String path2 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                                    z11 = ApplicationLoader.mainInterfacePaused;
                                                    boolean z322 = !z11;
                                                    getSharedPrefKey(j9, j10);
                                                    j11 = j9;
                                                    j12 = j10;
                                                    if (r1.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j11, j12, false)) {
                                                    }
                                                    if (messageObject2.isReactionPush) {
                                                    }
                                                    str14 = string2;
                                                    str15 = str9;
                                                    num2 = num;
                                                    z14 = z13;
                                                    j14 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                                                    if (j14 == 0) {
                                                    }
                                                    int i372 = sharedPreferences4.getInt("vibrate_react", 0);
                                                    int i382 = sharedPreferences4.getInt("priority_react", 1);
                                                    String str262 = string3;
                                                    int i392 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                                                    if (messageObject2.isStoryReactionPush) {
                                                    }
                                                    str17 = str12;
                                                    i9 = 4;
                                                    if (i7 != i9) {
                                                    }
                                                    if (TextUtils.isEmpty(str13)) {
                                                    }
                                                    str18 = str16;
                                                    z18 = true;
                                                    if (i3 != 3) {
                                                    }
                                                    i10 = i6;
                                                    if (num2 != null) {
                                                    }
                                                    if (i4 != 0) {
                                                    }
                                                    i4 = i7;
                                                    z19 = z18;
                                                    if (z11) {
                                                    }
                                                    if (z17) {
                                                    }
                                                    if (z12) {
                                                    }
                                                    Intent intent522 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                    StringBuilder sb5222 = new StringBuilder();
                                                    sb5222.append("com.tmessages.openchat");
                                                    boolean z33222 = z19;
                                                    boolean z34222 = z16;
                                                    sb5222.append(Math.random());
                                                    sb5222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                    intent522.setAction(sb5222.toString());
                                                    intent522.setFlags(67108864);
                                                    if (messageObject2.isOauthPush) {
                                                    }
                                                    if (!messageObject2.isStoryReactionPush) {
                                                    }
                                                    user2 = user;
                                                    chat3 = chat2;
                                                    fileLocation = null;
                                                    String str3022222 = str7;
                                                    intent522.putExtra(str3022222, r1.currentAccount);
                                                    builder.setContentTitle(str14).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(r1.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent522, 1140850688)).setGroup(r1.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                    builder.setCategory("msg");
                                                    if (chat3 == null) {
                                                    }
                                                    Intent intent222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                    intent222222.putExtra("messageDate", messageObject2.messageOwner.date);
                                                    intent222222.putExtra(str3022222, r1.currentAccount);
                                                    if (messageObject2.isStoryPush) {
                                                    }
                                                    if (messageObject2.isStoryReactionPush) {
                                                    }
                                                    builder.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i22, intent222222, 167772160));
                                                    if (bitmap2 == null) {
                                                    }
                                                    jArr = null;
                                                    boolean z35222222 = z20;
                                                    if (z) {
                                                    }
                                                    builder.setPriority(-1);
                                                }
                                            }
                                        }
                                        str12 = str4;
                                    } else {
                                        str12 = str4;
                                        sharedPreferences4 = sharedPreferences3;
                                        j9 = j8;
                                    }
                                    z9 = isSilentMessage;
                                    if (z8) {
                                    }
                                    z10 = z8;
                                    String path22 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                    z11 = ApplicationLoader.mainInterfacePaused;
                                    boolean z3222 = !z11;
                                    getSharedPrefKey(j9, j10);
                                    j11 = j9;
                                    j12 = j10;
                                    if (r1.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j11, j12, false)) {
                                    }
                                    if (messageObject2.isReactionPush) {
                                    }
                                    str14 = string2;
                                    str15 = str9;
                                    num2 = num;
                                    z14 = z13;
                                    j14 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                                    if (j14 == 0) {
                                    }
                                    int i3722 = sharedPreferences4.getInt("vibrate_react", 0);
                                    int i3822 = sharedPreferences4.getInt("priority_react", 1);
                                    String str2622 = string3;
                                    int i3922 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                                    if (messageObject2.isStoryReactionPush) {
                                    }
                                    str17 = str12;
                                    i9 = 4;
                                    if (i7 != i9) {
                                    }
                                    if (TextUtils.isEmpty(str13)) {
                                    }
                                    str18 = str16;
                                    z18 = true;
                                    if (i3 != 3) {
                                    }
                                    i10 = i6;
                                    if (num2 != null) {
                                    }
                                    if (i4 != 0) {
                                    }
                                    i4 = i7;
                                    z19 = z18;
                                    if (z11) {
                                    }
                                    if (z17) {
                                    }
                                    if (z12) {
                                    }
                                    Intent intent5222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                    StringBuilder sb52222 = new StringBuilder();
                                    sb52222.append("com.tmessages.openchat");
                                    boolean z332222 = z19;
                                    boolean z342222 = z16;
                                    sb52222.append(Math.random());
                                    sb52222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    intent5222.setAction(sb52222.toString());
                                    intent5222.setFlags(67108864);
                                    if (messageObject2.isOauthPush) {
                                    }
                                    if (!messageObject2.isStoryReactionPush) {
                                    }
                                    user2 = user;
                                    chat3 = chat2;
                                    fileLocation = null;
                                    String str30222222 = str7;
                                    intent5222.putExtra(str30222222, r1.currentAccount);
                                    builder.setContentTitle(str14).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(r1.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent5222, 1140850688)).setGroup(r1.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                    builder.setCategory("msg");
                                    if (chat3 == null) {
                                    }
                                    Intent intent2222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                    intent2222222.putExtra("messageDate", messageObject2.messageOwner.date);
                                    intent2222222.putExtra(str30222222, r1.currentAccount);
                                    if (messageObject2.isStoryPush) {
                                    }
                                    if (messageObject2.isStoryReactionPush) {
                                    }
                                    builder.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i22, intent2222222, 167772160));
                                    if (bitmap2 == null) {
                                    }
                                    jArr = null;
                                    boolean z352222222 = z20;
                                    if (z) {
                                    }
                                    builder.setPriority(-1);
                                }
                                z8 = true;
                                if (z8) {
                                }
                                str12 = str4;
                                sharedPreferences4 = sharedPreferences3;
                                j9 = j8;
                                z9 = isSilentMessage;
                                if (z8) {
                                }
                                z10 = z8;
                                String path222 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                z11 = ApplicationLoader.mainInterfacePaused;
                                boolean z32222 = !z11;
                                getSharedPrefKey(j9, j10);
                                j11 = j9;
                                j12 = j10;
                                if (r1.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j11, j12, false)) {
                                }
                                if (messageObject2.isReactionPush) {
                                }
                                str14 = string2;
                                str15 = str9;
                                num2 = num;
                                z14 = z13;
                                j14 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                                if (j14 == 0) {
                                }
                                int i37222 = sharedPreferences4.getInt("vibrate_react", 0);
                                int i38222 = sharedPreferences4.getInt("priority_react", 1);
                                String str26222 = string3;
                                int i39222 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                                if (messageObject2.isStoryReactionPush) {
                                }
                                str17 = str12;
                                i9 = 4;
                                if (i7 != i9) {
                                }
                                if (TextUtils.isEmpty(str13)) {
                                }
                                str18 = str16;
                                z18 = true;
                                if (i3 != 3) {
                                }
                                i10 = i6;
                                if (num2 != null) {
                                }
                                if (i4 != 0) {
                                }
                                i4 = i7;
                                z19 = z18;
                                if (z11) {
                                }
                                if (z17) {
                                }
                                if (z12) {
                                }
                                Intent intent52222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                StringBuilder sb522222 = new StringBuilder();
                                sb522222.append("com.tmessages.openchat");
                                boolean z3322222 = z19;
                                boolean z3422222 = z16;
                                sb522222.append(Math.random());
                                sb522222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent52222.setAction(sb522222.toString());
                                intent52222.setFlags(67108864);
                                if (messageObject2.isOauthPush) {
                                }
                                if (!messageObject2.isStoryReactionPush) {
                                }
                                user2 = user;
                                chat3 = chat2;
                                fileLocation = null;
                                String str302222222 = str7;
                                intent52222.putExtra(str302222222, r1.currentAccount);
                                builder.setContentTitle(str14).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(r1.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent52222, 1140850688)).setGroup(r1.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                builder.setCategory("msg");
                                if (chat3 == null) {
                                }
                                Intent intent22222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent22222222.putExtra("messageDate", messageObject2.messageOwner.date);
                                intent22222222.putExtra(str302222222, r1.currentAccount);
                                if (messageObject2.isStoryPush) {
                                }
                                if (messageObject2.isStoryReactionPush) {
                                }
                                builder.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i22, intent22222222, 167772160));
                                if (bitmap2 == null) {
                                }
                                jArr = null;
                                boolean z3522222222 = z20;
                                if (z) {
                                }
                                builder.setPriority(-1);
                            }
                            str6 = string;
                            if (!sharedPreferences2.getBoolean("EnableReactionsPreview", true)) {
                                string2 = LocaleController.getString(R.string.NotificationHiddenName);
                                if (z5) {
                                }
                                NotificationCompat.Builder builder2 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                                long j262 = j7;
                                if (r1.pushMessages.size() > 1) {
                                }
                                j8 = j6;
                                sharedPreferences3 = sharedPreferences2;
                                boolean[] zArr3 = new boolean[1];
                                messageObject2 = messageObject;
                                stringForMessage = r1.getStringForMessage(messageObject2, false, zArr3, null);
                                isSilentMessage = r1.isSilentMessage(messageObject2);
                                if (stringForMessage != null) {
                                }
                            }
                            string2 = str6;
                            if (z5) {
                            }
                            NotificationCompat.Builder builder22 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                            long j2622 = j7;
                            if (r1.pushMessages.size() > 1) {
                            }
                            j8 = j6;
                            sharedPreferences3 = sharedPreferences2;
                            boolean[] zArr32 = new boolean[1];
                            messageObject2 = messageObject;
                            stringForMessage = r1.getStringForMessage(messageObject2, false, zArr32, null);
                            isSilentMessage = r1.isSilentMessage(messageObject2);
                            if (stringForMessage != null) {
                            }
                        }
                    } else {
                        z5 = equalsIgnoreCase;
                    }
                    if (z4) {
                        string = LocaleController.getString(R.string.AppName);
                    } else if (i2 != 0) {
                        string = LocaleController.getString(R.string.NotificationHiddenChatName);
                    } else {
                        string = LocaleController.getString(R.string.NotificationHiddenName);
                    }
                    z6 = false;
                    if (!messageObject.isReactionPush) {
                        str6 = string;
                        string2 = str6;
                        if (z5) {
                        }
                        NotificationCompat.Builder builder222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                        long j26222 = j7;
                        if (r1.pushMessages.size() > 1) {
                        }
                        j8 = j6;
                        sharedPreferences3 = sharedPreferences2;
                        boolean[] zArr322 = new boolean[1];
                        messageObject2 = messageObject;
                        stringForMessage = r1.getStringForMessage(messageObject2, false, zArr322, null);
                        isSilentMessage = r1.isSilentMessage(messageObject2);
                        if (stringForMessage != null) {
                        }
                    }
                    str6 = string;
                    if (!sharedPreferences2.getBoolean("EnableReactionsPreview", true)) {
                    }
                    string2 = str6;
                    if (z5) {
                    }
                    NotificationCompat.Builder builder2222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                    long j262222 = j7;
                    if (r1.pushMessages.size() > 1) {
                    }
                    j8 = j6;
                    sharedPreferences3 = sharedPreferences2;
                    boolean[] zArr3222 = new boolean[1];
                    messageObject2 = messageObject;
                    stringForMessage = r1.getStringForMessage(messageObject2, false, zArr3222, null);
                    isSilentMessage = r1.isSilentMessage(messageObject2);
                    if (stringForMessage != null) {
                    }
                }
                z4 = true;
                boolean z302 = isGlobalNotificationsEnabled;
                String str242 = userName;
                boolean equalsIgnoreCase2 = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                if (DialogObject.isEncryptedDialog(j6)) {
                }
                if (z4) {
                }
                z6 = false;
                if (!messageObject.isReactionPush) {
                }
                str6 = string;
                if (!sharedPreferences2.getBoolean("EnableReactionsPreview", true)) {
                }
                string2 = str6;
                if (z5) {
                }
                NotificationCompat.Builder builder22222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                long j2622222 = j7;
                if (r1.pushMessages.size() > 1) {
                }
                j8 = j6;
                sharedPreferences3 = sharedPreferences2;
                boolean[] zArr32222 = new boolean[1];
                messageObject2 = messageObject;
                stringForMessage = r1.getStringForMessage(messageObject2, false, zArr32222, null);
                isSilentMessage = r1.isSilentMessage(messageObject2);
                if (stringForMessage != null) {
                }
            } catch (Exception e3) {
                e = e3;
                FileLog.e(e);
                return;
            }
        }
        dismissNotification();
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
            getNotificationsController().deleteNotificationChannelGlobalInternal(i3, -1);
        } else {
            edit.putString("sound_" + getSharedPrefKey(j, j2), string);
            edit.putString("sound_path_" + getSharedPrefKey(j, j2), uri3);
            deleteNotificationChannelInternal(j, j2, -1);
        }
        edit.commit();
        builder.setChannelId(validateChannelId(j, j2, str, jArr, i, uri2, i2, z, z2, z3, i3));
        notificationManager.notify(this.notificationId, builder.build());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(91:50|(2:52|(4:54|55|56|57)(4:58|(2:61|59)|62|63))(1:851)|64|65|(1:67)(2:(1:848)(1:850)|849)|68|(4:71|(2:73|74)(1:76)|75|69)|77|78|(5:80|(2:(1:83)(1:719)|84)(1:720)|(1:718)(2:90|(2:94|95))|717|95)(5:721|(3:(1:831)(1:730)|731|(13:733|(2:735|(1:737)(4:782|(1:784)|785|384))(3:786|(1:796)(2:790|(10:794|739|(1:741)(2:773|(1:775)(2:776|(1:778)(2:779|(1:781))))|742|743|(1:772)(4:748|(2:750|(3:754|(1:756)|762))(3:764|(2:766|(2:768|(1:770)))|762)|759|(1:761))|763|762|759|(0)))|795)|738|739|(0)(0)|742|743|(0)|772|763|762|759|(0))(9:797|(2:799|(1:801)(4:802|(1:804)|785|384))(10:805|(1:830)(1:809)|810|(1:829)(2:814|(1:816))|828|818|(2:820|(3:822|(1:824)|825))(1:827)|826|(0)|825)|743|(0)|772|763|762|759|(0)))(3:832|(5:834|(2:836|(1:838))(2:840|(2:842|(1:844)))|839|785|384)(1:846)|845)|55|56|57)|(1:101)|(4:103|(1:105)(1:108)|106|107)|(3:110|(3:112|(1:114)(3:704|705|(3:707|(1:709)(1:711)|710))|115)(1:715)|712)(1:716)|(3:117|(1:123)|124)|125|(2:669|(76:671|(5:673|(5:676|(1:687)(1:684)|685|686|674)|688|689|(4:691|(1:693)|694|695)(1:701))(1:702)|696|(1:698)(1:700)|699|131|(1:133)|134|(1:136)(1:661)|137|(2:659|660)(1:141)|142|143|(3:146|(1:148)|(3:150|151|(65:155|156|157|(55:161|162|163|(1:647)(1:167)|168|(1:646)(1:171)|172|173|(1:645)|180|(1:644)(1:187)|188|(12:190|(1:192)(2:381|(5:383|384|55|56|57)(2:385|(1:(1:388)(1:389))(10:390|(1:392)(2:393|(1:398)(1:397))|194|(2:197|195)|198|199|(1:380)(1:202)|203|(1:205)(1:379)|206)))|193|194|(1:195)|198|199|(0)|380|203|(0)(0)|206)(4:399|(6:401|(1:403)(3:408|(1:410)(2:629|(2:634|(1:636)(2:637|(1:641)))(1:633))|(3:412|(1:414)|415)(17:416|(1:418)|419|(2:625|(1:627)(1:628))(1:425)|426|427|(3:616|(1:618)(1:(1:621)(2:622|(1:624)))|619)(1:431)|432|(1:615)(2:(1:614)(2:435|(1:(2:438|(1:440))(1:610))(2:611|(1:613)))|609)|(3:549|(1:608)(5:555|(2:606|607)(3:558|(1:562)|(1:605)(1:572))|(4:577|(2:579|(2:585|(1:589)))(2:593|(3:599|(1:603)|591))|590|591)|604|591)|592)(1:444)|445|(8:447|(1:547)(7:460|(1:546)(2:464|(11:526|527|528|529|530|531|532|533|534|535|536)(1:466))|467|(1:469)(1:525)|470|471|(6:514|515|516|517|518|(6:510|(1:512)|479|480|(2:485|(2:487|(3:489|(2:494|495)(1:491)|(1:493))(2:498|(2:500|(1:502)))))|509))(4:473|(2:513|(0))|475|(0)))|477|478|479|480|(3:483|485|(0))|509)(1:548)|503|(2:505|(3:507|508|407))|405|406|407))|404|405|406|407)|642|643)|207|(1:(41:353|(2:364|(4:366|(2:369|367)|370|371)(2:372|(1:374)(2:375|(1:377)(1:378))))(3:357|(1:359)(2:361|(1:363))|360)|213|(1:215)|216|(1:218)|219|(2:221|(1:223)(1:344))(2:345|(1:347)(1:348))|(1:225)(1:343)|226|(4:228|(2:231|229)|232|233)(1:342)|234|(1:236)(1:341)|237|238|239|(1:241)|(1:245)|246|(1:248)|(2:252|(21:254|(5:257|(2:258|(2:260|(2:263|264)(1:262))(1:334))|265|(1:268)(1:267)|255)|335|269|(1:271)|272|(2:(1:277)|(1:284))|285|(1:333)(1:291)|292|(1:294)|(1:296)|297|(3:302|(4:304|(3:306|(4:308|(1:310)|311|312)(2:314|315)|313)|316|317)|318)|319|(1:332)(2:322|(1:326))|327|(1:329)|330|331|57))|336|(0)|272|(3:274|(0)|(2:279|284))|285|(1:287)|333|292|(0)|(0)|297|(4:299|302|(0)|318)|319|(0)|332|327|(0)|330|331|57)(1:352))(1:211)|212|213|(0)|216|(0)|219|(0)(0)|(0)(0)|226|(0)(0)|234|(0)(0)|237|238|239|(0)|(2:243|245)|246|(0)|(3:250|252|(0))|336|(0)|272|(0)|285|(0)|333|292|(0)|(0)|297|(0)|319|(0)|332|327|(0)|330|331|57)|652|(1:165)|647|168|(0)|646|172|173|(1:175)|645|180|(1:183)|644|188|(0)(0)|207|(1:209)|(1:350)|353|(1:355)|364|(0)(0)|213|(0)|216|(0)|219|(0)(0)|(0)(0)|226|(0)(0)|234|(0)(0)|237|238|239|(0)|(0)|246|(0)|(0)|336|(0)|272|(0)|285|(0)|333|292|(0)|(0)|297|(0)|319|(0)|332|327|(0)|330|331|57)))|658|652|(0)|647|168|(0)|646|172|173|(0)|645|180|(0)|644|188|(0)(0)|207|(0)|(0)|353|(0)|364|(0)(0)|213|(0)|216|(0)|219|(0)(0)|(0)(0)|226|(0)(0)|234|(0)(0)|237|238|239|(0)|(0)|246|(0)|(0)|336|(0)|272|(0)|285|(0)|333|292|(0)|(0)|297|(0)|319|(0)|332|327|(0)|330|331|57)(1:703))(1:128)|129|130|131|(0)|134|(0)(0)|137|(1:139)|659|660|142|143|(3:146|(0)|(0))|658|652|(0)|647|168|(0)|646|172|173|(0)|645|180|(0)|644|188|(0)(0)|207|(0)|(0)|353|(0)|364|(0)(0)|213|(0)|216|(0)|219|(0)(0)|(0)(0)|226|(0)(0)|234|(0)(0)|237|238|239|(0)|(0)|246|(0)|(0)|336|(0)|272|(0)|285|(0)|333|292|(0)|(0)|297|(0)|319|(0)|332|327|(0)|330|331|57) */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x13fc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x141b, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0593, code lost:
    
        if (r0.local_id != 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x05b8, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x05b6, code lost:
    
        if (r0.local_id != 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x0519, code lost:
    
        if (r2.local_id != 0) goto L180;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x08cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0933 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0960 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0ade A[LOOP:5: B:195:0x0ad6->B:197:0x0ade, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1125  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x120e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x1231  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x128f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x12f7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x1337  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x1396  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x13f4 A[Catch: Exception -> 0x13fc, TryCatch #8 {Exception -> 0x13fc, blocks: (B:239:0x13d6, B:241:0x13f4, B:243:0x1400, B:245:0x1404, B:246:0x140b), top: B:238:0x13d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x1400 A[Catch: Exception -> 0x13fc, TryCatch #8 {Exception -> 0x13fc, blocks: (B:239:0x13d6, B:241:0x13f4, B:243:0x1400, B:245:0x1404, B:246:0x140b), top: B:238:0x13d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x1420  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x142b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x1435  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x1485  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x14c7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x14cd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x14e8  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x1500  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x1506  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1511  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x151e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x15a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x15da  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x139d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x135e  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x131a  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x12ce  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x1140  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x1156  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1194  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x11c7  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0f43  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0f76  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x100c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x101e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x10aa  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0fcc  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0f50 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0f47  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x0560 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:761:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x166a  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x16e5  */
    /* JADX WARN: Removed duplicated region for block: B:877:0x174d  */
    /* JADX WARN: Removed duplicated region for block: B:900:0x16b3  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x1663 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:908:0x01c0  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showExtraNotifications(NotificationCompat.Builder builder, String str, long j, long j2, String str2, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i4;
        boolean z4;
        long clientUserId;
        boolean z5;
        LongSparseArray longSparseArray;
        int size;
        Notification notification;
        ArrayList arrayList;
        LongSparseArray longSparseArray2;
        ArrayList arrayList2;
        int i5;
        int size2;
        int i6;
        LongSparseArray longSparseArray3;
        int i7;
        boolean z6;
        boolean z7;
        long j3;
        LongSparseArray longSparseArray4;
        ArrayList arrayList3;
        int id;
        MessageObject messageObject;
        long j4;
        Integer num;
        Notification notification2;
        LongSparseArray longSparseArray5;
        Integer num2;
        int i8;
        String str9;
        ArrayList arrayList4;
        long j5;
        DialogKey dialogKey;
        TLRPC.User user;
        String string;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        boolean z8;
        boolean z9;
        boolean z10;
        SharedPreferences sharedPreferences;
        LongSparseArray longSparseArray6;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i9;
        String str10;
        String str11;
        long j6;
        TLRPC.FileLocation fileLocation2;
        TLRPC.FileLocation fileLocation3;
        String str12;
        TLRPC.User user3;
        TLRPC.Chat chat2;
        TLRPC.FileLocation fileLocation4;
        TLRPC.FileLocation fileLocation5;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation6;
        String str13;
        Notification notification3;
        boolean z11;
        File file;
        Bitmap bitmap;
        TLRPC.Chat chat4;
        File file2;
        Bitmap bitmap2;
        String str14;
        TLRPC.User user4;
        int i10;
        ArrayList arrayList7;
        String str15;
        ?? r11;
        String formatString;
        NotificationCompat.Action build;
        int i11;
        Integer num3;
        DialogKey dialogKey2;
        int max;
        long j7;
        Person person;
        NotificationCompat.MessagingStyle messagingStyle;
        NotificationCompat.MessagingStyle messagingStyle2;
        int i12;
        NotificationCompat.Action action;
        DialogKey dialogKey3;
        ArrayList arrayList8;
        NotificationCompat.MessagingStyle messagingStyle3;
        MessageObject messageObject2;
        String str16;
        String str17;
        long j8;
        StringBuilder sb;
        String str18;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList9;
        Bitmap bitmap3;
        int i13;
        String[] strArr;
        boolean[] zArr;
        String str19;
        StringBuilder sb2;
        ArrayList arrayList10;
        long senderId;
        String str20;
        long j9;
        String str21;
        NotificationCompat.MessagingStyle messagingStyle4;
        int i14;
        File file3;
        String str22;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation7;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation8;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation9;
        ArrayList arrayList11;
        String str23;
        NotificationCompat.MessagingStyle messagingStyle5;
        List messages;
        Uri uri2;
        final File file4;
        Context context;
        StringBuilder sb3;
        final Uri uriForFile;
        MessageObject messageObject3;
        String str24;
        String str25;
        String str26;
        DialogKey dialogKey4;
        LongSparseArray longSparseArray7;
        int i15;
        long j10;
        NotificationCompat.Action action2;
        Bitmap bitmap4;
        String str27;
        ArrayList arrayList12;
        long j11;
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton;
        long j12;
        TLRPC.User user5;
        int size3;
        int i16;
        int i17;
        TLRPC.Message message;
        TLRPC.ReplyMarkup replyMarkup;
        Intent intent;
        ArrayList<Object> arrayList13;
        boolean z12;
        int i18;
        TLRPC.User user6;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        TLRPC.FileLocation fileLocation10;
        Bitmap bitmap5;
        Bitmap decodeFile;
        String string2;
        TLRPC.UserProfilePhoto userProfilePhoto4;
        NotificationsController notificationsController = this;
        FileLog.d("showExtraNotifications pushMessages.size()=" + notificationsController.pushMessages.size());
        if (Build.VERSION.SDK_INT >= 26) {
            str3 = "userId";
            str4 = "chatId";
            str5 = "storyId";
            str6 = ".provider";
            str7 = "%1$s: %2$s";
            str8 = "max_id";
            i4 = -1;
            builder.setChannelId(notificationsController.validateChannelId(j, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
        } else {
            str3 = "userId";
            str4 = "chatId";
            str5 = "storyId";
            str6 = ".provider";
            str7 = "%1$s: %2$s";
            str8 = "max_id";
            i4 = -1;
        }
        Notification build2 = builder.build();
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        ArrayList arrayList14 = new ArrayList();
        if (!notificationsController.storyPushMessages.isEmpty()) {
            arrayList14.add(new DialogKey(0L, 0L, true));
        }
        LongSparseArray longSparseArray8 = new LongSparseArray();
        for (int i19 = 0; i19 < notificationsController.pushMessages.size(); i19++) {
            MessageObject messageObject4 = notificationsController.pushMessages.get(i19);
            long dialogId = messageObject4.getDialogId();
            long topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject4.messageOwner, notificationsController.getMessagesController().isForum(messageObject4));
            int i20 = notificationsSettings.getInt("dismissDate" + dialogId, 0);
            if (!messageObject4.isStoryPush && messageObject4.messageOwner.date <= i20) {
                FileLog.d("showExtraNotifications: dialog " + dialogId + " is skipped, message date (" + messageObject4.messageOwner.date + " <= " + i20 + ")");
            } else {
                ArrayList arrayList15 = (ArrayList) longSparseArray8.get(dialogId);
                if (arrayList15 == null) {
                    arrayList15 = new ArrayList();
                    longSparseArray8.put(dialogId, arrayList15);
                    FileLog.d("showExtraNotifications: sortedDialogs += " + dialogId);
                    arrayList14.add(new DialogKey(dialogId, topicId, false));
                }
                arrayList15.add(messageObject4);
            }
        }
        int i21 = 0;
        LongSparseArray longSparseArray9 = new LongSparseArray();
        for (int i22 = 0; i22 < notificationsController.wearNotificationsIds.size(); i22++) {
            longSparseArray9.put(notificationsController.wearNotificationsIds.keyAt(i22), (Integer) notificationsController.wearNotificationsIds.valueAt(i22));
        }
        notificationsController.wearNotificationsIds.clear();
        ArrayList arrayList16 = new ArrayList();
        int i23 = Build.VERSION.SDK_INT;
        if (i23 > 27) {
            if (arrayList14.size() <= (notificationsController.storyPushMessages.isEmpty() ? 1 : 2)) {
                z4 = false;
                if (z4 && i23 >= 26) {
                    checkOtherNotificationsChannel();
                }
                clientUserId = notificationsController.getUserConfig().getClientUserId();
                z5 = !AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter;
                FileLog.d("showExtraNotifications: passcode=" + (SharedConfig.passcodeHash.length() <= 0) + " waitingForPasscode=" + z5 + " selfUserId=" + clientUserId + " useSummaryNotification=" + z4);
                longSparseArray = new LongSparseArray();
                size = arrayList14.size();
                while (true) {
                    if (i21 < size) {
                        notification = build2;
                        arrayList = arrayList16;
                        break;
                    }
                    ArrayList arrayList17 = arrayList16;
                    if (arrayList16.size() >= 7) {
                        FileLog.d("showExtraNotifications: break from holders, count over 7");
                        notification = build2;
                        arrayList = arrayList17;
                        break;
                    }
                    DialogKey dialogKey5 = (DialogKey) arrayList14.get(i21);
                    ArrayList arrayList18 = arrayList14;
                    int i24 = i21;
                    if (dialogKey5.story) {
                        ArrayList arrayList19 = new ArrayList();
                        if (notificationsController.storyPushMessages.isEmpty()) {
                            FileLog.d("showExtraNotifications: [" + dialogKey5.dialogId + "] continue; story but storyPushMessages is empty");
                            notification3 = build2;
                            sharedPreferences = notificationsSettings;
                            longSparseArray4 = longSparseArray8;
                            longSparseArray6 = longSparseArray;
                            longSparseArray5 = longSparseArray9;
                            i7 = size;
                            z6 = z4;
                            z7 = z5;
                            j6 = clientUserId;
                            arrayList5 = arrayList17;
                            arrayList6 = arrayList18;
                            i9 = i24;
                            str10 = str8;
                            str11 = str4;
                            i21 = i9 + 1;
                            arrayList16 = arrayList5;
                            arrayList14 = arrayList6;
                            size = i7;
                            z4 = z6;
                            z5 = z7;
                            longSparseArray8 = longSparseArray4;
                            str4 = str11;
                            longSparseArray9 = longSparseArray5;
                            str8 = str10;
                            notificationsSettings = sharedPreferences;
                            clientUserId = j6;
                            build2 = notification3;
                            longSparseArray = longSparseArray6;
                        } else {
                            i7 = size;
                            z6 = z4;
                            z7 = z5;
                            long j13 = notificationsController.storyPushMessages.get(0).dialogId;
                            Iterator<Integer> it = notificationsController.storyPushMessages.get(0).dateByIds.keySet().iterator();
                            int i25 = 0;
                            while (it.hasNext()) {
                                i25 = Math.max(i25, it.next().intValue());
                                arrayList19 = arrayList19;
                            }
                            longSparseArray4 = longSparseArray8;
                            arrayList3 = arrayList19;
                            j4 = j13;
                            messageObject = null;
                            id = i25;
                            j3 = 0;
                        }
                    } else {
                        i7 = size;
                        z6 = z4;
                        z7 = z5;
                        long j14 = dialogKey5.dialogId;
                        j3 = dialogKey5.topicId;
                        ArrayList arrayList20 = (ArrayList) longSparseArray8.get(j14);
                        longSparseArray4 = longSparseArray8;
                        arrayList3 = arrayList20;
                        id = ((MessageObject) arrayList20.get(0)).getId();
                        messageObject = (MessageObject) arrayList20.get(0);
                        j4 = j14;
                    }
                    long j15 = clientUserId;
                    Integer num4 = (Integer) longSparseArray9.get(dialogKey5.dialogId);
                    if (dialogKey5.story) {
                        num = 2147483646;
                    } else {
                        if (num4 == null) {
                            long j16 = dialogKey5.dialogId;
                            num4 = Integer.valueOf(((int) j16) + ((int) (j16 >> 32)));
                        } else {
                            longSparseArray9.remove(dialogKey5.dialogId);
                        }
                        num = num4;
                    }
                    int i26 = 0;
                    for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                        if (i26 < ((MessageObject) arrayList3.get(i27)).messageOwner.date) {
                            i26 = ((MessageObject) arrayList3.get(i27)).messageOwner.date;
                        }
                    }
                    if (dialogKey5.story) {
                        longSparseArray5 = longSparseArray9;
                        TLRPC.User user7 = notificationsController.getMessagesController().getUser(Long.valueOf(j4));
                        num2 = num;
                        if (notificationsController.storyPushMessages.size() == 1) {
                            if (user7 != null) {
                                string = UserObject.getFirstName(user7);
                            } else {
                                string = notificationsController.storyPushMessages.get(0).localName;
                            }
                            notification2 = build2;
                        } else {
                            notification2 = build2;
                            string = LocaleController.formatPluralString("Stories", notificationsController.storyPushMessages.size(), new Object[0]);
                        }
                        if (user7 == null || (userProfilePhoto4 = user7.photo) == null || (fileLocation = userProfilePhoto4.photo_small) == null) {
                            i8 = i26;
                        } else {
                            i8 = i26;
                            if (fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                str9 = "showExtraNotifications: [";
                                arrayList4 = arrayList3;
                                j5 = j4;
                                chat = null;
                                z8 = false;
                                z9 = false;
                                z10 = false;
                                dialogKey = dialogKey5;
                                user2 = user7;
                            }
                        }
                        str9 = "showExtraNotifications: [";
                        arrayList4 = arrayList3;
                        j5 = j4;
                        chat = null;
                        fileLocation = null;
                        z8 = false;
                        z9 = false;
                        z10 = false;
                        dialogKey = dialogKey5;
                        user2 = user7;
                    } else {
                        notification2 = build2;
                        longSparseArray5 = longSparseArray9;
                        num2 = num;
                        i8 = i26;
                        if (!DialogObject.isEncryptedDialog(j4)) {
                            boolean z13 = (messageObject == null || messageObject.isReactionPush || messageObject.isStoryReactionPush || j4 == 777000) ? false : true;
                            if (DialogObject.isUserDialog(j4)) {
                                user3 = notificationsController.getMessagesController().getUser(Long.valueOf(j4));
                                if (user3 == null) {
                                    if (messageObject.isFcmMessage()) {
                                        string = messageObject.localName;
                                        j5 = j4;
                                        z9 = z13;
                                        dialogKey = dialogKey5;
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.w("not found user to show dialog notification " + j4);
                                        }
                                        sharedPreferences = notificationsSettings;
                                        longSparseArray6 = longSparseArray;
                                        arrayList5 = arrayList17;
                                        arrayList6 = arrayList18;
                                        i9 = i24;
                                        str10 = str8;
                                        str11 = str4;
                                        j6 = j15;
                                        notification3 = notification2;
                                    }
                                } else {
                                    j5 = j4;
                                    String userName = UserObject.getUserName(user3);
                                    z9 = z13;
                                    TLRPC.UserProfilePhoto userProfilePhoto5 = user3.photo;
                                    if (userProfilePhoto5 == null || (fileLocation4 = userProfilePhoto5.photo_small) == null) {
                                        str13 = userName;
                                        dialogKey = dialogKey5;
                                    } else {
                                        str13 = userName;
                                        dialogKey = dialogKey5;
                                        if (fileLocation4.volume_id != 0 && fileLocation4.local_id != 0) {
                                            string = str13;
                                            if (j5 != UserObject.OAUTH) {
                                                string = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                            } else if (j5 == UserObject.VERIFY) {
                                                string = LocaleController.getString(R.string.VerifyCodesNotifications);
                                            } else if (UserObject.isReplyUser(j5)) {
                                                string = LocaleController.getString(R.string.RepliesTitle);
                                            } else if (j5 == j15) {
                                                string = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                                            }
                                            str9 = "showExtraNotifications: [";
                                            arrayList4 = arrayList3;
                                            chat2 = null;
                                            z8 = false;
                                            z10 = false;
                                            if (j5 == UserObject.VERIFY || messageObject == null || messageObject.getForwardedFromId() == null) {
                                                fileLocation5 = fileLocation4;
                                                chat3 = chat2;
                                            } else {
                                                Long forwardedFromId = messageObject.getForwardedFromId();
                                                fileLocation5 = fileLocation4;
                                                chat3 = chat2;
                                                long longValue = forwardedFromId.longValue();
                                                if (DialogObject.isUserDialog(longValue)) {
                                                    TLRPC.UserProfilePhoto userProfilePhoto6 = getMessagesController().getUser(forwardedFromId).photo;
                                                    if (userProfilePhoto6 != null && (fileLocation6 = userProfilePhoto6.photo_small) != null) {
                                                        user2 = user3;
                                                        if (fileLocation6.volume_id != 0) {
                                                        }
                                                        fileLocation = fileLocation5;
                                                    }
                                                } else {
                                                    user2 = user3;
                                                    TLRPC.ChatPhoto chatPhoto2 = getMessagesController().getChat(Long.valueOf(-longValue)).photo;
                                                    if (chatPhoto2 != null) {
                                                        fileLocation6 = chatPhoto2.photo_small;
                                                        if (fileLocation6 != null) {
                                                            if (fileLocation6.volume_id != 0) {
                                                            }
                                                        }
                                                    }
                                                    fileLocation = fileLocation5;
                                                }
                                                chat = chat3;
                                                if (j5 == UserObject.VERIFY) {
                                                    z9 = false;
                                                }
                                            }
                                            user2 = user3;
                                            fileLocation = fileLocation5;
                                            chat = chat3;
                                            if (j5 == UserObject.VERIFY) {
                                            }
                                        }
                                    }
                                    string = str13;
                                }
                                fileLocation4 = null;
                                if (j5 != UserObject.OAUTH) {
                                }
                                str9 = "showExtraNotifications: [";
                                arrayList4 = arrayList3;
                                chat2 = null;
                                z8 = false;
                                z10 = false;
                                if (j5 == UserObject.VERIFY) {
                                }
                                fileLocation5 = fileLocation4;
                                chat3 = chat2;
                                user2 = user3;
                                fileLocation = fileLocation5;
                                chat = chat3;
                                if (j5 == UserObject.VERIFY) {
                                }
                            } else {
                                j5 = j4;
                                z9 = z13;
                                dialogKey = dialogKey5;
                                TLRPC.Chat chat5 = notificationsController.getMessagesController().getChat(Long.valueOf(-j5));
                                if (chat5 == null) {
                                    if (messageObject.isFcmMessage()) {
                                        boolean isSupergroup = messageObject.isSupergroup();
                                        string = messageObject.localName;
                                        chat2 = chat5;
                                        z10 = isSupergroup;
                                        str9 = "showExtraNotifications: [";
                                        arrayList4 = arrayList3;
                                        z8 = messageObject.localChannel;
                                        fileLocation4 = null;
                                        user3 = null;
                                        z9 = false;
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.w("not found chat to show dialog notification " + j5);
                                        }
                                        sharedPreferences = notificationsSettings;
                                        longSparseArray6 = longSparseArray;
                                        arrayList5 = arrayList17;
                                        arrayList6 = arrayList18;
                                        i9 = i24;
                                        str10 = str8;
                                        str11 = str4;
                                        j6 = j15;
                                        notification3 = notification2;
                                    }
                                } else {
                                    boolean z14 = chat5.megagroup;
                                    boolean z15 = ChatObject.isChannel(chat5) && !chat5.megagroup;
                                    String title = notificationsController.getTitle(chat5);
                                    z10 = z14;
                                    TLRPC.ChatPhoto chatPhoto3 = chat5.photo;
                                    if (chatPhoto3 == null || (fileLocation2 = chatPhoto3.photo_small) == null) {
                                        str9 = "showExtraNotifications: [";
                                        arrayList4 = arrayList3;
                                    } else {
                                        str9 = "showExtraNotifications: [";
                                        arrayList4 = arrayList3;
                                        if (fileLocation2.volume_id != 0) {
                                        }
                                    }
                                    fileLocation2 = null;
                                    if (j3 != 0) {
                                        fileLocation3 = fileLocation2;
                                        TLRPC.TL_forumTopic findTopic = notificationsController.getMessagesController().getTopicsController().findTopic(chat5.id, j3);
                                        if (findTopic != null) {
                                            str12 = findTopic.title + " in " + title;
                                            if (z9) {
                                                z9 = ChatObject.canSendPlain(chat5);
                                            }
                                            z8 = z15;
                                            user3 = null;
                                            string = str12;
                                            chat2 = chat5;
                                            fileLocation4 = fileLocation3;
                                        }
                                    } else {
                                        fileLocation3 = fileLocation2;
                                    }
                                    str12 = title;
                                    if (z9) {
                                    }
                                    z8 = z15;
                                    user3 = null;
                                    string = str12;
                                    chat2 = chat5;
                                    fileLocation4 = fileLocation3;
                                }
                                if (j5 == UserObject.VERIFY) {
                                }
                                fileLocation5 = fileLocation4;
                                chat3 = chat2;
                                user2 = user3;
                                fileLocation = fileLocation5;
                                chat = chat3;
                                if (j5 == UserObject.VERIFY) {
                                }
                            }
                        } else {
                            str9 = "showExtraNotifications: [";
                            arrayList4 = arrayList3;
                            j5 = j4;
                            dialogKey = dialogKey5;
                            if (j5 != globalSecretChatId) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(j5);
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
                                notificationsController = this;
                                sharedPreferences = notificationsSettings;
                                longSparseArray6 = longSparseArray;
                                arrayList5 = arrayList17;
                                arrayList6 = arrayList18;
                                i9 = i24;
                                str10 = str8;
                                str11 = str4;
                                j6 = j15;
                                notification3 = notification2;
                            } else {
                                user = null;
                            }
                            string = LocaleController.getString(R.string.SecretChatName);
                            user2 = user;
                            chat = null;
                            fileLocation = null;
                            z8 = false;
                            z9 = false;
                            z10 = false;
                        }
                        i21 = i9 + 1;
                        arrayList16 = arrayList5;
                        arrayList14 = arrayList6;
                        size = i7;
                        z4 = z6;
                        z5 = z7;
                        longSparseArray8 = longSparseArray4;
                        str4 = str11;
                        longSparseArray9 = longSparseArray5;
                        str8 = str10;
                        notificationsSettings = sharedPreferences;
                        clientUserId = j6;
                        build2 = notification3;
                        longSparseArray = longSparseArray6;
                    }
                    if (messageObject != null && messageObject.isStoryReactionPush && !notificationsSettings.getBoolean("EnableReactionsPreview", true)) {
                        string = LocaleController.getString(R.string.NotificationHiddenChatName);
                        fileLocation = null;
                        z9 = false;
                    }
                    if (z7) {
                        if (DialogObject.isChatDialog(j5)) {
                            string2 = LocaleController.getString(R.string.NotificationHiddenChatName);
                        } else {
                            string2 = LocaleController.getString(R.string.NotificationHiddenName);
                        }
                        string = string2;
                        fileLocation = null;
                        z9 = false;
                    }
                    if (fileLocation != null) {
                        File pathToAttach = getFileLoader().getPathToAttach(fileLocation, true);
                        sharedPreferences = notificationsSettings;
                        if (Build.VERSION.SDK_INT < 28) {
                            z11 = z8;
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
                            z11 = z8;
                            bitmap5 = null;
                        }
                        file = pathToAttach;
                        bitmap = bitmap5;
                    } else {
                        sharedPreferences = notificationsSettings;
                        z11 = z8;
                        file = null;
                        bitmap = null;
                    }
                    if (chat != null) {
                        Person.Builder name = new Person.Builder().setName(string);
                        if (file != null && file.exists() && Build.VERSION.SDK_INT >= 28) {
                            loadRoundAvatar(j5, file, name);
                        }
                        longSparseArray.put(-chat.id, name.build());
                    }
                    if ((z11 && !z10) || !z9 || SharedConfig.isWaitingForPasscodeEnter || j15 == j5 || UserObject.isReplyUser(j5)) {
                        chat4 = chat;
                        file2 = file;
                        bitmap2 = bitmap;
                        str14 = "dialog_id";
                        user4 = user2;
                        i10 = id;
                        arrayList7 = arrayList4;
                        notificationsController = this;
                    } else {
                        chat4 = chat;
                        notificationsController = this;
                        if (MessagesController.getInstance(notificationsController.currentAccount).getSendPaidMessagesStars(j5) <= 0) {
                            file2 = file;
                            bitmap2 = bitmap;
                            Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                            intent2.putExtra("dialog_id", j5);
                            String str28 = str8;
                            intent2.putExtra(str28, id);
                            intent2.putExtra("topic_id", j3);
                            intent2.putExtra("currentAccount", notificationsController.currentAccount);
                            if (arrayList4.isEmpty()) {
                                str15 = string;
                                user4 = user2;
                                i10 = id;
                                arrayList7 = arrayList4;
                                str10 = str28;
                            } else {
                                ArrayList arrayList21 = new ArrayList();
                                str15 = string;
                                user4 = user2;
                                int i28 = 0;
                                while (i28 < arrayList4.size()) {
                                    ArrayList arrayList22 = arrayList4;
                                    MessageObject messageObject5 = (MessageObject) arrayList22.get(i28);
                                    if (messageObject5 == null || !messageObject5.isVoice() || !messageObject5.isContentUnread() || messageObject5.isOut()) {
                                        i11 = i28;
                                    } else {
                                        i11 = i28;
                                        arrayList21.add(Integer.valueOf(messageObject5.getId()));
                                    }
                                    i28 = i11 + 1;
                                    arrayList4 = arrayList22;
                                }
                                arrayList7 = arrayList4;
                                if (arrayList21.isEmpty()) {
                                    str10 = str28;
                                    i10 = id;
                                } else {
                                    int size4 = arrayList21.size();
                                    str10 = str28;
                                    int[] iArr = new int[size4];
                                    i10 = id;
                                    for (int i29 = 0; i29 < size4; i29++) {
                                        iArr[i29] = ((Integer) arrayList21.get(i29)).intValue();
                                    }
                                    intent2.putExtra("voice_msg_ids", iArr);
                                }
                            }
                            PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent2, 167772160);
                            RemoteInput build3 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                            if (DialogObject.isChatDialog(j5)) {
                                formatString = LocaleController.formatString(R.string.ReplyToGroup, str15);
                                r11 = 1;
                            } else {
                                r11 = 1;
                                formatString = LocaleController.formatString(R.string.ReplyToUser, str15);
                            }
                            str14 = "dialog_id";
                            build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast).setAllowGeneratedReplies(r11).setSemanticAction(r11).addRemoteInput(build3).setShowsUserInterface(false).build();
                            num3 = (Integer) notificationsController.pushDialogs.get(j5);
                            if (num3 == null) {
                                num3 = 0;
                            }
                            dialogKey2 = dialogKey;
                            if (!dialogKey2.story) {
                                max = notificationsController.storyPushMessages.size();
                            } else {
                                max = Math.max(num3.intValue(), arrayList7.size());
                            }
                            String format = (max > 1 || Build.VERSION.SDK_INT >= 28) ? str15 : String.format("%1$s (%2$d)", str15, Integer.valueOf(max));
                            Person person2 = (Person) longSparseArray.get(j15);
                            if (Build.VERSION.SDK_INT >= 28 && person2 == null) {
                                user6 = notificationsController.getMessagesController().getUser(Long.valueOf(j15));
                                if (user6 == null) {
                                    user6 = notificationsController.getUserConfig().getCurrentUser();
                                }
                                if (user6 != null) {
                                    try {
                                        userProfilePhoto3 = user6.photo;
                                    } catch (Throwable th) {
                                        th = th;
                                        j7 = j3;
                                    }
                                    if (userProfilePhoto3 != null && (fileLocation10 = userProfilePhoto3.photo_small) != null) {
                                        j7 = j3;
                                        try {
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (fileLocation10.volume_id != 0 && fileLocation10.local_id != 0) {
                                            Person.Builder name2 = new Person.Builder().setName(LocaleController.getString(R.string.FromYou));
                                            loadRoundAvatar(notificationsController.getUserConfig().getClientUserId(), notificationsController.getFileLoader().getPathToAttach(user6.photo.photo_small, true), name2);
                                            person = name2.build();
                                            try {
                                                longSparseArray.put(j15, person);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                person2 = person;
                                                FileLog.e(th);
                                                person = person2;
                                                if (messageObject == null) {
                                                }
                                                String str29 = "";
                                                if (person == null) {
                                                }
                                                messagingStyle = new NotificationCompat.MessagingStyle("");
                                                messagingStyle2 = messagingStyle;
                                                i12 = Build.VERSION.SDK_INT;
                                                if (i12 >= 28) {
                                                }
                                                messagingStyle2.setConversationTitle(format);
                                                messagingStyle2.setGroupConversation(i12 >= 28 || (!z11 && DialogObject.isChatDialog(j5)) || UserObject.isReplyUser(j5));
                                                StringBuilder sb4 = new StringBuilder();
                                                j6 = j15;
                                                String[] strArr2 = new String[1];
                                                boolean[] zArr2 = new boolean[1];
                                                if (dialogKey2.story) {
                                                }
                                                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                intent3.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent3.setFlags(67108864);
                                                intent3.addCategory("android.intent.category.LAUNCHER");
                                                messageObject3 = messageObject2;
                                                if (messageObject2 == null) {
                                                }
                                                if (messageObject3 == null) {
                                                }
                                                String str30 = str5;
                                                if (messageObject3 == null) {
                                                }
                                                str24 = str18;
                                                str25 = str4;
                                                str26 = str3;
                                                dialogKey4 = dialogKey3;
                                                if (dialogKey4.story) {
                                                }
                                                StringBuilder sb5 = new StringBuilder();
                                                sb5.append("show extra notifications chatId ");
                                                sb5.append(j5);
                                                sb5.append(" topicId ");
                                                j10 = j8;
                                                sb5.append(j10);
                                                FileLog.d(sb5.toString());
                                                if (j10 != 0) {
                                                }
                                                intent3.putExtra("currentAccount", notificationsController.currentAccount);
                                                str3 = str26;
                                                PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3, 1140850688);
                                                NotificationCompat.WearableExtender wearableExtender = new NotificationCompat.WearableExtender();
                                                NotificationCompat.Action action3 = action;
                                                if (action != null) {
                                                }
                                                String str31 = str17;
                                                Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                intent4.addFlags(32);
                                                str11 = str25;
                                                intent4.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                intent4.putExtra(str14, j5);
                                                int i30 = i10;
                                                intent4.putExtra(str10, i30);
                                                intent4.putExtra("currentAccount", notificationsController.currentAccount);
                                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList23 = arrayList9;
                                                NotificationCompat.Action build4 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent4, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                                if (!DialogObject.isEncryptedDialog(j5)) {
                                                }
                                                if (str27 == null) {
                                                }
                                                wearableExtender.setBridgeTag("tgaccount" + j6);
                                                if (!dialogKey4.story) {
                                                }
                                                String str32 = str24;
                                                NotificationCompat.Builder category = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str32).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true).setNumber(!dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList12.size()).setColor(-15618822).setGroupSummary(false).setWhen(j11).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity).extend(wearableExtender).setSortKey(String.valueOf(Long.MAX_VALUE - j11)).setCategory("msg");
                                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                intent.putExtra("messageDate", i8);
                                                intent.putExtra("dialogId", j5);
                                                intent.putExtra("currentAccount", notificationsController.currentAccount);
                                                if (dialogKey4.story) {
                                                }
                                                if (messageObject3 != null) {
                                                }
                                                category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160));
                                                if (z6) {
                                                }
                                                if (messageObject3 != null) {
                                                }
                                                tL_inlineButtonTypeCopy = null;
                                                keyboardInlineButton = null;
                                                if (keyboardInlineButton != null) {
                                                }
                                                j12 = dialogKey4.dialogId;
                                                if (j12 != UserObject.VERIFY) {
                                                }
                                                if (arrayList18.size() != 1) {
                                                }
                                                if (DialogObject.isEncryptedDialog(j5)) {
                                                }
                                                if (bitmap4 != null) {
                                                }
                                                if (!AndroidUtilities.needShowPasscode(false)) {
                                                }
                                                if (chat4 == null) {
                                                }
                                                user5 = user4;
                                                boolean z16 = z6;
                                                Notification notification4 = notification2;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                FileLog.d("showExtraNotifications: holders.add " + j5);
                                                notification3 = notification4;
                                                z6 = z16;
                                                long j17 = j5;
                                                arrayList6 = arrayList18;
                                                i9 = i24;
                                                longSparseArray6 = longSparseArray7;
                                                str7 = str16;
                                                str6 = str31;
                                                1NotificationHolder r0 = notificationsController.new 1NotificationHolder(num2.intValue(), j17, dialogKey4.story, j10, str32, user5, chat4, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                                arrayList5 = arrayList17;
                                                arrayList5.add(r0);
                                                notificationsController.wearNotificationsIds.put(j17, num2);
                                                i21 = i9 + 1;
                                                arrayList16 = arrayList5;
                                                arrayList14 = arrayList6;
                                                size = i7;
                                                z4 = z6;
                                                z5 = z7;
                                                longSparseArray8 = longSparseArray4;
                                                str4 = str11;
                                                longSparseArray9 = longSparseArray5;
                                                str8 = str10;
                                                notificationsSettings = sharedPreferences;
                                                clientUserId = j6;
                                                build2 = notification3;
                                                longSparseArray = longSparseArray6;
                                            }
                                            boolean z17 = (messageObject == null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                            String str292 = "";
                                            if (person == null && z17) {
                                                messagingStyle = new NotificationCompat.MessagingStyle(person);
                                            } else {
                                                messagingStyle = new NotificationCompat.MessagingStyle("");
                                            }
                                            messagingStyle2 = messagingStyle;
                                            i12 = Build.VERSION.SDK_INT;
                                            if (i12 >= 28 || ((DialogObject.isChatDialog(j5) && !z11) || UserObject.isReplyUser(j5))) {
                                                messagingStyle2.setConversationTitle(format);
                                            }
                                            messagingStyle2.setGroupConversation(i12 >= 28 || (!z11 && DialogObject.isChatDialog(j5)) || UserObject.isReplyUser(j5));
                                            StringBuilder sb42 = new StringBuilder();
                                            j6 = j15;
                                            String[] strArr22 = new String[1];
                                            boolean[] zArr22 = new boolean[1];
                                            if (dialogKey2.story) {
                                                ArrayList<String> arrayList24 = new ArrayList<>();
                                                ArrayList<Object> arrayList25 = new ArrayList<>();
                                                Pair<Integer, Boolean> parseStoryPushes = notificationsController.parseStoryPushes(arrayList24, arrayList25);
                                                int intValue = ((Integer) parseStoryPushes.first).intValue();
                                                boolean booleanValue = ((Boolean) parseStoryPushes.second).booleanValue();
                                                if (booleanValue) {
                                                    arrayList13 = arrayList25;
                                                    sb42.append(LocaleController.formatPluralString("StoryNotificationHidden", intValue, new Object[0]));
                                                } else {
                                                    arrayList13 = arrayList25;
                                                    if (arrayList24.isEmpty()) {
                                                        FileLog.d(str9 + j5 + "] continue; story but names is empty");
                                                        longSparseArray6 = longSparseArray;
                                                        arrayList5 = arrayList17;
                                                        arrayList6 = arrayList18;
                                                        i9 = i24;
                                                        str11 = str4;
                                                        notification3 = notification2;
                                                        i21 = i9 + 1;
                                                        arrayList16 = arrayList5;
                                                        arrayList14 = arrayList6;
                                                        size = i7;
                                                        z4 = z6;
                                                        z5 = z7;
                                                        longSparseArray8 = longSparseArray4;
                                                        str4 = str11;
                                                        longSparseArray9 = longSparseArray5;
                                                        str8 = str10;
                                                        notificationsSettings = sharedPreferences;
                                                        clientUserId = j6;
                                                        build2 = notification3;
                                                        longSparseArray = longSparseArray6;
                                                    } else if (arrayList24.size() != 1) {
                                                        if (arrayList24.size() == 2) {
                                                            z12 = booleanValue;
                                                            sb42.append(LocaleController.formatString(R.string.StoryNotification2, arrayList24.get(0), arrayList24.get(1)));
                                                        } else {
                                                            z12 = booleanValue;
                                                            if (arrayList24.size() == 3 && notificationsController.storyPushMessages.size() == 3) {
                                                                sb42.append(LocaleController.formatString(R.string.StoryNotification3, notificationsController.cutLastName(arrayList24.get(0)), notificationsController.cutLastName(arrayList24.get(1)), notificationsController.cutLastName(arrayList24.get(2))));
                                                            } else {
                                                                sb42.append(LocaleController.formatPluralString("StoryNotification4", notificationsController.storyPushMessages.size() - 2, notificationsController.cutLastName(arrayList24.get(0)), notificationsController.cutLastName(arrayList24.get(1))));
                                                            }
                                                        }
                                                        action = build;
                                                        long j18 = Long.MAX_VALUE;
                                                        i18 = 0;
                                                        while (i18 < notificationsController.storyPushMessages.size()) {
                                                            j18 = Math.min(notificationsController.storyPushMessages.get(i18).date, j18);
                                                            i18++;
                                                            dialogKey2 = dialogKey2;
                                                        }
                                                        dialogKey3 = dialogKey2;
                                                        messagingStyle2.setGroupConversation(false);
                                                        String formatPluralString = (arrayList24.size() == 1 || z12) ? LocaleController.formatPluralString("Stories", intValue, new Object[0]) : arrayList24.get(0);
                                                        messagingStyle2.addMessage(sb42, j18, new Person.Builder().setName(formatPluralString).build());
                                                        if (z12) {
                                                            bitmap3 = loadMultipleAvatars(arrayList13);
                                                            arrayList8 = arrayList7;
                                                            messagingStyle3 = messagingStyle2;
                                                            messageObject2 = messageObject;
                                                            str16 = str7;
                                                            str17 = str6;
                                                            j8 = j7;
                                                            arrayList9 = null;
                                                        } else {
                                                            arrayList8 = arrayList7;
                                                            messagingStyle3 = messagingStyle2;
                                                            messageObject2 = messageObject;
                                                            str16 = str7;
                                                            str17 = str6;
                                                            j8 = j7;
                                                            arrayList9 = null;
                                                            bitmap3 = null;
                                                        }
                                                        i13 = 0;
                                                        str18 = formatPluralString;
                                                        sb = sb42;
                                                    } else if (intValue == 1) {
                                                        sb42.append(LocaleController.getString("StoryNotificationSingle"));
                                                    } else {
                                                        sb42.append(LocaleController.formatPluralString("StoryNotification1", intValue, arrayList24.get(0)));
                                                    }
                                                }
                                                z12 = booleanValue;
                                                action = build;
                                                long j182 = Long.MAX_VALUE;
                                                i18 = 0;
                                                while (i18 < notificationsController.storyPushMessages.size()) {
                                                }
                                                dialogKey3 = dialogKey2;
                                                messagingStyle2.setGroupConversation(false);
                                                if (arrayList24.size() == 1) {
                                                }
                                                messagingStyle2.addMessage(sb42, j182, new Person.Builder().setName(formatPluralString).build());
                                                if (z12) {
                                                }
                                                i13 = 0;
                                                str18 = formatPluralString;
                                                sb = sb42;
                                            } else {
                                                action = build;
                                                dialogKey3 = dialogKey2;
                                                String str33 = str9;
                                                int size5 = arrayList7.size() - 1;
                                                int i31 = 0;
                                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList26 = null;
                                                while (size5 >= 0) {
                                                    MessageObject messageObject6 = (MessageObject) arrayList7.get(size5);
                                                    int i32 = size5;
                                                    int i33 = i31;
                                                    MessageObject messageObject7 = messageObject;
                                                    long topicId2 = MessageObject.getTopicId(notificationsController.currentAccount, messageObject6.messageOwner, notificationsController.getMessagesController().isForum(messageObject6));
                                                    if (j7 != topicId2) {
                                                        FileLog.d(str33 + j5 + "] continue; topic id is not equal: topicId=" + j7 + " messageTopicId=" + topicId2 + "; selfId=" + notificationsController.getUserConfig().getClientUserId());
                                                        zArr = zArr22;
                                                        arrayList11 = arrayList7;
                                                        messagingStyle5 = messagingStyle2;
                                                        str21 = str7;
                                                        str23 = str6;
                                                        j9 = j7;
                                                        strArr = strArr22;
                                                        sb2 = sb42;
                                                        str20 = str33;
                                                    } else {
                                                        long j19 = j7;
                                                        String shortStringForMessage = notificationsController.getShortStringForMessage(messageObject6, strArr22, zArr22);
                                                        if (j5 == UserObject.OAUTH) {
                                                            strArr22[0] = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                                            strArr = strArr22;
                                                            zArr = zArr22;
                                                        } else if (j5 != UserObject.VERIFY || messageObject6.getForwardedFromId() == null) {
                                                            strArr = strArr22;
                                                            zArr = zArr22;
                                                            if (j5 == j6) {
                                                                strArr[0] = str15;
                                                            } else if (DialogObject.isChatDialog(j5) && messageObject6.messageOwner.from_scheduled) {
                                                                strArr[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                                            }
                                                        } else {
                                                            strArr = strArr22;
                                                            zArr = zArr22;
                                                            strArr[0] = notificationsController.getMessagesController().getPeerName(messageObject6.getForwardedFromId().longValue());
                                                        }
                                                        if (shortStringForMessage == null) {
                                                            if (BuildVars.LOGS_ENABLED) {
                                                                FileLog.w("message text is null for " + messageObject6.getId() + " did = " + messageObject6.getDialogId());
                                                            }
                                                            arrayList11 = arrayList7;
                                                            messagingStyle5 = messagingStyle2;
                                                            str20 = str33;
                                                            j9 = j19;
                                                            str21 = str7;
                                                            str23 = str6;
                                                            sb2 = sb42;
                                                        } else {
                                                            if (sb42.length() > 0) {
                                                                sb42.append("\n\n");
                                                            }
                                                            if (j5 != j6 && messageObject6.messageOwner.from_scheduled && DialogObject.isUserDialog(j5)) {
                                                                str19 = str7;
                                                                shortStringForMessage = String.format(str19, LocaleController.getString(R.string.NotificationMessageScheduledName), shortStringForMessage);
                                                                sb42.append(shortStringForMessage);
                                                            } else {
                                                                str19 = str7;
                                                                String str34 = strArr[0];
                                                                if (str34 != null) {
                                                                    sb42.append(String.format(str19, str34, shortStringForMessage));
                                                                } else {
                                                                    sb42.append(shortStringForMessage);
                                                                }
                                                            }
                                                            String str35 = shortStringForMessage;
                                                            int i34 = (j5 > UserObject.VERIFY ? 1 : (j5 == UserObject.VERIFY ? 0 : -1));
                                                            if (i34 == 0 && messageObject6.getForwardedFromId() != null) {
                                                                sb2 = sb42;
                                                                arrayList10 = arrayList7;
                                                                senderId = messageObject6.getForwardedFromId().longValue();
                                                            } else {
                                                                if (DialogObject.isUserDialog(j5)) {
                                                                    sb2 = sb42;
                                                                    arrayList10 = arrayList7;
                                                                } else if (z11) {
                                                                    sb2 = sb42;
                                                                    arrayList10 = arrayList7;
                                                                    senderId = -j5;
                                                                } else {
                                                                    sb2 = sb42;
                                                                    arrayList10 = arrayList7;
                                                                    if (DialogObject.isChatDialog(j5)) {
                                                                        senderId = messageObject6.getSenderId();
                                                                    }
                                                                }
                                                                senderId = j5;
                                                            }
                                                            str20 = str33;
                                                            j9 = j19;
                                                            Person person3 = (Person) longSparseArray.get(senderId + (j19 << 16));
                                                            String str36 = strArr[0];
                                                            if (str36 == null) {
                                                                if (z7) {
                                                                    if (DialogObject.isChatDialog(j5)) {
                                                                        if (z11) {
                                                                            if (Build.VERSION.SDK_INT > 27) {
                                                                                str36 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                                                            }
                                                                        } else {
                                                                            str36 = LocaleController.getString(R.string.NotificationHiddenChatUserName);
                                                                        }
                                                                    } else if (Build.VERSION.SDK_INT > 27) {
                                                                        str36 = LocaleController.getString(R.string.NotificationHiddenName);
                                                                    }
                                                                }
                                                                str36 = str292;
                                                            }
                                                            if (person3 == null || !TextUtils.equals(person3.getName(), str36)) {
                                                                Person.Builder name3 = new Person.Builder().setName(str36);
                                                                if (!zArr[0] || DialogObject.isEncryptedDialog(j5) || Build.VERSION.SDK_INT < 28) {
                                                                    str21 = str19;
                                                                    messagingStyle4 = messagingStyle2;
                                                                } else {
                                                                    if (DialogObject.isUserDialog(j5) || z11) {
                                                                        i14 = i34;
                                                                        str21 = str19;
                                                                        file3 = file2;
                                                                    } else {
                                                                        long senderId2 = messageObject6.getSenderId();
                                                                        i14 = i34;
                                                                        str21 = str19;
                                                                        TLRPC.User user8 = notificationsController.getMessagesController().getUser(Long.valueOf(senderId2));
                                                                        if (user8 == null && (user8 = notificationsController.getMessagesStorage().getUserSync(senderId2)) != null) {
                                                                            notificationsController.getMessagesController().putUser(user8, true);
                                                                        }
                                                                        file3 = (user8 == null || (userProfilePhoto2 = user8.photo) == null || (fileLocation9 = userProfilePhoto2.photo_small) == null || fileLocation9.volume_id == 0 || fileLocation9.local_id == 0) ? null : notificationsController.getFileLoader().getPathToAttach(user8.photo.photo_small, true);
                                                                    }
                                                                    if (file3 == null && i14 == 0 && messageObject6.getForwardedFromId() != null) {
                                                                        if (senderId >= 0) {
                                                                            TLRPC.User user9 = notificationsController.getMessagesController().getUser(Long.valueOf(senderId));
                                                                            if (user9 != null && (userProfilePhoto = user9.photo) != null && (fileLocation8 = userProfilePhoto.photo_small) != null) {
                                                                                messagingStyle4 = messagingStyle2;
                                                                                str22 = str292;
                                                                                if (fileLocation8.volume_id != 0 && fileLocation8.local_id != 0) {
                                                                                    file3 = notificationsController.getFileLoader().getPathToAttach(user9.photo.photo_small, true);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            messagingStyle4 = messagingStyle2;
                                                                            str22 = str292;
                                                                            TLRPC.Chat chat6 = notificationsController.getMessagesController().getChat(Long.valueOf(-senderId));
                                                                            if (chat6 != null && (chatPhoto = chat6.photo) != null && (fileLocation7 = chatPhoto.photo_small) != null) {
                                                                                str292 = str22;
                                                                                if (fileLocation7.volume_id != 0 && fileLocation7.local_id != 0) {
                                                                                    file3 = notificationsController.getFileLoader().getPathToAttach(chat6.photo.photo_small, true);
                                                                                }
                                                                                loadRoundAvatar(j5, file3, name3);
                                                                            }
                                                                        }
                                                                        str292 = str22;
                                                                        loadRoundAvatar(j5, file3, name3);
                                                                    }
                                                                    messagingStyle4 = messagingStyle2;
                                                                    loadRoundAvatar(j5, file3, name3);
                                                                }
                                                                person3 = name3.build();
                                                                longSparseArray.put(senderId, person3);
                                                            } else {
                                                                str21 = str19;
                                                                messagingStyle4 = messagingStyle2;
                                                            }
                                                            if (!DialogObject.isEncryptedDialog(j5)) {
                                                                if (!zArr[0] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).isLowRamDevice() || z7 || messageObject6.isSecretMedia() || !(messageObject6.type == 1 || messageObject6.isSticker())) {
                                                                    arrayList11 = arrayList10;
                                                                    str23 = str6;
                                                                } else {
                                                                    File pathToMessage = notificationsController.getFileLoader().getPathToMessage(messageObject6.messageOwner);
                                                                    if (pathToMessage.exists() && messageObject6.hasMediaSpoilers()) {
                                                                        file4 = new File(pathToMessage.getParentFile(), pathToMessage.getName() + ".blur.jpg");
                                                                        if (file4.exists()) {
                                                                            arrayList11 = arrayList10;
                                                                        } else {
                                                                            try {
                                                                                Bitmap decodeFile2 = BitmapFactory.decodeFile(pathToMessage.getAbsolutePath());
                                                                                Bitmap stackBlurBitmapMax = Utilities.stackBlurBitmapMax(decodeFile2);
                                                                                decodeFile2.recycle();
                                                                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(stackBlurBitmapMax, decodeFile2.getWidth(), decodeFile2.getHeight(), true);
                                                                                Utilities.stackBlurBitmap(createScaledBitmap, 5);
                                                                                stackBlurBitmapMax.recycle();
                                                                                Canvas canvas = new Canvas(createScaledBitmap);
                                                                                try {
                                                                                    notificationsController.mediaSpoilerEffect.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i4) * 0.325f)));
                                                                                    i4 = -1;
                                                                                    arrayList11 = arrayList10;
                                                                                    try {
                                                                                        notificationsController.mediaSpoilerEffect.setBounds(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                                                                                        notificationsController.mediaSpoilerEffect.draw(canvas);
                                                                                        FileOutputStream fileOutputStream = new FileOutputStream(file4);
                                                                                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                                        fileOutputStream.close();
                                                                                        createScaledBitmap.recycle();
                                                                                        pathToMessage = file4;
                                                                                    } catch (Exception e) {
                                                                                        e = e;
                                                                                        FileLog.e(e);
                                                                                        NotificationCompat.MessagingStyle.Message message2 = new NotificationCompat.MessagingStyle.Message(str35, messageObject6.messageOwner.date * 1000, person3);
                                                                                        String str37 = !messageObject6.isSticker() ? "image/webp" : "image/jpeg";
                                                                                        if (!pathToMessage.exists()) {
                                                                                        }
                                                                                        if (j5 == 777000) {
                                                                                        }
                                                                                        i31 = i33;
                                                                                        size5 = i32 - 1;
                                                                                        messagingStyle2 = messagingStyle5;
                                                                                        str6 = str23;
                                                                                        sb42 = sb2;
                                                                                        str33 = str20;
                                                                                        strArr22 = strArr;
                                                                                        messageObject = messageObject7;
                                                                                        zArr22 = zArr;
                                                                                        str7 = str21;
                                                                                        j7 = j9;
                                                                                        arrayList7 = arrayList11;
                                                                                    }
                                                                                } catch (Exception e2) {
                                                                                    e = e2;
                                                                                    arrayList11 = arrayList10;
                                                                                    i4 = -1;
                                                                                }
                                                                            } catch (Exception e3) {
                                                                                e = e3;
                                                                                arrayList11 = arrayList10;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        arrayList11 = arrayList10;
                                                                        file4 = null;
                                                                    }
                                                                    NotificationCompat.MessagingStyle.Message message22 = new NotificationCompat.MessagingStyle.Message(str35, messageObject6.messageOwner.date * 1000, person3);
                                                                    String str372 = !messageObject6.isSticker() ? "image/webp" : "image/jpeg";
                                                                    if (!pathToMessage.exists()) {
                                                                        try {
                                                                            context = ApplicationLoader.applicationContext;
                                                                            sb3 = new StringBuilder();
                                                                            sb3.append(ApplicationLoader.getApplicationId());
                                                                            str23 = str6;
                                                                        } catch (Exception e4) {
                                                                            e = e4;
                                                                            str23 = str6;
                                                                        }
                                                                        try {
                                                                            sb3.append(str23);
                                                                            uriForFile = FileProvider.getUriForFile(context, sb3.toString(), pathToMessage);
                                                                        } catch (Exception e5) {
                                                                            e = e5;
                                                                            FileLog.e(e);
                                                                            uriForFile = null;
                                                                            if (uriForFile != null) {
                                                                            }
                                                                            messagingStyle5 = messagingStyle4;
                                                                            messagingStyle5.addMessage(str35, messageObject6.messageOwner.date * 1000, person3);
                                                                            if (zArr[0]) {
                                                                            }
                                                                            if (j5 == 777000) {
                                                                            }
                                                                            i31 = i33;
                                                                            size5 = i32 - 1;
                                                                            messagingStyle2 = messagingStyle5;
                                                                            str6 = str23;
                                                                            sb42 = sb2;
                                                                            str33 = str20;
                                                                            strArr22 = strArr;
                                                                            messageObject = messageObject7;
                                                                            zArr22 = zArr;
                                                                            str7 = str21;
                                                                            j7 = j9;
                                                                            arrayList7 = arrayList11;
                                                                        }
                                                                        if (uriForFile != null) {
                                                                            message22.setData(str372, uriForFile);
                                                                            messagingStyle5 = messagingStyle4;
                                                                            messagingStyle5.addMessage(message22);
                                                                            ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriForFile, 1);
                                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda53
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    NotificationsController.$r8$lambda$gQghIUHs5ZKeIK8dHwFQ_2pzquE(uriForFile, file4);
                                                                                }
                                                                            }, 20000L);
                                                                            if (!TextUtils.isEmpty(messageObject6.caption)) {
                                                                                messagingStyle5.addMessage(messageObject6.caption, messageObject6.messageOwner.date * 1000, person3);
                                                                            }
                                                                            if (zArr[0] && !z7 && messageObject6.isVoice()) {
                                                                                messages = messagingStyle5.getMessages();
                                                                                if (!messages.isEmpty()) {
                                                                                    File pathToMessage2 = notificationsController.getFileLoader().getPathToMessage(messageObject6.messageOwner);
                                                                                    if (pathToMessage2.exists()) {
                                                                                        if (Build.VERSION.SDK_INT >= 24) {
                                                                                            try {
                                                                                                uri2 = FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + str23, pathToMessage2);
                                                                                            } catch (Exception unused2) {
                                                                                                uri2 = null;
                                                                                            }
                                                                                        } else {
                                                                                            uri2 = Uri.fromFile(pathToMessage2);
                                                                                        }
                                                                                        if (uri2 != null) {
                                                                                            ((NotificationCompat.MessagingStyle.Message) messages.get(messages.size() - 1)).setData("audio/ogg", uri2);
                                                                                        }
                                                                                    } else if (messageObject6.getDocument() != null) {
                                                                                        String attachFileName = FileLoader.getAttachFileName(messageObject6.getDocument());
                                                                                        if (!notificationsController.pendingVoiceLoads.contains(attachFileName)) {
                                                                                            notificationsController.pendingVoiceLoads.add(attachFileName);
                                                                                            notificationsController.getFileLoader().loadFile(messageObject6.getDocument(), messageObject6, 3, 0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str23 = str6;
                                                                        if (notificationsController.getFileLoader().isLoadingFile(pathToMessage.getName())) {
                                                                            uriForFile = new Uri.Builder().scheme("content").authority(NotificationImageProvider.getAuthority()).appendPath("msg_media_raw").appendPath(notificationsController.currentAccount + str292).appendPath(pathToMessage.getName()).appendQueryParameter("final_path", pathToMessage.getAbsolutePath()).build();
                                                                            if (uriForFile != null) {
                                                                            }
                                                                        }
                                                                        uriForFile = null;
                                                                        if (uriForFile != null) {
                                                                        }
                                                                    }
                                                                }
                                                                messagingStyle5 = messagingStyle4;
                                                                messagingStyle5.addMessage(str35, messageObject6.messageOwner.date * 1000, person3);
                                                                if (zArr[0]) {
                                                                    messages = messagingStyle5.getMessages();
                                                                    if (!messages.isEmpty()) {
                                                                    }
                                                                }
                                                            } else {
                                                                arrayList11 = arrayList10;
                                                                str23 = str6;
                                                                messagingStyle5 = messagingStyle4;
                                                                messagingStyle5.addMessage(str35, messageObject6.messageOwner.date * 1000, person3);
                                                            }
                                                            if (j5 == 777000) {
                                                                TLRPC.ReplyMarkup replyMarkup2 = messageObject6.messageOwner.reply_markup;
                                                                if (replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) {
                                                                    arrayList26 = ((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows;
                                                                    i31 = messageObject6.getId();
                                                                    size5 = i32 - 1;
                                                                    messagingStyle2 = messagingStyle5;
                                                                    str6 = str23;
                                                                    sb42 = sb2;
                                                                    str33 = str20;
                                                                    strArr22 = strArr;
                                                                    messageObject = messageObject7;
                                                                    zArr22 = zArr;
                                                                    str7 = str21;
                                                                    j7 = j9;
                                                                    arrayList7 = arrayList11;
                                                                }
                                                            }
                                                            i31 = i33;
                                                            size5 = i32 - 1;
                                                            messagingStyle2 = messagingStyle5;
                                                            str6 = str23;
                                                            sb42 = sb2;
                                                            str33 = str20;
                                                            strArr22 = strArr;
                                                            messageObject = messageObject7;
                                                            zArr22 = zArr;
                                                            str7 = str21;
                                                            j7 = j9;
                                                            arrayList7 = arrayList11;
                                                        }
                                                    }
                                                    i31 = i33;
                                                    size5 = i32 - 1;
                                                    messagingStyle2 = messagingStyle5;
                                                    str6 = str23;
                                                    sb42 = sb2;
                                                    str33 = str20;
                                                    strArr22 = strArr;
                                                    messageObject = messageObject7;
                                                    zArr22 = zArr;
                                                    str7 = str21;
                                                    j7 = j9;
                                                    arrayList7 = arrayList11;
                                                }
                                                arrayList8 = arrayList7;
                                                messagingStyle3 = messagingStyle2;
                                                messageObject2 = messageObject;
                                                str16 = str7;
                                                str17 = str6;
                                                j8 = j7;
                                                sb = sb42;
                                                str18 = str15;
                                                arrayList9 = arrayList26;
                                                bitmap3 = bitmap2;
                                                i13 = i31;
                                            }
                                            Intent intent32 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                            intent32.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            intent32.setFlags(67108864);
                                            intent32.addCategory("android.intent.category.LAUNCHER");
                                            messageObject3 = messageObject2;
                                            if (messageObject2 == null && messageObject3.isOauthPush) {
                                                intent32.putExtra("oauth_url", messageObject3.localName);
                                            } else if (messageObject3 == null && messageObject3.isStoryReactionPush) {
                                                intent32.putExtra(str5, Math.abs(messageObject3.getId()));
                                            } else {
                                                String str302 = str5;
                                                if (messageObject3 == null && messageObject3.isLiveStoryPush) {
                                                    if (j5 < 0) {
                                                        str24 = str18;
                                                        str25 = str4;
                                                        intent32.putExtra(str25, -j5);
                                                        str26 = str3;
                                                    } else {
                                                        str24 = str18;
                                                        str25 = str4;
                                                        str26 = str3;
                                                        if (j5 > 0) {
                                                            intent32.putExtra(str26, j5);
                                                        }
                                                    }
                                                    intent32.putExtra(str302, Math.abs(messageObject3.getId()));
                                                    longSparseArray7 = longSparseArray;
                                                    str5 = str302;
                                                    i15 = i13;
                                                    dialogKey4 = dialogKey3;
                                                } else {
                                                    str24 = str18;
                                                    str25 = str4;
                                                    str26 = str3;
                                                    dialogKey4 = dialogKey3;
                                                    if (dialogKey4.story) {
                                                        long[] jArr2 = new long[notificationsController.storyPushMessages.size()];
                                                        longSparseArray7 = longSparseArray;
                                                        str5 = str302;
                                                        int i35 = 0;
                                                        while (i35 < notificationsController.storyPushMessages.size()) {
                                                            jArr2[i35] = notificationsController.storyPushMessages.get(i35).dialogId;
                                                            i35++;
                                                            i13 = i13;
                                                        }
                                                        i15 = i13;
                                                        intent32.putExtra("storyDialogIds", jArr2);
                                                    } else {
                                                        longSparseArray7 = longSparseArray;
                                                        str5 = str302;
                                                        i15 = i13;
                                                        if (DialogObject.isEncryptedDialog(j5)) {
                                                            intent32.putExtra("encId", DialogObject.getEncryptedChatId(j5));
                                                        } else if (DialogObject.isUserDialog(j5)) {
                                                            intent32.putExtra(str26, j5);
                                                        } else {
                                                            intent32.putExtra(str25, -j5);
                                                        }
                                                    }
                                                }
                                                StringBuilder sb52 = new StringBuilder();
                                                sb52.append("show extra notifications chatId ");
                                                sb52.append(j5);
                                                sb52.append(" topicId ");
                                                j10 = j8;
                                                sb52.append(j10);
                                                FileLog.d(sb52.toString());
                                                if (j10 != 0) {
                                                    intent32.putExtra("topicId", j10);
                                                }
                                                intent32.putExtra("currentAccount", notificationsController.currentAccount);
                                                str3 = str26;
                                                PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32, 1140850688);
                                                NotificationCompat.WearableExtender wearableExtender2 = new NotificationCompat.WearableExtender();
                                                NotificationCompat.Action action32 = action;
                                                if (action != null) {
                                                    wearableExtender2.addAction(action32);
                                                }
                                                String str312 = str17;
                                                Intent intent42 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                intent42.addFlags(32);
                                                str11 = str25;
                                                intent42.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                intent42.putExtra(str14, j5);
                                                int i302 = i10;
                                                intent42.putExtra(str10, i302);
                                                intent42.putExtra("currentAccount", notificationsController.currentAccount);
                                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList232 = arrayList9;
                                                NotificationCompat.Action build42 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent42, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                                if (!DialogObject.isEncryptedDialog(j5)) {
                                                    action2 = build42;
                                                    bitmap4 = bitmap3;
                                                    str27 = j5 != globalSecretChatId ? "tgenc" + DialogObject.getEncryptedChatId(j5) + "_" + i302 : null;
                                                } else if (DialogObject.isUserDialog(j5)) {
                                                    str27 = "tguser" + j5 + "_" + i302;
                                                    action2 = build42;
                                                    bitmap4 = bitmap3;
                                                } else {
                                                    StringBuilder sb6 = new StringBuilder();
                                                    sb6.append("tgchat");
                                                    action2 = build42;
                                                    bitmap4 = bitmap3;
                                                    sb6.append(-j5);
                                                    sb6.append("_");
                                                    sb6.append(i302);
                                                    str27 = sb6.toString();
                                                }
                                                if (str27 == null) {
                                                    wearableExtender2.setDismissalId(str27);
                                                    NotificationCompat.WearableExtender wearableExtender3 = new NotificationCompat.WearableExtender();
                                                    wearableExtender3.setDismissalId("summary_" + str27);
                                                    builder.extend(wearableExtender3);
                                                }
                                                wearableExtender2.setBridgeTag("tgaccount" + j6);
                                                if (!dialogKey4.story) {
                                                    j6 = j6;
                                                    j11 = Long.MAX_VALUE;
                                                    for (int i36 = 0; i36 < notificationsController.storyPushMessages.size(); i36++) {
                                                        j11 = Math.min(notificationsController.storyPushMessages.get(i36).date, j11);
                                                    }
                                                    arrayList12 = arrayList8;
                                                } else {
                                                    j6 = j6;
                                                    arrayList12 = arrayList8;
                                                    j11 = ((MessageObject) arrayList12.get(0)).messageOwner.date * 1000;
                                                }
                                                String str322 = str24;
                                                NotificationCompat.Builder category2 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str322).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true).setNumber(!dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList12.size()).setColor(-15618822).setGroupSummary(false).setWhen(j11).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity2).extend(wearableExtender2).setSortKey(String.valueOf(Long.MAX_VALUE - j11)).setCategory("msg");
                                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                intent.putExtra("messageDate", i8);
                                                intent.putExtra("dialogId", j5);
                                                intent.putExtra("currentAccount", notificationsController.currentAccount);
                                                if (dialogKey4.story) {
                                                    intent.putExtra("story", true);
                                                }
                                                if (messageObject3 != null && messageObject3.isStoryReactionPush) {
                                                    intent.putExtra("storyReaction", true);
                                                }
                                                category2.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160));
                                                if (z6) {
                                                    category2.setGroup(notificationsController.notificationGroup);
                                                    category2.setGroupAlertBehavior(1);
                                                }
                                                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                                                    replyMarkup = message.reply_markup;
                                                    if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                        TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                                                        keyboardInlineButton = null;
                                                        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy2 = null;
                                                        for (int i37 = 0; i37 < tL_replyInlineMarkup.rows.size(); i37++) {
                                                            int i38 = 0;
                                                            while (true) {
                                                                if (i38 >= tL_replyInlineMarkup.rows.get(i37).buttons.size()) {
                                                                    break;
                                                                }
                                                                TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = tL_replyInlineMarkup.rows.get(i37).buttons.get(i38);
                                                                tL_inlineButtonTypeCopy2 = (TL_keyboard.TL_inlineButtonTypeCopy) TLKeyboardHelper.getType(keyboardInlineButton2, TL_keyboard.TL_inlineButtonTypeCopy.class);
                                                                if (tL_inlineButtonTypeCopy2 != null) {
                                                                    keyboardInlineButton = keyboardInlineButton2;
                                                                    break;
                                                                }
                                                                i38++;
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
                                                            category2.addAction(new NotificationCompat.Action.Builder(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent5, 167772160)).setShowsUserInterface(false).build());
                                                        }
                                                        j12 = dialogKey4.dialogId;
                                                        if (j12 != UserObject.VERIFY && j12 != UserObject.OAUTH) {
                                                            if (action32 != null) {
                                                                category2.addAction(action32);
                                                            }
                                                            if (!z7 && !dialogKey4.story && (messageObject3 == null || !messageObject3.isStoryReactionPush)) {
                                                                category2.addAction(action2);
                                                            }
                                                        }
                                                        if (arrayList18.size() != 1 && !TextUtils.isEmpty(str) && !dialogKey4.story) {
                                                            category2.setSubText(str);
                                                        }
                                                        if (DialogObject.isEncryptedDialog(j5)) {
                                                            category2.setLocalOnly(true);
                                                        }
                                                        if (bitmap4 != null) {
                                                            category2.setLargeIcon(bitmap4);
                                                        }
                                                        if (!AndroidUtilities.needShowPasscode(false) && !SharedConfig.isWaitingForPasscodeEnter && arrayList232 != null) {
                                                            size3 = arrayList232.size();
                                                            i16 = 0;
                                                            while (i16 < size3) {
                                                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList27 = arrayList232;
                                                                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList27.get(i16);
                                                                int size6 = keyboardInlineButtonRow.buttons.size();
                                                                int i39 = 0;
                                                                while (i39 < size6) {
                                                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton3 = keyboardInlineButtonRow.buttons.get(i39);
                                                                    TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) TLKeyboardHelper.getType(keyboardInlineButton3, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                    int i40 = size3;
                                                                    if (tL_inlineButtonTypeCallback != null) {
                                                                        i17 = i16;
                                                                        Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                                        intent6.putExtra("currentAccount", notificationsController.currentAccount);
                                                                        intent6.putExtra("did", j5);
                                                                        byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                        if (bArr != null) {
                                                                            intent6.putExtra("data", bArr);
                                                                        }
                                                                        intent6.putExtra("mid", i15);
                                                                        String str38 = keyboardInlineButton3.text;
                                                                        Context context2 = ApplicationLoader.applicationContext;
                                                                        int i41 = notificationsController.lastButtonId;
                                                                        notificationsController.lastButtonId = i41 + 1;
                                                                        category2.addAction(0, str38, PendingIntent.getBroadcast(context2, i41, intent6, 167772160));
                                                                    } else {
                                                                        i17 = i16;
                                                                    }
                                                                    i39++;
                                                                    size3 = i40;
                                                                    i16 = i17;
                                                                }
                                                                i16++;
                                                                size3 = size3;
                                                                arrayList232 = arrayList27;
                                                            }
                                                        }
                                                        if (chat4 == null || user4 == null) {
                                                            user5 = user4;
                                                        } else {
                                                            user5 = user4;
                                                            String str39 = user5.phone;
                                                            if (str39 != null && str39.length() > 0) {
                                                                category2.addPerson("tel:+" + user5.phone);
                                                            }
                                                        }
                                                        boolean z162 = z6;
                                                        Notification notification42 = notification2;
                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                            notificationsController.setNotificationChannel(notification42, category2, z162);
                                                        }
                                                        FileLog.d("showExtraNotifications: holders.add " + j5);
                                                        notification3 = notification42;
                                                        z6 = z162;
                                                        long j172 = j5;
                                                        arrayList6 = arrayList18;
                                                        i9 = i24;
                                                        longSparseArray6 = longSparseArray7;
                                                        str7 = str16;
                                                        str6 = str312;
                                                        1NotificationHolder r02 = notificationsController.new 1NotificationHolder(num2.intValue(), j172, dialogKey4.story, j10, str322, user5, chat4, category2, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                                        arrayList5 = arrayList17;
                                                        arrayList5.add(r02);
                                                        notificationsController.wearNotificationsIds.put(j172, num2);
                                                        i21 = i9 + 1;
                                                        arrayList16 = arrayList5;
                                                        arrayList14 = arrayList6;
                                                        size = i7;
                                                        z4 = z6;
                                                        z5 = z7;
                                                        longSparseArray8 = longSparseArray4;
                                                        str4 = str11;
                                                        longSparseArray9 = longSparseArray5;
                                                        str8 = str10;
                                                        notificationsSettings = sharedPreferences;
                                                        clientUserId = j6;
                                                        build2 = notification3;
                                                        longSparseArray = longSparseArray6;
                                                    }
                                                }
                                                tL_inlineButtonTypeCopy = null;
                                                keyboardInlineButton = null;
                                                if (keyboardInlineButton != null) {
                                                }
                                                j12 = dialogKey4.dialogId;
                                                if (j12 != UserObject.VERIFY) {
                                                    if (action32 != null) {
                                                    }
                                                    if (!z7) {
                                                        category2.addAction(action2);
                                                    }
                                                }
                                                if (arrayList18.size() != 1) {
                                                }
                                                if (DialogObject.isEncryptedDialog(j5)) {
                                                }
                                                if (bitmap4 != null) {
                                                }
                                                if (!AndroidUtilities.needShowPasscode(false)) {
                                                    size3 = arrayList232.size();
                                                    i16 = 0;
                                                    while (i16 < size3) {
                                                    }
                                                }
                                                if (chat4 == null) {
                                                }
                                                user5 = user4;
                                                boolean z1622 = z6;
                                                Notification notification422 = notification2;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                FileLog.d("showExtraNotifications: holders.add " + j5);
                                                notification3 = notification422;
                                                z6 = z1622;
                                                long j1722 = j5;
                                                arrayList6 = arrayList18;
                                                i9 = i24;
                                                longSparseArray6 = longSparseArray7;
                                                str7 = str16;
                                                str6 = str312;
                                                1NotificationHolder r022 = notificationsController.new 1NotificationHolder(num2.intValue(), j1722, dialogKey4.story, j10, str322, user5, chat4, category2, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                                arrayList5 = arrayList17;
                                                arrayList5.add(r022);
                                                notificationsController.wearNotificationsIds.put(j1722, num2);
                                                i21 = i9 + 1;
                                                arrayList16 = arrayList5;
                                                arrayList14 = arrayList6;
                                                size = i7;
                                                z4 = z6;
                                                z5 = z7;
                                                longSparseArray8 = longSparseArray4;
                                                str4 = str11;
                                                longSparseArray9 = longSparseArray5;
                                                str8 = str10;
                                                notificationsSettings = sharedPreferences;
                                                clientUserId = j6;
                                                build2 = notification3;
                                                longSparseArray = longSparseArray6;
                                            }
                                            longSparseArray7 = longSparseArray;
                                            str24 = str18;
                                            str25 = str4;
                                            str26 = str3;
                                            dialogKey4 = dialogKey3;
                                            i15 = i13;
                                            StringBuilder sb522 = new StringBuilder();
                                            sb522.append("show extra notifications chatId ");
                                            sb522.append(j5);
                                            sb522.append(" topicId ");
                                            j10 = j8;
                                            sb522.append(j10);
                                            FileLog.d(sb522.toString());
                                            if (j10 != 0) {
                                            }
                                            intent32.putExtra("currentAccount", notificationsController.currentAccount);
                                            str3 = str26;
                                            PendingIntent activity22 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32, 1140850688);
                                            NotificationCompat.WearableExtender wearableExtender22 = new NotificationCompat.WearableExtender();
                                            NotificationCompat.Action action322 = action;
                                            if (action != null) {
                                            }
                                            String str3122 = str17;
                                            Intent intent422 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                            intent422.addFlags(32);
                                            str11 = str25;
                                            intent422.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                            intent422.putExtra(str14, j5);
                                            int i3022 = i10;
                                            intent422.putExtra(str10, i3022);
                                            intent422.putExtra("currentAccount", notificationsController.currentAccount);
                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList2322 = arrayList9;
                                            NotificationCompat.Action build422 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent422, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                            if (!DialogObject.isEncryptedDialog(j5)) {
                                            }
                                            if (str27 == null) {
                                            }
                                            wearableExtender22.setBridgeTag("tgaccount" + j6);
                                            if (!dialogKey4.story) {
                                            }
                                            String str3222 = str24;
                                            NotificationCompat.Builder category22 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str3222).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true).setNumber(!dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList12.size()).setColor(-15618822).setGroupSummary(false).setWhen(j11).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity22).extend(wearableExtender22).setSortKey(String.valueOf(Long.MAX_VALUE - j11)).setCategory("msg");
                                            intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                            intent.putExtra("messageDate", i8);
                                            intent.putExtra("dialogId", j5);
                                            intent.putExtra("currentAccount", notificationsController.currentAccount);
                                            if (dialogKey4.story) {
                                            }
                                            if (messageObject3 != null) {
                                                intent.putExtra("storyReaction", true);
                                            }
                                            category22.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160));
                                            if (z6) {
                                            }
                                            if (messageObject3 != null) {
                                                replyMarkup = message.reply_markup;
                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                }
                                            }
                                            tL_inlineButtonTypeCopy = null;
                                            keyboardInlineButton = null;
                                            if (keyboardInlineButton != null) {
                                            }
                                            j12 = dialogKey4.dialogId;
                                            if (j12 != UserObject.VERIFY) {
                                            }
                                            if (arrayList18.size() != 1) {
                                            }
                                            if (DialogObject.isEncryptedDialog(j5)) {
                                            }
                                            if (bitmap4 != null) {
                                            }
                                            if (!AndroidUtilities.needShowPasscode(false)) {
                                            }
                                            if (chat4 == null) {
                                            }
                                            user5 = user4;
                                            boolean z16222 = z6;
                                            Notification notification4222 = notification2;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                            }
                                            FileLog.d("showExtraNotifications: holders.add " + j5);
                                            notification3 = notification4222;
                                            z6 = z16222;
                                            long j17222 = j5;
                                            arrayList6 = arrayList18;
                                            i9 = i24;
                                            longSparseArray6 = longSparseArray7;
                                            str7 = str16;
                                            str6 = str3122;
                                            1NotificationHolder r0222 = notificationsController.new 1NotificationHolder(num2.intValue(), j17222, dialogKey4.story, j10, str3222, user5, chat4, category22, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                            arrayList5 = arrayList17;
                                            arrayList5.add(r0222);
                                            notificationsController.wearNotificationsIds.put(j17222, num2);
                                            i21 = i9 + 1;
                                            arrayList16 = arrayList5;
                                            arrayList14 = arrayList6;
                                            size = i7;
                                            z4 = z6;
                                            z5 = z7;
                                            longSparseArray8 = longSparseArray4;
                                            str4 = str11;
                                            longSparseArray9 = longSparseArray5;
                                            str8 = str10;
                                            notificationsSettings = sharedPreferences;
                                            clientUserId = j6;
                                            build2 = notification3;
                                            longSparseArray = longSparseArray6;
                                        }
                                        person = person2;
                                        if (messageObject == null) {
                                        }
                                        String str2922 = "";
                                        if (person == null) {
                                        }
                                        messagingStyle = new NotificationCompat.MessagingStyle("");
                                        messagingStyle2 = messagingStyle;
                                        i12 = Build.VERSION.SDK_INT;
                                        if (i12 >= 28) {
                                        }
                                        messagingStyle2.setConversationTitle(format);
                                        messagingStyle2.setGroupConversation(i12 >= 28 || (!z11 && DialogObject.isChatDialog(j5)) || UserObject.isReplyUser(j5));
                                        StringBuilder sb422 = new StringBuilder();
                                        j6 = j15;
                                        String[] strArr222 = new String[1];
                                        boolean[] zArr222 = new boolean[1];
                                        if (dialogKey2.story) {
                                        }
                                        Intent intent322 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                        intent322.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                        intent322.setFlags(67108864);
                                        intent322.addCategory("android.intent.category.LAUNCHER");
                                        messageObject3 = messageObject2;
                                        if (messageObject2 == null) {
                                        }
                                        if (messageObject3 == null) {
                                        }
                                        String str3022 = str5;
                                        if (messageObject3 == null) {
                                        }
                                        str24 = str18;
                                        str25 = str4;
                                        str26 = str3;
                                        dialogKey4 = dialogKey3;
                                        if (dialogKey4.story) {
                                        }
                                        StringBuilder sb5222 = new StringBuilder();
                                        sb5222.append("show extra notifications chatId ");
                                        sb5222.append(j5);
                                        sb5222.append(" topicId ");
                                        j10 = j8;
                                        sb5222.append(j10);
                                        FileLog.d(sb5222.toString());
                                        if (j10 != 0) {
                                        }
                                        intent322.putExtra("currentAccount", notificationsController.currentAccount);
                                        str3 = str26;
                                        PendingIntent activity222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322, 1140850688);
                                        NotificationCompat.WearableExtender wearableExtender222 = new NotificationCompat.WearableExtender();
                                        NotificationCompat.Action action3222 = action;
                                        if (action != null) {
                                        }
                                        String str31222 = str17;
                                        Intent intent4222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                        intent4222.addFlags(32);
                                        str11 = str25;
                                        intent4222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                        intent4222.putExtra(str14, j5);
                                        int i30222 = i10;
                                        intent4222.putExtra(str10, i30222);
                                        intent4222.putExtra("currentAccount", notificationsController.currentAccount);
                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList23222 = arrayList9;
                                        NotificationCompat.Action build4222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent4222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                        if (!DialogObject.isEncryptedDialog(j5)) {
                                        }
                                        if (str27 == null) {
                                        }
                                        wearableExtender222.setBridgeTag("tgaccount" + j6);
                                        if (!dialogKey4.story) {
                                        }
                                        String str32222 = str24;
                                        NotificationCompat.Builder category222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str32222).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true).setNumber(!dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList12.size()).setColor(-15618822).setGroupSummary(false).setWhen(j11).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity222).extend(wearableExtender222).setSortKey(String.valueOf(Long.MAX_VALUE - j11)).setCategory("msg");
                                        intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                        intent.putExtra("messageDate", i8);
                                        intent.putExtra("dialogId", j5);
                                        intent.putExtra("currentAccount", notificationsController.currentAccount);
                                        if (dialogKey4.story) {
                                        }
                                        if (messageObject3 != null) {
                                        }
                                        category222.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160));
                                        if (z6) {
                                        }
                                        if (messageObject3 != null) {
                                        }
                                        tL_inlineButtonTypeCopy = null;
                                        keyboardInlineButton = null;
                                        if (keyboardInlineButton != null) {
                                        }
                                        j12 = dialogKey4.dialogId;
                                        if (j12 != UserObject.VERIFY) {
                                        }
                                        if (arrayList18.size() != 1) {
                                        }
                                        if (DialogObject.isEncryptedDialog(j5)) {
                                        }
                                        if (bitmap4 != null) {
                                        }
                                        if (!AndroidUtilities.needShowPasscode(false)) {
                                        }
                                        if (chat4 == null) {
                                        }
                                        user5 = user4;
                                        boolean z162222 = z6;
                                        Notification notification42222 = notification2;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                        }
                                        FileLog.d("showExtraNotifications: holders.add " + j5);
                                        notification3 = notification42222;
                                        z6 = z162222;
                                        long j172222 = j5;
                                        arrayList6 = arrayList18;
                                        i9 = i24;
                                        longSparseArray6 = longSparseArray7;
                                        str7 = str16;
                                        str6 = str31222;
                                        1NotificationHolder r02222 = notificationsController.new 1NotificationHolder(num2.intValue(), j172222, dialogKey4.story, j10, str32222, user5, chat4, category222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                        arrayList5 = arrayList17;
                                        arrayList5.add(r02222);
                                        notificationsController.wearNotificationsIds.put(j172222, num2);
                                        i21 = i9 + 1;
                                        arrayList16 = arrayList5;
                                        arrayList14 = arrayList6;
                                        size = i7;
                                        z4 = z6;
                                        z5 = z7;
                                        longSparseArray8 = longSparseArray4;
                                        str4 = str11;
                                        longSparseArray9 = longSparseArray5;
                                        str8 = str10;
                                        notificationsSettings = sharedPreferences;
                                        clientUserId = j6;
                                        build2 = notification3;
                                        longSparseArray = longSparseArray6;
                                    }
                                }
                            }
                            j7 = j3;
                            person = person2;
                            if (messageObject == null) {
                            }
                            String str29222 = "";
                            if (person == null) {
                            }
                            messagingStyle = new NotificationCompat.MessagingStyle("");
                            messagingStyle2 = messagingStyle;
                            i12 = Build.VERSION.SDK_INT;
                            if (i12 >= 28) {
                            }
                            messagingStyle2.setConversationTitle(format);
                            messagingStyle2.setGroupConversation(i12 >= 28 || (!z11 && DialogObject.isChatDialog(j5)) || UserObject.isReplyUser(j5));
                            StringBuilder sb4222 = new StringBuilder();
                            j6 = j15;
                            String[] strArr2222 = new String[1];
                            boolean[] zArr2222 = new boolean[1];
                            if (dialogKey2.story) {
                            }
                            Intent intent3222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                            intent3222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                            intent3222.setFlags(67108864);
                            intent3222.addCategory("android.intent.category.LAUNCHER");
                            messageObject3 = messageObject2;
                            if (messageObject2 == null) {
                            }
                            if (messageObject3 == null) {
                            }
                            String str30222 = str5;
                            if (messageObject3 == null) {
                            }
                            str24 = str18;
                            str25 = str4;
                            str26 = str3;
                            dialogKey4 = dialogKey3;
                            if (dialogKey4.story) {
                            }
                            StringBuilder sb52222 = new StringBuilder();
                            sb52222.append("show extra notifications chatId ");
                            sb52222.append(j5);
                            sb52222.append(" topicId ");
                            j10 = j8;
                            sb52222.append(j10);
                            FileLog.d(sb52222.toString());
                            if (j10 != 0) {
                            }
                            intent3222.putExtra("currentAccount", notificationsController.currentAccount);
                            str3 = str26;
                            PendingIntent activity2222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3222, 1140850688);
                            NotificationCompat.WearableExtender wearableExtender2222 = new NotificationCompat.WearableExtender();
                            NotificationCompat.Action action32222 = action;
                            if (action != null) {
                            }
                            String str312222 = str17;
                            Intent intent42222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                            intent42222.addFlags(32);
                            str11 = str25;
                            intent42222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                            intent42222.putExtra(str14, j5);
                            int i302222 = i10;
                            intent42222.putExtra(str10, i302222);
                            intent42222.putExtra("currentAccount", notificationsController.currentAccount);
                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList232222 = arrayList9;
                            NotificationCompat.Action build42222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent42222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                            if (!DialogObject.isEncryptedDialog(j5)) {
                            }
                            if (str27 == null) {
                            }
                            wearableExtender2222.setBridgeTag("tgaccount" + j6);
                            if (!dialogKey4.story) {
                            }
                            String str322222 = str24;
                            NotificationCompat.Builder category2222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str322222).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true).setNumber(!dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList12.size()).setColor(-15618822).setGroupSummary(false).setWhen(j11).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity2222).extend(wearableExtender2222).setSortKey(String.valueOf(Long.MAX_VALUE - j11)).setCategory("msg");
                            intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                            intent.putExtra("messageDate", i8);
                            intent.putExtra("dialogId", j5);
                            intent.putExtra("currentAccount", notificationsController.currentAccount);
                            if (dialogKey4.story) {
                            }
                            if (messageObject3 != null) {
                            }
                            category2222.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160));
                            if (z6) {
                            }
                            if (messageObject3 != null) {
                            }
                            tL_inlineButtonTypeCopy = null;
                            keyboardInlineButton = null;
                            if (keyboardInlineButton != null) {
                            }
                            j12 = dialogKey4.dialogId;
                            if (j12 != UserObject.VERIFY) {
                            }
                            if (arrayList18.size() != 1) {
                            }
                            if (DialogObject.isEncryptedDialog(j5)) {
                            }
                            if (bitmap4 != null) {
                            }
                            if (!AndroidUtilities.needShowPasscode(false)) {
                            }
                            if (chat4 == null) {
                            }
                            user5 = user4;
                            boolean z1622222 = z6;
                            Notification notification422222 = notification2;
                            if (Build.VERSION.SDK_INT >= 26) {
                            }
                            FileLog.d("showExtraNotifications: holders.add " + j5);
                            notification3 = notification422222;
                            z6 = z1622222;
                            long j1722222 = j5;
                            arrayList6 = arrayList18;
                            i9 = i24;
                            longSparseArray6 = longSparseArray7;
                            str7 = str16;
                            str6 = str312222;
                            1NotificationHolder r022222 = notificationsController.new 1NotificationHolder(num2.intValue(), j1722222, dialogKey4.story, j10, str322222, user5, chat4, category2222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                            arrayList5 = arrayList17;
                            arrayList5.add(r022222);
                            notificationsController.wearNotificationsIds.put(j1722222, num2);
                            i21 = i9 + 1;
                            arrayList16 = arrayList5;
                            arrayList14 = arrayList6;
                            size = i7;
                            z4 = z6;
                            z5 = z7;
                            longSparseArray8 = longSparseArray4;
                            str4 = str11;
                            longSparseArray9 = longSparseArray5;
                            str8 = str10;
                            notificationsSettings = sharedPreferences;
                            clientUserId = j6;
                            build2 = notification3;
                            longSparseArray = longSparseArray6;
                        } else {
                            file2 = file;
                            bitmap2 = bitmap;
                            str14 = "dialog_id";
                            user4 = user2;
                            i10 = id;
                            arrayList7 = arrayList4;
                        }
                    }
                    str10 = str8;
                    str15 = string;
                    build = null;
                    num3 = (Integer) notificationsController.pushDialogs.get(j5);
                    if (num3 == null) {
                    }
                    dialogKey2 = dialogKey;
                    if (!dialogKey2.story) {
                    }
                    if (max > 1) {
                    }
                    Person person22 = (Person) longSparseArray.get(j15);
                    if (Build.VERSION.SDK_INT >= 28) {
                        user6 = notificationsController.getMessagesController().getUser(Long.valueOf(j15));
                        if (user6 == null) {
                        }
                        if (user6 != null) {
                        }
                    }
                    j7 = j3;
                    person = person22;
                    if (messageObject == null) {
                    }
                    String str292222 = "";
                    if (person == null) {
                    }
                    messagingStyle = new NotificationCompat.MessagingStyle("");
                    messagingStyle2 = messagingStyle;
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 28) {
                    }
                    messagingStyle2.setConversationTitle(format);
                    messagingStyle2.setGroupConversation(i12 >= 28 || (!z11 && DialogObject.isChatDialog(j5)) || UserObject.isReplyUser(j5));
                    StringBuilder sb42222 = new StringBuilder();
                    j6 = j15;
                    String[] strArr22222 = new String[1];
                    boolean[] zArr22222 = new boolean[1];
                    if (dialogKey2.story) {
                    }
                    Intent intent32222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                    intent32222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    intent32222.setFlags(67108864);
                    intent32222.addCategory("android.intent.category.LAUNCHER");
                    messageObject3 = messageObject2;
                    if (messageObject2 == null) {
                    }
                    if (messageObject3 == null) {
                    }
                    String str302222 = str5;
                    if (messageObject3 == null) {
                    }
                    str24 = str18;
                    str25 = str4;
                    str26 = str3;
                    dialogKey4 = dialogKey3;
                    if (dialogKey4.story) {
                    }
                    StringBuilder sb522222 = new StringBuilder();
                    sb522222.append("show extra notifications chatId ");
                    sb522222.append(j5);
                    sb522222.append(" topicId ");
                    j10 = j8;
                    sb522222.append(j10);
                    FileLog.d(sb522222.toString());
                    if (j10 != 0) {
                    }
                    intent32222.putExtra("currentAccount", notificationsController.currentAccount);
                    str3 = str26;
                    PendingIntent activity22222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32222, 1140850688);
                    NotificationCompat.WearableExtender wearableExtender22222 = new NotificationCompat.WearableExtender();
                    NotificationCompat.Action action322222 = action;
                    if (action != null) {
                    }
                    String str3122222 = str17;
                    Intent intent422222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                    intent422222.addFlags(32);
                    str11 = str25;
                    intent422222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                    intent422222.putExtra(str14, j5);
                    int i3022222 = i10;
                    intent422222.putExtra(str10, i3022222);
                    intent422222.putExtra("currentAccount", notificationsController.currentAccount);
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList2322222 = arrayList9;
                    NotificationCompat.Action build422222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent422222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                    if (!DialogObject.isEncryptedDialog(j5)) {
                    }
                    if (str27 == null) {
                    }
                    wearableExtender22222.setBridgeTag("tgaccount" + j6);
                    if (!dialogKey4.story) {
                    }
                    String str3222222 = str24;
                    NotificationCompat.Builder category22222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str3222222).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true).setNumber(!dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList12.size()).setColor(-15618822).setGroupSummary(false).setWhen(j11).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity22222).extend(wearableExtender22222).setSortKey(String.valueOf(Long.MAX_VALUE - j11)).setCategory("msg");
                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                    intent.putExtra("messageDate", i8);
                    intent.putExtra("dialogId", j5);
                    intent.putExtra("currentAccount", notificationsController.currentAccount);
                    if (dialogKey4.story) {
                    }
                    if (messageObject3 != null) {
                    }
                    category22222.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160));
                    if (z6) {
                    }
                    if (messageObject3 != null) {
                    }
                    tL_inlineButtonTypeCopy = null;
                    keyboardInlineButton = null;
                    if (keyboardInlineButton != null) {
                    }
                    j12 = dialogKey4.dialogId;
                    if (j12 != UserObject.VERIFY) {
                    }
                    if (arrayList18.size() != 1) {
                    }
                    if (DialogObject.isEncryptedDialog(j5)) {
                    }
                    if (bitmap4 != null) {
                    }
                    if (!AndroidUtilities.needShowPasscode(false)) {
                    }
                    if (chat4 == null) {
                    }
                    user5 = user4;
                    boolean z16222222 = z6;
                    Notification notification4222222 = notification2;
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    FileLog.d("showExtraNotifications: holders.add " + j5);
                    notification3 = notification4222222;
                    z6 = z16222222;
                    long j17222222 = j5;
                    arrayList6 = arrayList18;
                    i9 = i24;
                    longSparseArray6 = longSparseArray7;
                    str7 = str16;
                    str6 = str3122222;
                    1NotificationHolder r0222222 = notificationsController.new 1NotificationHolder(num2.intValue(), j17222222, dialogKey4.story, j10, str3222222, user5, chat4, category22222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                    arrayList5 = arrayList17;
                    arrayList5.add(r0222222);
                    notificationsController.wearNotificationsIds.put(j17222222, num2);
                    i21 = i9 + 1;
                    arrayList16 = arrayList5;
                    arrayList14 = arrayList6;
                    size = i7;
                    z4 = z6;
                    z5 = z7;
                    longSparseArray8 = longSparseArray4;
                    str4 = str11;
                    longSparseArray9 = longSparseArray5;
                    str8 = str10;
                    notificationsSettings = sharedPreferences;
                    clientUserId = j6;
                    build2 = notification3;
                    longSparseArray = longSparseArray6;
                }
                LongSparseArray longSparseArray10 = longSparseArray;
                longSparseArray2 = longSparseArray9;
                if (!z4) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("show summary with id " + notificationsController.notificationId);
                    }
                    try {
                        notificationManager.notify(notificationsController.notificationId, notification);
                        arrayList2 = arrayList;
                    } catch (SecurityException e6) {
                        FileLog.e(e6);
                        arrayList2 = arrayList;
                        notificationsController.resetNotificationSound(builder, j, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                    }
                } else {
                    arrayList2 = arrayList;
                    if (notificationsController.openedInBubbleDialogs.isEmpty()) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("cancel summary with id " + notificationsController.notificationId);
                        }
                        notificationManager.cancel(notificationsController.notificationId);
                    }
                }
                i5 = 0;
                while (i5 < longSparseArray2.size()) {
                    LongSparseArray longSparseArray11 = longSparseArray2;
                    if (!notificationsController.openedInBubbleDialogs.contains(Long.valueOf(longSparseArray11.keyAt(i5)))) {
                        Integer num5 = (Integer) longSparseArray11.valueAt(i5);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("cancel notification id " + num5);
                        }
                        notificationManager.cancel(num5.intValue());
                    }
                    i5++;
                    longSparseArray2 = longSparseArray11;
                }
                ArrayList arrayList28 = new ArrayList(arrayList2.size());
                FileLog.d("showExtraNotifications: holders.size()=" + arrayList2.size());
                size2 = arrayList2.size();
                i6 = 0;
                while (i6 < size2) {
                    ArrayList arrayList29 = arrayList2;
                    1NotificationHolder r4 = (1NotificationHolder) arrayList29.get(i6);
                    arrayList28.clear();
                    if (Build.VERSION.SDK_INT < 29 || DialogObject.isEncryptedDialog(r4.dialogId)) {
                        longSparseArray3 = longSparseArray10;
                    } else {
                        NotificationCompat.Builder builder2 = r4.notification;
                        long j20 = r4.dialogId;
                        longSparseArray3 = longSparseArray10;
                        String createNotificationShortcut = notificationsController.createNotificationShortcut(builder2, j20, r4.name, r4.user, r4.chat, (Person) longSparseArray3.get(j20), !r4.story);
                        if (createNotificationShortcut != null) {
                            arrayList28.add(createNotificationShortcut);
                        }
                    }
                    FileLog.d("showExtraNotifications: holders[" + i6 + "].call()");
                    r4.call();
                    if (!unsupportedNotificationShortcut() && !arrayList28.isEmpty()) {
                        ShortcutManagerCompat.removeDynamicShortcuts(ApplicationLoader.applicationContext, arrayList28);
                    }
                    i6++;
                    notificationsController = this;
                    arrayList2 = arrayList29;
                    longSparseArray10 = longSparseArray3;
                }
            }
        }
        z4 = true;
        if (z4) {
            checkOtherNotificationsChannel();
        }
        clientUserId = notificationsController.getUserConfig().getClientUserId();
        if (AndroidUtilities.needShowPasscode()) {
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
        }
        FileLog.d("showExtraNotifications: passcode=" + (SharedConfig.passcodeHash.length() <= 0) + " waitingForPasscode=" + z5 + " selfUserId=" + clientUserId + " useSummaryNotification=" + z4);
        longSparseArray = new LongSparseArray();
        size = arrayList14.size();
        while (true) {
            if (i21 < size) {
            }
            i21 = i9 + 1;
            arrayList16 = arrayList5;
            arrayList14 = arrayList6;
            size = i7;
            z4 = z6;
            z5 = z7;
            longSparseArray8 = longSparseArray4;
            str4 = str11;
            longSparseArray9 = longSparseArray5;
            str8 = str10;
            notificationsSettings = sharedPreferences;
            clientUserId = j6;
            build2 = notification3;
            longSparseArray = longSparseArray6;
        }
        LongSparseArray longSparseArray102 = longSparseArray;
        longSparseArray2 = longSparseArray9;
        if (!z4) {
        }
        i5 = 0;
        while (i5 < longSparseArray2.size()) {
        }
        ArrayList arrayList282 = new ArrayList(arrayList2.size());
        FileLog.d("showExtraNotifications: holders.size()=" + arrayList2.size());
        size2 = arrayList2.size();
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

    public static /* synthetic */ void $r8$lambda$gQghIUHs5ZKeIK8dHwFQ_2pzquE(Uri uri, File file) {
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
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda40
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        imageDecoder.setPostProcessor(new PostProcessor() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda63
                            @Override // android.graphics.PostProcessor
                            public final int onPostProcess(Canvas canvas) {
                                return NotificationsController.$r8$lambda$Z_KcXEDiTLz__0aNAPod1LbZsYY(canvas);
                            }
                        });
                    }
                });
                builder.setIcon(IconCompat.createWithBitmap(decodeBitmap));
            } catch (Throwable unused) {
            }
        }
        return builder;
    }

    public static /* synthetic */ int $r8$lambda$Z_KcXEDiTLz__0aNAPod1LbZsYY(Canvas canvas) {
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
        float f;
        float size;
        float size2;
        float f2;
        float f3;
        float f4;
        float f5;
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
        float f6 = arrayList2.size() == 1 ? 1.0f : arrayList2.size() == 2 ? 0.65f : 0.5f;
        int i2 = 0;
        TextPaint textPaint = null;
        while (i2 < arrayList2.size()) {
            float f7 = dp;
            float f8 = (1.0f - f6) * f7;
            try {
                size = (f8 / arrayList2.size()) * ((arrayList2.size() - 1) - i2);
                size2 = i2 * (f8 / arrayList2.size());
                f2 = f7 * f6;
                f3 = f2 / 2.0f;
                i = dp;
                f4 = size + f3;
                bitmap = createBitmap;
                f5 = size2 + f3;
                f = f6;
                try {
                    canvas.drawCircle(f4, f5, AndroidUtilities.dp(2.0f) + f3, paint3);
                    obj = arrayList2.get(i2);
                    paint = paint3;
                } catch (Throwable unused) {
                    paint = paint3;
                }
            } catch (Throwable unused2) {
                i = dp;
                bitmap = createBitmap;
                paint = paint3;
                f = f6;
            }
            try {
            } catch (Throwable unused3) {
                i2++;
                arrayList2 = arrayList;
                dp = i;
                createBitmap = bitmap;
                f6 = f;
                paint3 = paint;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i2)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(absolutePath, options);
                int i3 = (int) f2;
                options.inSampleSize = StoryEntry.calculateInSampleSize(options, i3, i3);
                try {
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
                } catch (Throwable unused4) {
                }
            } else if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                try {
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f2, new int[]{Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(user.id)]), Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(user.id)])}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawCircle(f4, f5, f3, paint2);
                    if (textPaint == null) {
                        TextPaint textPaint2 = new TextPaint(1);
                        try {
                            textPaint2.setTypeface(AndroidUtilities.bold());
                            textPaint2.setTextSize(f7 * 0.25f);
                            textPaint2.setColor(-1);
                            textPaint = textPaint2;
                        } catch (Throwable unused5) {
                            textPaint = textPaint2;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    AvatarDrawable.getAvatarSymbols(user.first_name, user.last_name, null, sb);
                    String sb2 = sb.toString();
                    try {
                        textPaint.getTextBounds(sb2, 0, sb2.length(), rect);
                        canvas.drawText(sb2, (f4 - (rect.width() / 2.0f)) - rect.left, (f5 - (rect.height() / 2.0f)) - rect.top, textPaint);
                    } catch (Throwable unused6) {
                    }
                } catch (Throwable unused7) {
                }
                i2++;
                arrayList2 = arrayList;
                dp = i;
                createBitmap = bitmap;
                f6 = f;
                paint3 = paint;
            }
            i2++;
            arrayList2 = arrayList;
            dp = i;
            createBitmap = bitmap;
            f6 = f;
            paint3 = paint;
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
                NotificationsController.$r8$lambda$NXeeLudOQpE7Rg_nQ3KbeZD8eoU(NotificationsController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$NXeeLudOQpE7Rg_nQ3KbeZD8eoU(NotificationsController notificationsController) {
        notificationsController.getClass();
        try {
            if (Math.abs(SystemClock.elapsedRealtime() - notificationsController.lastSoundOutPlay) <= 100) {
                return;
            }
            notificationsController.lastSoundOutPlay = SystemClock.elapsedRealtime();
            if (notificationsController.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                notificationsController.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda42
                    @Override // android.media.SoundPool.OnLoadCompleteListener
                    public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                        NotificationsController.$r8$lambda$el0xJHhpeENCEpDJ0w96gt65p0Q(soundPool2, i, i2);
                    }
                });
            }
            if (notificationsController.soundOut == 0 && !notificationsController.soundOutLoaded) {
                notificationsController.soundOutLoaded = true;
                notificationsController.soundOut = notificationsController.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_out, 1);
            }
            int i = notificationsController.soundOut;
            if (i != 0) {
                try {
                    notificationsController.soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static /* synthetic */ void $r8$lambda$el0xJHhpeENCEpDJ0w96gt65p0Q(SoundPool soundPool, int i, int i2) {
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
            getNotificationCenter().postNotificationName(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
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
        } else if (ChatObject.isCommunity(this.currentAccount, j)) {
            TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
            tL_inputNotifyCommunity.community = getMessagesController().getInputChannel(-j);
            updatenotifysettings.peer = tL_inputNotifyCommunity;
        } else {
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(j);
            updatenotifysettings.peer = tL_inputNotifyPeer;
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new RequestDelegate() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda75
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NotificationsController.$r8$lambda$1t1axbSYGQIU_GMVkHn-zrj3Llc(tLObject, tL_error);
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
            getConnectionsManager().sendRequest(setreactionsnotifysettings, new RequestDelegate() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda51
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    NotificationsController.$r8$lambda$H_bZLJEQVx9OdWW6-ZrpVB2xjp0(tLObject, tL_error);
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
        getConnectionsManager().sendRequest(updatenotifysettings, new RequestDelegate() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda50
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NotificationsController.$r8$lambda$TMEsjTkj9lYdR59uaNuAf1n8IoU(tLObject, tL_error);
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
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda74
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$zmMaJZXAIF9S3HhrFAdu8FHaPmA(NotificationsController.this, j, consumer);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$zmMaJZXAIF9S3HhrFAdu8FHaPmA(NotificationsController notificationsController, long j, final Consumer consumer) {
        notificationsController.getClass();
        final HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it = MessagesController.getNotificationsSettings(notificationsController.currentAccount).getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.startsWith(NotificationsSettingsFacade.PROPERTY_NOTIFY + j)) {
                Integer parseInt = Utilities.parseInt((CharSequence) key.replace(NotificationsSettingsFacade.PROPERTY_NOTIFY + j, ""));
                int intValue = parseInt.intValue();
                if (intValue != 0 && notificationsController.getMessagesController().isDialogMuted(j, intValue) != notificationsController.getMessagesController().isDialogMuted(j, 0L)) {
                    hashSet.add(parseInt);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda66
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.$r8$lambda$LakEptqhCv9OhMJsIqb7LZKKyO8(Consumer.this, hashSet);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$LakEptqhCv9OhMJsIqb7LZKKyO8(Consumer consumer, HashSet hashSet) {
        if (consumer != null) {
            consumer.s(hashSet);
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
