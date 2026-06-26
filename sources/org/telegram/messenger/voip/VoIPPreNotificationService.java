package org.telegram.messenger.voip;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.gms.cast.framework.media.internal.zzo$$ExternalSyntheticApiModelOutline2;
import com.google.android.search.verification.client.SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.messenger.voip.VoIPServiceState;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.VoIPPermissionActivity;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public class VoIPPreNotificationService {
    public static State currentState;
    public static TL_phone.PhoneCall pendingCall;
    public static Intent pendingVoIP;
    private static MediaPlayer ringtonePlayer;
    private static final Object sync = new Object();
    private static Vibrator vibrator;

    public static final class State implements VoIPServiceState {
        private final TL_phone.PhoneCall call;
        private final int currentAccount;
        private boolean destroyed;
        private final long userId;

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public /* synthetic */ long getCallDuration() {
            return VoIPServiceState.-CC.$default$getCallDuration(this);
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public TLRPC.GroupCall getGroupCall() {
            return null;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
            return null;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public boolean isConference() {
            return false;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public boolean isOutgoing() {
            return false;
        }

        public State(int i, long j, TL_phone.PhoneCall phoneCall) {
            this.currentAccount = i;
            this.userId = j;
            this.call = phoneCall;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public TLRPC.User getUser() {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.userId));
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public int getCallState() {
            return this.destroyed ? 11 : 15;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public TL_phone.PhoneCall getPrivateCall() {
            return this.call;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public boolean isCallingVideo() {
            TL_phone.PhoneCall phoneCall = this.call;
            if (phoneCall != null) {
                return phoneCall.video;
            }
            return false;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void acceptIncomingCall() {
            VoIPPreNotificationService.answer(ApplicationLoader.applicationContext);
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void declineIncomingCall() {
            VoIPPreNotificationService.decline(ApplicationLoader.applicationContext, 1);
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void stopRinging() {
            VoIPPreNotificationService.stopRinging();
        }

        public void destroy() {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            if (VoIPFragment.getInstance() != null) {
                VoIPFragment.getInstance().onStateChanged(getCallState());
            }
        }
    }

    public static State getState() {
        return currentState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027c  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Notification makeNotification(Context context, int i, long j, long j2, boolean z) {
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        boolean z2;
        int i2;
        int i3;
        int i4;
        String formatName;
        Person.Builder name;
        Icon createWithAdaptiveBitmap;
        Person.Builder icon;
        Person build;
        Notification.CallStyle forIncomingCall;
        int importance;
        Uri sound;
        String id;
        String id2;
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip");
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(LocaleController.getString(z ? R.string.VoipInVideoCallBranding : R.string.VoipInCallBranding)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, action, 301989888));
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        int i5 = globalNotificationsSettings.getInt("calls_notification_channel", 0);
        notificationChannel = notificationManager.getNotificationChannel("incoming_calls2" + i5);
        if (notificationChannel != null) {
            id2 = notificationChannel.getId();
            notificationManager.deleteNotificationChannel(id2);
        }
        notificationChannel2 = notificationManager.getNotificationChannel("incoming_calls3" + i5);
        if (notificationChannel2 != null) {
            id = notificationChannel2.getId();
            notificationManager.deleteNotificationChannel(id);
        }
        notificationChannel3 = notificationManager.getNotificationChannel("incoming_calls4" + i5);
        if (notificationChannel3 != null) {
            importance = notificationChannel3.getImportance();
            if (importance >= 4) {
                sound = notificationChannel3.getSound();
                if (sound == null) {
                    z2 = false;
                    if (z2) {
                        AudioAttributes build2 = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                        SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                        NotificationChannel m = zzo$$ExternalSyntheticApiModelOutline2.m("incoming_calls4" + i5, LocaleController.getString(R.string.IncomingCallsSystemSetting), 4);
                        try {
                            m.setSound(null, build2);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        m.setDescription(LocaleController.getString(R.string.IncomingCallsSystemSettingDescription));
                        m.enableVibration(false);
                        m.enableLights(false);
                        m.setBypassDnd(true);
                        try {
                            notificationManager.createNotificationChannel(m);
                        } catch (Exception e2) {
                            FileLog.e(e2);
                            return null;
                        }
                    }
                    contentIntent.setChannelId("incoming_calls4" + i5);
                    Intent intent = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                    intent.setAction(context.getPackageName() + ".DECLINE_CALL");
                    intent.putExtra("call_id", j2);
                    String string = LocaleController.getString(R.string.VoipDeclineCall);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 24 || i2 >= 31) {
                        i3 = 0;
                    } else {
                        SpannableString spannableString = new SpannableString(string);
                        i3 = 0;
                        spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
                    }
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, i3, intent, 301989888);
                    Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                    intent2.setAction(context.getPackageName() + ".ANSWER_CALL");
                    intent2.putExtra("call_id", j2);
                    String string2 = LocaleController.getString(R.string.VoipAnswerCall);
                    if (i2 >= 24 || i2 >= 31) {
                        i4 = 0;
                    } else {
                        SpannableString spannableString2 = new SpannableString(string2);
                        i4 = 0;
                        spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, i4, new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_answer"), 301989888);
                    contentIntent.setPriority(2);
                    contentIntent.setShowWhen(i4);
                    contentIntent.setColor(-13851168);
                    contentIntent.setVibrate(new long[i4]);
                    contentIntent.setCategory("call");
                    contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i4, action, 33554432), true);
                    if (user != null && !TextUtils.isEmpty(user.phone)) {
                        contentIntent.addPerson("tel:" + user.phone);
                    }
                    Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) VoIPActionsReceiver.class);
                    intent3.setAction(context.getPackageName() + ".HIDE_CALL");
                    contentIntent.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent3, 167772160));
                    Bitmap roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i, user);
                    formatName = ContactsController.formatName(user);
                    if (TextUtils.isEmpty(formatName)) {
                        formatName = "___";
                    }
                    name = VoIPGroupNotification$$ExternalSyntheticApiModelOutline7.m().setName(formatName);
                    createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(roundAvatarBitmap);
                    icon = name.setIcon(createWithAdaptiveBitmap);
                    build = icon.build();
                    forIncomingCall = Notification.CallStyle.forIncomingCall(build, broadcast, activity);
                    contentIntent.setStyle(forIncomingCall);
                    return contentIntent.build();
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("User messed up the notification channel; deleting it and creating a proper one");
            }
            notificationManager.deleteNotificationChannel("incoming_calls4" + i5);
            i5++;
            globalNotificationsSettings.edit().putInt("calls_notification_channel", i5).commit();
        }
        z2 = true;
        if (z2) {
        }
        contentIntent.setChannelId("incoming_calls4" + i5);
        Intent intent4 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent4.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent4.putExtra("call_id", j2);
        String string3 = LocaleController.getString(R.string.VoipDeclineCall);
        i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
        }
        i3 = 0;
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, i3, intent4, 301989888);
        Intent intent22 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent22.setAction(context.getPackageName() + ".ANSWER_CALL");
        intent22.putExtra("call_id", j2);
        String string22 = LocaleController.getString(R.string.VoipAnswerCall);
        if (i2 >= 24) {
        }
        i4 = 0;
        PendingIntent activity2 = PendingIntent.getActivity(context, i4, new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_answer"), 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i4);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i4]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i4, action, 33554432), true);
        if (user != null) {
            contentIntent.addPerson("tel:" + user.phone);
        }
        Intent intent32 = new Intent(ApplicationLoader.applicationContext, (Class<?>) VoIPActionsReceiver.class);
        intent32.setAction(context.getPackageName() + ".HIDE_CALL");
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent32, 167772160));
        Bitmap roundAvatarBitmap2 = VoIPService.getRoundAvatarBitmap(context, i, user);
        formatName = ContactsController.formatName(user);
        if (TextUtils.isEmpty(formatName)) {
        }
        name = VoIPGroupNotification$$ExternalSyntheticApiModelOutline7.m().setName(formatName);
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(roundAvatarBitmap2);
        icon = name.setIcon(createWithAdaptiveBitmap);
        build = icon.build();
        forIncomingCall = Notification.CallStyle.forIncomingCall(build, broadcast2, activity2);
        contentIntent.setStyle(forIncomingCall);
        return contentIntent.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3 A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, Exception -> 0x0080, blocks: (B:13:0x0027, B:15:0x002b, B:17:0x0030, B:19:0x0046, B:22:0x0052, B:24:0x0069, B:26:0x008a, B:28:0x00a8, B:29:0x00dc, B:31:0x00f3, B:35:0x0115, B:37:0x011b, B:39:0x0129, B:42:0x0140, B:43:0x014f, B:50:0x0123, B:52:0x0109, B:54:0x008f, B:56:0x0093, B:58:0x009d, B:59:0x00a3, B:60:0x0082, B:63:0x00d0, B:65:0x00d7, B:66:0x004c), top: B:12:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109 A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, Exception -> 0x0080, blocks: (B:13:0x0027, B:15:0x002b, B:17:0x0030, B:19:0x0046, B:22:0x0052, B:24:0x0069, B:26:0x008a, B:28:0x00a8, B:29:0x00dc, B:31:0x00f3, B:35:0x0115, B:37:0x011b, B:39:0x0129, B:42:0x0140, B:43:0x014f, B:50:0x0123, B:52:0x0109, B:54:0x008f, B:56:0x0093, B:58:0x009d, B:59:0x00a3, B:60:0x0082, B:63:0x00d0, B:65:0x00d7, B:66:0x004c), top: B:12:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void startRinging(Context context, int i, long j) {
        int i2;
        String string;
        Uri parse;
        boolean z;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i);
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        boolean z2 = audioManager.getRingerMode() != 0;
        boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (z2 && ringtonePlayer == null) {
            synchronized (sync) {
                try {
                } catch (Exception e) {
                    FileLog.e(e);
                    MediaPlayer mediaPlayer = ringtonePlayer;
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                        ringtonePlayer = null;
                    }
                } finally {
                }
                if (ringtonePlayer != null) {
                    return;
                }
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                ringtonePlayer = mediaPlayer2;
                mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: org.telegram.messenger.voip.VoIPPreNotificationService$$ExternalSyntheticLambda1
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer3) {
                        VoIPPreNotificationService.lambda$startRinging$0(mediaPlayer3);
                    }
                });
                ringtonePlayer.setLooping(true);
                if (isWiredHeadsetOn) {
                    ringtonePlayer.setAudioStreamType(0);
                } else {
                    ringtonePlayer.setAudioStreamType(2);
                }
                if (notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + j, false)) {
                    string = notificationsSettings.getString("ringtone_path_" + j, null);
                } else {
                    string = notificationsSettings.getString("CallsRingtonePath", null);
                }
                if (string == null) {
                    parse = RingtoneManager.getDefaultUri(1);
                } else {
                    Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                    if (uri != null && string.equalsIgnoreCase(uri.getPath())) {
                        parse = RingtoneManager.getDefaultUri(1);
                    } else {
                        parse = Uri.parse(string);
                        z = false;
                        FileLog.d("start ringtone with " + z + " " + parse);
                        ringtonePlayer.setDataSource(context, parse);
                        ringtonePlayer.prepareAsync();
                        if (!notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + j, false)) {
                            i2 = notificationsSettings.getInt("calls_vibrate_" + j, 0);
                        } else {
                            i2 = notificationsSettings.getInt("vibrate_calls", 0);
                        }
                        if ((i2 != 2 && i2 != 4 && (audioManager.getRingerMode() == 1 || audioManager.getRingerMode() == 2)) || (i2 == 4 && audioManager.getRingerMode() == 1)) {
                            Vibrator vibrator2 = (Vibrator) context.getSystemService("vibrator");
                            vibrator = vibrator2;
                            vibrator2.vibrate(new long[]{0, i2 == 1 ? 350L : i2 == 3 ? 1400L : 700L, 500}, 0);
                        }
                    }
                }
                z = true;
                FileLog.d("start ringtone with " + z + " " + parse);
                ringtonePlayer.setDataSource(context, parse);
                ringtonePlayer.prepareAsync();
                if (!notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + j, false)) {
                }
                if (i2 != 2) {
                    Vibrator vibrator22 = (Vibrator) context.getSystemService("vibrator");
                    vibrator = vibrator22;
                    vibrator22.vibrate(new long[]{0, i2 == 1 ? 350L : i2 == 3 ? 1400L : 700L, 500}, 0);
                }
                Vibrator vibrator222 = (Vibrator) context.getSystemService("vibrator");
                vibrator = vibrator222;
                vibrator222.vibrate(new long[]{0, i2 == 1 ? 350L : i2 == 3 ? 1400L : 700L, 500}, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startRinging$0(MediaPlayer mediaPlayer) {
        try {
            ringtonePlayer.start();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void stopRinging() {
        synchronized (sync) {
            try {
                MediaPlayer mediaPlayer = ringtonePlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    ringtonePlayer.release();
                    ringtonePlayer = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Vibrator vibrator2 = vibrator;
        if (vibrator2 != null) {
            vibrator2.cancel();
            vibrator = null;
        }
    }

    public static void show(final Context context, final Intent intent, final TL_phone.PhoneCall phoneCall) {
        FileLog.d("VoIPPreNotification.show()");
        if (phoneCall == null || intent == null) {
            dismiss(context, false);
            FileLog.d("VoIPPreNotification.show(): call or intent is null");
            return;
        }
        TL_phone.PhoneCall phoneCall2 = pendingCall;
        if (phoneCall2 == null || phoneCall2.id != phoneCall.id) {
            dismiss(context, false);
            pendingVoIP = intent;
            pendingCall = phoneCall;
            final int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
            final long longExtra = intent.getLongExtra("user_id", 0L);
            final boolean z = phoneCall.video;
            currentState = new State(intExtra, longExtra, phoneCall);
            acknowledge(context, intExtra, phoneCall, new Runnable() { // from class: org.telegram.messenger.voip.VoIPPreNotificationService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VoIPPreNotificationService.lambda$show$1(intent, phoneCall, context, intExtra, longExtra, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$1(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i, long j, boolean z) {
        pendingVoIP = intent;
        pendingCall = phoneCall;
        ((NotificationManager) context.getSystemService("notification")).notify(203, makeNotification(context, i, j, phoneCall.id, z));
        startRinging(context, i, j);
    }

    private static void acknowledge(final Context context, int i, TL_phone.PhoneCall phoneCall, final Runnable runnable) {
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("Call " + phoneCall.id + " was discarded before the voip pre notification started, stopping");
            }
            pendingVoIP = null;
            pendingCall = null;
            State state = currentState;
            if (state != null) {
                state.destroy();
                return;
            }
            return;
        }
        if (XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED) && ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
            }
            pendingVoIP = null;
            pendingCall = null;
            State state2 = currentState;
            if (state2 != null) {
                state2.destroy();
                return;
            }
            return;
        }
        TL_phone.receivedCall receivedcall = new TL_phone.receivedCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        receivedcall.peer = tL_inputPhoneCall;
        tL_inputPhoneCall.id = phoneCall.id;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        ConnectionsManager.getInstance(i).sendRequest(receivedcall, new RequestDelegate() { // from class: org.telegram.messenger.voip.VoIPPreNotificationService$$ExternalSyntheticLambda3
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPPreNotificationService.lambda$acknowledge$3(context, runnable, tLObject, tL_error);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$acknowledge$3(final Context context, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VoIPPreNotificationService$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                VoIPPreNotificationService.lambda$acknowledge$2(TLObject.this, tL_error, context, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$acknowledge$2(TLObject tLObject, TLRPC.TL_error tL_error, Context context, Runnable runnable) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.w("(VoIPPreNotification) receivedCall response = " + tLObject);
        }
        if (tL_error == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("error on receivedCall: " + tL_error);
        }
        pendingVoIP = null;
        pendingCall = null;
        State state = currentState;
        if (state != null) {
            state.destroy();
        }
        dismiss(context, false);
    }

    public static boolean open(Context context) {
        if (VoIPService.getSharedInstance() != null) {
            return true;
        }
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            return false;
        }
        intent.getIntExtra("account", UserConfig.selectedAccount);
        pendingVoIP.putExtra("openFragment", true);
        pendingVoIP.putExtra("accept", false);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(pendingVoIP);
        } else {
            context.startService(pendingVoIP);
        }
        pendingVoIP = null;
        dismiss(context, true);
        return true;
    }

    public static boolean isVideo() {
        Intent intent = pendingVoIP;
        return intent != null && intent.getBooleanExtra(MediaStreamTrack.VIDEO_TRACK_KIND, false);
    }

    public static void answer(Context context) {
        FileLog.d("VoIPPreNotification.answer()");
        Intent intent = pendingVoIP;
        if (intent == null) {
            FileLog.d("VoIPPreNotification.answer(): pending intent is not found");
            return;
        }
        currentState = null;
        intent.getIntExtra("account", UserConfig.selectedAccount);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().acceptIncomingCall();
        } else {
            pendingVoIP.putExtra("openFragment", true);
            if (!PermissionRequest.hasPermission("android.permission.RECORD_AUDIO") || (isVideo() && !PermissionRequest.hasPermission("android.permission.CAMERA"))) {
                try {
                    PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) VoIPPermissionActivity.class).addFlags(TLObject.FLAG_28), 1107296256).send();
                    return;
                } catch (Exception e) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("Error starting permission activity", e);
                        return;
                    }
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(pendingVoIP);
            } else {
                context.startService(pendingVoIP);
            }
            pendingVoIP = null;
        }
        dismiss(context, true);
    }

    public static void decline(Context context, int i) {
        FileLog.d("VoIPPreNotification.decline(" + i + ")");
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            FileLog.d("VoIPPreNotification.decline(" + i + "): pending intent or call is not found");
            return;
        }
        final int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
        TL_phone.discardCall discardcall = new TL_phone.discardCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        discardcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = pendingCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.id = phoneCall.id;
        discardcall.duration = 0;
        discardcall.connection_id = 0L;
        if (i == 2) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
        } else if (i == 3) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        } else if (i == 4) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
        } else {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
        }
        FileLog.e("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(intExtra).sendRequest(discardcall, new RequestDelegate() { // from class: org.telegram.messenger.voip.VoIPPreNotificationService$$ExternalSyntheticLambda4
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPPreNotificationService.lambda$decline$4(intExtra, tLObject, tL_error);
            }
        }, 2);
        dismiss(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decline$4(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("(VoIPPreNotification) error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            MessagesController.getInstance(i).processUpdates((TLRPC.TL_updates) tLObject, false);
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("(VoIPPreNotification) phone.discardCall " + tLObject);
        }
    }

    public static void dismiss(Context context, boolean z) {
        FileLog.d("VoIPPreNotification.dismiss()");
        pendingVoIP = null;
        pendingCall = null;
        State state = currentState;
        if (state != null) {
            state.destroy();
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        stopRinging();
        if (z) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            MessagesController.getInstance(i).ignoreSetOnline = false;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VoIPPreNotificationService$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                VoIPPreNotificationService.lambda$dismiss$5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dismiss$5() {
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null && launchActivity.voipLaunchedInBackground && VoIPService.getSharedInstance() == null) {
            launchActivity.voipLaunchedInBackground = false;
            VoIPFragment voIPFragment = VoIPFragment.getInstance();
            if (voIPFragment != null) {
                voIPFragment.finish();
            }
            launchActivity.moveTaskToBack(true);
        }
    }
}
