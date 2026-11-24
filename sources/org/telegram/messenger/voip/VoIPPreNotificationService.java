package org.telegram.messenger.voip;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
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
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class VoIPPreNotificationService {
    public static State currentState;
    public static TL_phone.PhoneCall pendingCall;
    public static Intent pendingVoIP;
    private static MediaPlayer ringtonePlayer;
    private static final Object sync = new Object();
    private static Vibrator vibrator;

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    public static final class State implements VoIPServiceState {
        private final TL_phone.PhoneCall call;
        private final int currentAccount;
        private boolean destroyed;
        private final long userId;

        public State(int i, long j, TL_phone.PhoneCall phoneCall) {
            this.currentAccount = i;
            this.userId = j;
            this.call = phoneCall;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void acceptIncomingCall() {
            VoIPPreNotificationService.answer(org.telegram.messenger.a.b);
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void declineIncomingCall() {
            VoIPPreNotificationService.decline(org.telegram.messenger.a.b, 1);
        }

        public void destroy() {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            hgc hgcVar = hgc.m1;
            if (hgcVar != null) {
                hgcVar.onStateChanged(getCallState());
            }
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public final long getCallDuration() {
            return 0L;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public int getCallState() {
            return this.destroyed ? 11 : 15;
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
        public TL_phone.PhoneCall getPrivateCall() {
            return this.call;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public TLRPC.User getUser() {
            return na7.q1(this.currentAccount).V1(Long.valueOf(this.userId));
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
        public boolean isConference() {
            return false;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public boolean isOutgoing() {
            return false;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void stopRinging() {
            VoIPPreNotificationService.stopRinging();
        }
    }

    private static void acknowledge(Context context, int i, TL_phone.PhoneCall phoneCall, Runnable runnable) {
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (w01.a) {
                fa4.l("Call " + phoneCall.id + " was discarded before the voip pre notification started, stopping");
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
        if (!nye.b() || nye.a() || !((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            TL_phone.receivedCall receivedcall = new TL_phone.receivedCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            receivedcall.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.id = phoneCall.id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            ConnectionsManager.getInstance(i).sendRequest(receivedcall, new apa(context, runnable, (byte) 22), 2);
            return;
        }
        if (w01.a) {
            fa4.d("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
        }
        pendingVoIP = null;
        pendingCall = null;
        State state2 = currentState;
        if (state2 != null) {
            state2.destroy();
        }
    }

    public static void answer(Context context) {
        fa4.b("VoIPPreNotification.answer()");
        Intent intent = pendingVoIP;
        if (intent == null) {
            fa4.b("VoIPPreNotification.answer(): pending intent is not found");
            return;
        }
        currentState = null;
        intent.getIntExtra("account", y6c.t0);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().acceptIncomingCall();
        } else {
            pendingVoIP.putExtra("openFragment", true);
            if (!rqe.d("android.permission.RECORD_AUDIO") || (isVideo() && !rqe.d("android.permission.CAMERA"))) {
                try {
                    PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) VoIPPermissionActivity.class).addFlags(TLObject.FLAG_28), 1107296256).send();
                    return;
                } catch (Exception e) {
                    if (w01.a) {
                        fa4.e("Error starting permission activity", e);
                        return;
                    }
                    return;
                }
            }
            int i = Build.VERSION.SDK_INT;
            Intent intent2 = pendingVoIP;
            if (i >= 26) {
                context.startForegroundService(intent2);
            } else {
                context.startService(intent2);
            }
            pendingVoIP = null;
        }
        dismiss(context, true);
    }

    public static void decline(Context context, int i) {
        fa4.b("VoIPPreNotification.decline(" + i + ")");
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            fa4.b("VoIPPreNotification.decline(" + i + "): pending intent or call is not found");
            return;
        }
        int intExtra = intent.getIntExtra("account", y6c.t0);
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
        } else if (i != 4) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
        } else {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
        }
        fa4.d("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(intExtra).sendRequest(discardcall, new vv0(intExtra, (byte) 6), 2);
        dismiss(context, false);
    }

    public static void dismiss(Context context, boolean z) {
        fa4.b("VoIPPreNotification.dismiss()");
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
            na7.q1(i).Z3 = false;
        }
        gl.d3(new cza((byte) 9));
    }

    public static State getState() {
        return currentState;
    }

    public static boolean isVideo() {
        Intent intent = pendingVoIP;
        return intent != null && intent.getBooleanExtra(MediaStreamTrack.VIDEO_TRACK_KIND, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$acknowledge$2(TLObject tLObject, TLRPC.TL_error tL_error, Context context, Runnable runnable) {
        if (w01.a) {
            fa4.l("(VoIPPreNotification) receivedCall response = " + tLObject);
        }
        if (tL_error == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (w01.a) {
            fa4.d("error on receivedCall: " + tL_error);
        }
        pendingVoIP = null;
        pendingCall = null;
        State state = currentState;
        if (state != null) {
            state.destroy();
        }
        dismiss(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$acknowledge$3(Context context, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new exa((Object) tLObject, (Object) tL_error, (Object) context, (Object) runnable, (byte) 23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decline$4(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (w01.a) {
                fa4.d("(VoIPPreNotification) error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            na7.q1(i).Q3((TLRPC.TL_updates) tLObject, false);
        }
        if (w01.a) {
            fa4.b("(VoIPPreNotification) phone.discardCall " + tLObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$dismiss$5() {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.h1 && VoIPService.getSharedInstance() == null) {
            launchActivity.h1 = false;
            hgc hgcVar = hgc.m1;
            if (hgcVar != null) {
                hgcVar.d();
            }
            launchActivity.moveTaskToBack(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$1(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i, long j, boolean z) {
        pendingVoIP = intent;
        pendingCall = phoneCall;
        ((NotificationManager) context.getSystemService("notification")).notify(203, makeNotification(context, i, j, phoneCall.id, z));
        startRinging(context, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$startRinging$0(MediaPlayer mediaPlayer) {
        try {
            ringtonePlayer.start();
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026b  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Notification makeNotification(Context context, int i, long j, long j2, boolean z) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        String p;
        boolean z3;
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip");
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(k96.M0(z ? 2131743055 : 2131743058, null)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, action, 301989888));
        SharedPreferences d1 = na7.d1();
        int i5 = d1.getInt("calls_notification_channel", 0);
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("incoming_calls2" + i5);
        if (notificationChannel != null) {
            notificationManager.deleteNotificationChannel(notificationChannel.getId());
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("incoming_calls3" + i5);
        if (notificationChannel2 != null) {
            notificationManager.deleteNotificationChannel(notificationChannel2.getId());
        }
        NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel("incoming_calls4" + i5);
        if (notificationChannel3 != null) {
            if (notificationChannel3.getImportance() >= 4 && notificationChannel3.getSound() == null) {
                z2 = false;
                if (z2) {
                    AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                    fk.g();
                    NotificationChannel notificationChannel4 = new NotificationChannel(de9.k(i5, "incoming_calls4"), k96.M0(2131749011, null), 4);
                    try {
                        notificationChannel4.setSound(null, build);
                        z3 = true;
                    } catch (Exception e) {
                        z3 = true;
                        fa4.g(e, true);
                    }
                    notificationChannel4.setDescription(k96.M0(2131749010, null));
                    notificationChannel4.enableVibration(false);
                    notificationChannel4.enableLights(false);
                    notificationChannel4.setBypassDnd(z3);
                    try {
                        notificationManager.createNotificationChannel(notificationChannel4);
                    } catch (Exception e2) {
                        fa4.g(e2, z3);
                        return null;
                    }
                }
                contentIntent.setChannelId("incoming_calls4" + i5);
                Intent intent = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent.setAction(context.getPackageName() + ".DECLINE_CALL");
                intent.putExtra("call_id", j2);
                String M0 = k96.M0(2131743176, null);
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 24 || i2 >= 31) {
                    i3 = 0;
                } else {
                    SpannableString spannableString = new SpannableString(M0);
                    i3 = 0;
                    spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(context, i3, intent, 301989888);
                Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent2.setAction(context.getPackageName() + ".ANSWER_CALL");
                intent2.putExtra("call_id", j2);
                String M02 = k96.M0(2131743262, null);
                if (i2 >= 24 || i2 >= 31) {
                    i4 = 0;
                } else {
                    SpannableString spannableString2 = new SpannableString(M02);
                    i4 = 0;
                    spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
                }
                PendingIntent activity = PendingIntent.getActivity(context, i4, new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_answer").putExtra("voip_answer_token", LaunchActivity.C1), 301989888);
                contentIntent.setPriority(2);
                contentIntent.setShowWhen(i4);
                contentIntent.setColor(-13851168);
                contentIntent.setVibrate(new long[i4]);
                contentIntent.setCategory("call");
                contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i4, action, 33554432), true);
                if (V1 != null && !TextUtils.isEmpty(V1.phone)) {
                    contentIntent.addPerson("tel:" + V1.phone);
                }
                Intent intent3 = new Intent(org.telegram.messenger.a.b, (Class<?>) VoIPActionsReceiver.class);
                intent3.setAction(context.getPackageName() + ".HIDE_CALL");
                contentIntent.setDeleteIntent(PendingIntent.getBroadcast(org.telegram.messenger.a.b, 0, intent3, 167772160));
                Bitmap roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i, V1);
                p = qu2.p(V1);
                if (TextUtils.isEmpty(p)) {
                    p = "___";
                }
                contentIntent.setStyle(Notification.CallStyle.forIncomingCall(h15.a().setName(p).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
                return contentIntent.build();
            }
            if (w01.a) {
                fa4.b("User messed up the notification channel; deleting it and creating a proper one");
            }
            notificationManager.deleteNotificationChannel("incoming_calls4" + i5);
            i5++;
            d1.edit().putInt("calls_notification_channel", i5).commit();
        }
        z2 = true;
        if (z2) {
        }
        contentIntent.setChannelId("incoming_calls4" + i5);
        Intent intent4 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent4.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent4.putExtra("call_id", j2);
        String M03 = k96.M0(2131743176, null);
        i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
        }
        i3 = 0;
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, i3, intent4, 301989888);
        Intent intent22 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent22.setAction(context.getPackageName() + ".ANSWER_CALL");
        intent22.putExtra("call_id", j2);
        String M022 = k96.M0(2131743262, null);
        if (i2 >= 24) {
        }
        i4 = 0;
        PendingIntent activity2 = PendingIntent.getActivity(context, i4, new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_answer").putExtra("voip_answer_token", LaunchActivity.C1), 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i4);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i4]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i4, action, 33554432), true);
        if (V1 != null) {
            contentIntent.addPerson("tel:" + V1.phone);
        }
        Intent intent32 = new Intent(org.telegram.messenger.a.b, (Class<?>) VoIPActionsReceiver.class);
        intent32.setAction(context.getPackageName() + ".HIDE_CALL");
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(org.telegram.messenger.a.b, 0, intent32, 167772160));
        Bitmap roundAvatarBitmap2 = VoIPService.getRoundAvatarBitmap(context, i, V1);
        p = qu2.p(V1);
        if (TextUtils.isEmpty(p)) {
        }
        contentIntent.setStyle(Notification.CallStyle.forIncomingCall(h15.a().setName(p).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap2)).build(), broadcast2, activity2));
        return contentIntent.build();
    }

    public static boolean open(Context context) {
        if (VoIPService.getSharedInstance() != null) {
            return true;
        }
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            return false;
        }
        intent.getIntExtra("account", y6c.t0);
        pendingVoIP.putExtra("openFragment", true);
        pendingVoIP.putExtra("accept", false);
        int i = Build.VERSION.SDK_INT;
        Intent intent2 = pendingVoIP;
        if (i >= 26) {
            context.startForegroundService(intent2);
        } else {
            context.startService(intent2);
        }
        pendingVoIP = null;
        dismiss(context, true);
        return true;
    }

    public static void show(Context context, Intent intent, TL_phone.PhoneCall phoneCall) {
        fa4.b("VoIPPreNotification.show()");
        if (phoneCall == null || intent == null) {
            dismiss(context, false);
            fa4.b("VoIPPreNotification.show(): call or intent is null");
            return;
        }
        TL_phone.PhoneCall phoneCall2 = pendingCall;
        if (phoneCall2 == null || phoneCall2.id != phoneCall.id) {
            dismiss(context, false);
            pendingVoIP = intent;
            pendingCall = phoneCall;
            int intExtra = intent.getIntExtra("account", y6c.t0);
            long longExtra = intent.getLongExtra("user_id", 0L);
            boolean z = phoneCall.video;
            currentState = new State(intExtra, longExtra, phoneCall);
            acknowledge(context, intExtra, phoneCall, new gj2(intent, phoneCall, context, intExtra, longExtra, z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1 A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:11:0x0030, B:13:0x0034, B:16:0x0036, B:18:0x004f, B:21:0x0057, B:23:0x0069, B:25:0x0082, B:27:0x00a0, B:28:0x00cf, B:30:0x00e1, B:34:0x00fd, B:36:0x0103, B:38:0x0111, B:41:0x0128, B:43:0x013c, B:44:0x0156, B:47:0x0153, B:52:0x010b, B:54:0x00f2, B:56:0x0087, B:58:0x008b, B:60:0x0095, B:61:0x009b, B:62:0x007a, B:64:0x00c3, B:66:0x00ca, B:67:0x0053), top: B:10:0x0030, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:11:0x0030, B:13:0x0034, B:16:0x0036, B:18:0x004f, B:21:0x0057, B:23:0x0069, B:25:0x0082, B:27:0x00a0, B:28:0x00cf, B:30:0x00e1, B:34:0x00fd, B:36:0x0103, B:38:0x0111, B:41:0x0128, B:43:0x013c, B:44:0x0156, B:47:0x0153, B:52:0x010b, B:54:0x00f2, B:56:0x0087, B:58:0x008b, B:60:0x0095, B:61:0x009b, B:62:0x007a, B:64:0x00c3, B:66:0x00ca, B:67:0x0053), top: B:10:0x0030, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153 A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:11:0x0030, B:13:0x0034, B:16:0x0036, B:18:0x004f, B:21:0x0057, B:23:0x0069, B:25:0x0082, B:27:0x00a0, B:28:0x00cf, B:30:0x00e1, B:34:0x00fd, B:36:0x0103, B:38:0x0111, B:41:0x0128, B:43:0x013c, B:44:0x0156, B:47:0x0153, B:52:0x010b, B:54:0x00f2, B:56:0x0087, B:58:0x008b, B:60:0x0095, B:61:0x009b, B:62:0x007a, B:64:0x00c3, B:66:0x00ca, B:67:0x0053), top: B:10:0x0030, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2 A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:11:0x0030, B:13:0x0034, B:16:0x0036, B:18:0x004f, B:21:0x0057, B:23:0x0069, B:25:0x0082, B:27:0x00a0, B:28:0x00cf, B:30:0x00e1, B:34:0x00fd, B:36:0x0103, B:38:0x0111, B:41:0x0128, B:43:0x013c, B:44:0x0156, B:47:0x0153, B:52:0x010b, B:54:0x00f2, B:56:0x0087, B:58:0x008b, B:60:0x0095, B:61:0x009b, B:62:0x007a, B:64:0x00c3, B:66:0x00ca, B:67:0x0053), top: B:10:0x0030, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void startRinging(Context context, int i, long j) {
        int i2;
        int i3;
        String string;
        Uri parse;
        boolean z;
        SharedPreferences sharedPreferences = na7.q1(i).W3;
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        boolean z2 = audioManager.getRingerMode() != 0;
        boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (z2 && ringtonePlayer == null) {
            synchronized (sync) {
                if (ringtonePlayer != null) {
                    return;
                }
                MediaPlayer mediaPlayer = new MediaPlayer();
                ringtonePlayer = mediaPlayer;
                mediaPlayer.setOnPreparedListener(new zgc());
                ringtonePlayer.setLooping(true);
                MediaPlayer mediaPlayer2 = ringtonePlayer;
                if (isWiredHeadsetOn) {
                    mediaPlayer2.setAudioStreamType(0);
                } else {
                    mediaPlayer2.setAudioStreamType(2);
                }
                try {
                    if (sharedPreferences.getBoolean("custom_" + j, false)) {
                        string = sharedPreferences.getString("ringtone_path_" + j, null);
                    } else {
                        string = sharedPreferences.getString("CallsRingtonePath", null);
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    MediaPlayer mediaPlayer3 = ringtonePlayer;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.release();
                        ringtonePlayer = null;
                    }
                }
                if (string == null) {
                    parse = RingtoneManager.getDefaultUri(1);
                } else {
                    Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                    if (uri == null || !string.equalsIgnoreCase(uri.getPath())) {
                        parse = Uri.parse(string);
                        z = false;
                        fa4.b("start ringtone with " + z + " " + parse);
                        ringtonePlayer.setDataSource(context, parse);
                        ringtonePlayer.prepareAsync();
                        if (sharedPreferences.getBoolean("custom_" + j, false)) {
                            i2 = sharedPreferences.getInt("vibrate_calls", 0);
                        } else {
                            i2 = sharedPreferences.getInt("calls_vibrate_" + j, 0);
                        }
                        if ((i2 != 2 && i2 != 4 && (audioManager.getRingerMode() == 1 || audioManager.getRingerMode() == 2)) || (i2 == 4 && audioManager.getRingerMode() == 1)) {
                            vibrator = (Vibrator) context.getSystemService("vibrator");
                            long[] jArr = {0, i2 == 1 ? 350L : i2 == 3 ? 1400L : 700L, 500};
                            i3 = Build.VERSION.SDK_INT;
                            Vibrator vibrator2 = vibrator;
                            if (i3 >= 33) {
                                vibrator2.vibrate(VibrationEffect.createWaveform(jArr, 0), new VibrationAttributes.Builder().setUsage(33).build());
                            } else {
                                vibrator2.vibrate(jArr, 0);
                            }
                        }
                    }
                    parse = RingtoneManager.getDefaultUri(1);
                }
                z = true;
                fa4.b("start ringtone with " + z + " " + parse);
                ringtonePlayer.setDataSource(context, parse);
                ringtonePlayer.prepareAsync();
                if (sharedPreferences.getBoolean("custom_" + j, false)) {
                }
                if (i2 != 2) {
                    vibrator = (Vibrator) context.getSystemService("vibrator");
                    long[] jArr2 = {0, i2 == 1 ? 350L : i2 == 3 ? 1400L : 700L, 500};
                    i3 = Build.VERSION.SDK_INT;
                    Vibrator vibrator22 = vibrator;
                    if (i3 >= 33) {
                    }
                }
                vibrator = (Vibrator) context.getSystemService("vibrator");
                long[] jArr22 = {0, i2 == 1 ? 350L : i2 == 3 ? 1400L : 700L, 500};
                i3 = Build.VERSION.SDK_INT;
                Vibrator vibrator222 = vibrator;
                if (i3 >= 33) {
                }
            }
        }
    }

    public static void stopRinging() {
        synchronized (sync) {
            MediaPlayer mediaPlayer = ringtonePlayer;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                ringtonePlayer.release();
                ringtonePlayer = null;
            }
        }
        Vibrator vibrator2 = vibrator;
        if (vibrator2 != null) {
            vibrator2.cancel();
            vibrator = null;
        }
    }
}
