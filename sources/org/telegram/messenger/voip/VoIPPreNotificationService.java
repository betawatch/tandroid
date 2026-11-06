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
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import c8.ia;
import hi.g2;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.as;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.telegram.ui.ec1;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class VoIPPreNotificationService {
    public static State currentState;
    public static TL_phone.PhoneCall pendingCall;
    public static Intent pendingVoIP;
    private static MediaPlayer ringtonePlayer;
    private static final Object sync = new Object();
    private static Vibrator vibrator;

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
    public static final class State implements VoIPServiceState {
        private final TL_phone.PhoneCall call;
        private final int currentAccount;
        private boolean destroyed;
        private final long userId;

        public State(int i7, long j3, TL_phone.PhoneCall phoneCall) {
            this.currentAccount = i7;
            this.userId = j3;
            this.call = phoneCall;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void acceptIncomingCall() {
            VoIPPreNotificationService.answer(org.telegram.messenger.t0.b);
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void declineIncomingCall() {
            VoIPPreNotificationService.decline(org.telegram.messenger.t0.b, 1);
        }

        public void destroy() {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            ec1 ec1Var = ec1.l1;
            if (ec1Var != null) {
                ec1Var.onStateChanged(getCallState());
            }
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public final /* synthetic */ long getCallDuration() {
            return t0.a(this);
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
            return qp.s1(this.currentAccount).a2(Long.valueOf(this.userId));
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

    private static void acknowledge(Context context, int i7, TL_phone.PhoneCall phoneCall, Runnable runnable) {
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (r2.a) {
                a8.l("Call " + phoneCall.id + " was discarded before the voip pre notification started, stopping");
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
        if (!as.i() || as.g() || !((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            TL_phone.receivedCall receivedcall = new TL_phone.receivedCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            receivedcall.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.id = phoneCall.id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            ConnectionsManager.getInstance(i7).sendRequest(receivedcall, new bi.j(context, runnable), 2);
            return;
        }
        if (r2.a) {
            a8.d("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
        }
        pendingVoIP = null;
        pendingCall = null;
        State state2 = currentState;
        if (state2 != null) {
            state2.destroy();
        }
    }

    public static void answer(Context context) {
        a8.b("VoIPPreNotification.answer()");
        Intent intent = pendingVoIP;
        if (intent == null) {
            a8.b("VoIPPreNotification.answer(): pending intent is not found");
            return;
        }
        currentState = null;
        intent.getIntExtra("account", p10.s0);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().acceptIncomingCall();
        } else {
            pendingVoIP.putExtra("openFragment", true);
            if (!ia.d("android.permission.RECORD_AUDIO") || (isVideo() && !ia.d("android.permission.CAMERA"))) {
                try {
                    PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) VoIPPermissionActivity.class).addFlags(TLObject.FLAG_28), 1107296256).send();
                    return;
                } catch (Exception e10) {
                    if (r2.a) {
                        a8.e("Error starting permission activity", e10);
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

    public static void decline(Context context, int i7) {
        a8.b("VoIPPreNotification.decline(" + i7 + ")");
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            a8.b("VoIPPreNotification.decline(" + i7 + "): pending intent or call is not found");
            return;
        }
        int intExtra = intent.getIntExtra("account", p10.s0);
        TL_phone.discardCall discardcall = new TL_phone.discardCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        discardcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = pendingCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.id = phoneCall.id;
        discardcall.duration = 0;
        discardcall.connection_id = 0L;
        if (i7 == 2) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
        } else if (i7 == 3) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        } else if (i7 != 4) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
        } else {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
        }
        a8.d("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(intExtra).sendRequest(discardcall, new g2(intExtra, 2), 2);
        dismiss(context, false);
    }

    public static void dismiss(Context context, boolean z9) {
        a8.b("VoIPPreNotification.dismiss()");
        pendingVoIP = null;
        pendingCall = null;
        State state = currentState;
        if (state != null) {
            state.destroy();
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        stopRinging();
        if (z9) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            qp.s1(i7).g7 = false;
        }
        org.telegram.messenger.g0.h3(new i(2));
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
        if (r2.a) {
            a8.l("(VoIPPreNotification) receivedCall response = " + tLObject);
        }
        if (tL_error == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (r2.a) {
            a8.d("error on receivedCall: " + tL_error);
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
        org.telegram.messenger.g0.h3(new l(tLObject, tL_error, context, runnable, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decline$4(int i7, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (r2.a) {
                a8.d("(VoIPPreNotification) error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            qp.s1(i7).O3((TLRPC.TL_updates) tLObject, false);
        }
        if (r2.a) {
            a8.b("(VoIPPreNotification) phone.discardCall " + tLObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$dismiss$5() {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && launchActivity.g1 && VoIPService.getSharedInstance() == null) {
            launchActivity.g1 = false;
            ec1 ec1Var = ec1.l1;
            if (ec1Var != null) {
                ec1Var.e();
            }
            launchActivity.moveTaskToBack(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$1(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i7, long j3, boolean z9) {
        pendingVoIP = intent;
        pendingCall = phoneCall;
        ((NotificationManager) context.getSystemService("notification")).notify(203, makeNotification(context, i7, j3, phoneCall.id, z9));
        startRinging(context, i7, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$startRinging$0(MediaPlayer mediaPlayer) {
        try {
            ringtonePlayer.start();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0273  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Notification makeNotification(Context context, int i7, long j3, long j10, boolean z9) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        String p10;
        boolean z11;
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip");
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(hd.M0(z9 ? 2131743298 : 2131743301, null)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, action, 301989888));
        SharedPreferences f12 = qp.f1();
        int i13 = f12.getInt("calls_notification_channel", 0);
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("incoming_calls2" + i13);
        if (notificationChannel != null) {
            notificationManager.deleteNotificationChannel(notificationChannel.getId());
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("incoming_calls3" + i13);
        if (notificationChannel2 != null) {
            notificationManager.deleteNotificationChannel(notificationChannel2.getId());
        }
        NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel("incoming_calls4" + i13);
        if (notificationChannel3 != null) {
            if (notificationChannel3.getImportance() >= 4 && notificationChannel3.getSound() == null) {
                z10 = false;
                if (z10) {
                    AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                    NotificationChannel notificationChannel4 = new NotificationChannel("incoming_calls4" + i13, hd.M0(2131749202, null), 4);
                    try {
                        notificationChannel4.setSound(null, build);
                        z11 = true;
                    } catch (Exception e10) {
                        z11 = true;
                        a8.g(e10, true);
                    }
                    notificationChannel4.setDescription(hd.M0(2131749201, null));
                    notificationChannel4.enableVibration(false);
                    notificationChannel4.enableLights(false);
                    notificationChannel4.setBypassDnd(z11);
                    try {
                        notificationManager.createNotificationChannel(notificationChannel4);
                    } catch (Exception e11) {
                        a8.g(e11, z11);
                        return null;
                    }
                }
                contentIntent.setChannelId("incoming_calls4" + i13);
                Intent intent = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent.setAction(context.getPackageName() + ".DECLINE_CALL");
                intent.putExtra("call_id", j10);
                String M0 = hd.M0(2131743419, null);
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24 || i10 >= 31) {
                    i11 = 0;
                } else {
                    SpannableString spannableString = new SpannableString(M0);
                    i11 = 0;
                    spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(context, i11, intent, 301989888);
                Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent2.setAction(context.getPackageName() + ".ANSWER_CALL");
                intent2.putExtra("call_id", j10);
                String M02 = hd.M0(2131743505, null);
                if (i10 >= 24 || i10 >= 31) {
                    i12 = 0;
                } else {
                    SpannableString spannableString2 = new SpannableString(M02);
                    i12 = 0;
                    spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
                }
                PendingIntent activity = PendingIntent.getActivity(context, i12, new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_answer").putExtra("voip_answer_token", LaunchActivity.B1), 301989888);
                contentIntent.setPriority(2);
                contentIntent.setShowWhen(i12);
                contentIntent.setColor(-13851168);
                contentIntent.setVibrate(new long[i12]);
                contentIntent.setCategory("call");
                contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i12, action, 33554432), true);
                if (a22 != null && !TextUtils.isEmpty(a22.phone)) {
                    contentIntent.addPerson("tel:" + a22.phone);
                }
                Intent intent3 = new Intent(org.telegram.messenger.t0.b, (Class<?>) VoIPActionsReceiver.class);
                intent3.setAction(context.getPackageName() + ".HIDE_CALL");
                contentIntent.setDeleteIntent(PendingIntent.getBroadcast(org.telegram.messenger.t0.b, 0, intent3, 167772160));
                Bitmap roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i7, a22);
                p10 = g5.p(a22);
                if (TextUtils.isEmpty(p10)) {
                    p10 = "___";
                }
                contentIntent.setStyle(Notification.CallStyle.forIncomingCall(new Person.Builder().setName(p10).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
                return contentIntent.build();
            }
            if (r2.a) {
                a8.b("User messed up the notification channel; deleting it and creating a proper one");
            }
            notificationManager.deleteNotificationChannel("incoming_calls4" + i13);
            i13++;
            f12.edit().putInt("calls_notification_channel", i13).commit();
        }
        z10 = true;
        if (z10) {
        }
        contentIntent.setChannelId("incoming_calls4" + i13);
        Intent intent4 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent4.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent4.putExtra("call_id", j10);
        String M03 = hd.M0(2131743419, null);
        i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
        }
        i11 = 0;
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, i11, intent4, 301989888);
        Intent intent22 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent22.setAction(context.getPackageName() + ".ANSWER_CALL");
        intent22.putExtra("call_id", j10);
        String M022 = hd.M0(2131743505, null);
        if (i10 >= 24) {
        }
        i12 = 0;
        PendingIntent activity2 = PendingIntent.getActivity(context, i12, new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_answer").putExtra("voip_answer_token", LaunchActivity.B1), 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i12);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i12]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i12, action, 33554432), true);
        if (a22 != null) {
            contentIntent.addPerson("tel:" + a22.phone);
        }
        Intent intent32 = new Intent(org.telegram.messenger.t0.b, (Class<?>) VoIPActionsReceiver.class);
        intent32.setAction(context.getPackageName() + ".HIDE_CALL");
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(org.telegram.messenger.t0.b, 0, intent32, 167772160));
        Bitmap roundAvatarBitmap2 = VoIPService.getRoundAvatarBitmap(context, i7, a22);
        p10 = g5.p(a22);
        if (TextUtils.isEmpty(p10)) {
        }
        contentIntent.setStyle(Notification.CallStyle.forIncomingCall(new Person.Builder().setName(p10).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap2)).build(), broadcast2, activity2));
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
        intent.getIntExtra("account", p10.s0);
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

    public static void show(Context context, Intent intent, TL_phone.PhoneCall phoneCall) {
        a8.b("VoIPPreNotification.show()");
        if (phoneCall == null || intent == null) {
            dismiss(context, false);
            a8.b("VoIPPreNotification.show(): call or intent is null");
            return;
        }
        TL_phone.PhoneCall phoneCall2 = pendingCall;
        if (phoneCall2 == null || phoneCall2.id != phoneCall.id) {
            dismiss(context, false);
            pendingVoIP = intent;
            pendingCall = phoneCall;
            int intExtra = intent.getIntExtra("account", p10.s0);
            long longExtra = intent.getLongExtra("user_id", 0L);
            boolean z9 = phoneCall.video;
            currentState = new State(intExtra, longExtra, phoneCall);
            acknowledge(context, intExtra, phoneCall, new ni.b(intent, phoneCall, context, intExtra, longExtra, z9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, Exception -> 0x0081, blocks: (B:11:0x0032, B:13:0x0036, B:16:0x003b, B:18:0x0052, B:21:0x005e, B:23:0x0070, B:25:0x008b, B:27:0x00a9, B:28:0x00d7, B:30:0x00e9, B:34:0x0105, B:36:0x010b, B:38:0x0119, B:41:0x0130, B:43:0x0142, B:44:0x0160, B:47:0x015b, B:52:0x0113, B:54:0x00fa, B:56:0x0091, B:58:0x0095, B:60:0x009f, B:61:0x00a4, B:62:0x0083, B:65:0x00cb, B:67:0x00d2, B:68:0x0058), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, Exception -> 0x0081, blocks: (B:11:0x0032, B:13:0x0036, B:16:0x003b, B:18:0x0052, B:21:0x005e, B:23:0x0070, B:25:0x008b, B:27:0x00a9, B:28:0x00d7, B:30:0x00e9, B:34:0x0105, B:36:0x010b, B:38:0x0119, B:41:0x0130, B:43:0x0142, B:44:0x0160, B:47:0x015b, B:52:0x0113, B:54:0x00fa, B:56:0x0091, B:58:0x0095, B:60:0x009f, B:61:0x00a4, B:62:0x0083, B:65:0x00cb, B:67:0x00d2, B:68:0x0058), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, Exception -> 0x0081, blocks: (B:11:0x0032, B:13:0x0036, B:16:0x003b, B:18:0x0052, B:21:0x005e, B:23:0x0070, B:25:0x008b, B:27:0x00a9, B:28:0x00d7, B:30:0x00e9, B:34:0x0105, B:36:0x010b, B:38:0x0119, B:41:0x0130, B:43:0x0142, B:44:0x0160, B:47:0x015b, B:52:0x0113, B:54:0x00fa, B:56:0x0091, B:58:0x0095, B:60:0x009f, B:61:0x00a4, B:62:0x0083, B:65:0x00cb, B:67:0x00d2, B:68:0x0058), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, Exception -> 0x0081, blocks: (B:11:0x0032, B:13:0x0036, B:16:0x003b, B:18:0x0052, B:21:0x005e, B:23:0x0070, B:25:0x008b, B:27:0x00a9, B:28:0x00d7, B:30:0x00e9, B:34:0x0105, B:36:0x010b, B:38:0x0119, B:41:0x0130, B:43:0x0142, B:44:0x0160, B:47:0x015b, B:52:0x0113, B:54:0x00fa, B:56:0x0091, B:58:0x0095, B:60:0x009f, B:61:0x00a4, B:62:0x0083, B:65:0x00cb, B:67:0x00d2, B:68:0x0058), top: B:10:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void startRinging(Context context, int i7, long j3) {
        int i10;
        String string;
        Uri parse;
        boolean z9;
        SharedPreferences sharedPreferences = qp.s1(i7).d7;
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        boolean z10 = audioManager.getRingerMode() != 0;
        boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (z10 && ringtonePlayer == null) {
            synchronized (sync) {
                try {
                } catch (Exception e10) {
                    a8.g(e10, true);
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
                mediaPlayer2.setOnPreparedListener(new p());
                ringtonePlayer.setLooping(true);
                if (isWiredHeadsetOn) {
                    ringtonePlayer.setAudioStreamType(0);
                } else {
                    ringtonePlayer.setAudioStreamType(2);
                }
                if (sharedPreferences.getBoolean("custom_" + j3, false)) {
                    string = sharedPreferences.getString("ringtone_path_" + j3, null);
                } else {
                    string = sharedPreferences.getString("CallsRingtonePath", null);
                }
                if (string == null) {
                    parse = RingtoneManager.getDefaultUri(1);
                } else {
                    Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                    if (uri == null || !string.equalsIgnoreCase(uri.getPath())) {
                        parse = Uri.parse(string);
                        z9 = false;
                        a8.b("start ringtone with " + z9 + " " + parse);
                        ringtonePlayer.setDataSource(context, parse);
                        ringtonePlayer.prepareAsync();
                        if (sharedPreferences.getBoolean("custom_" + j3, false)) {
                            i10 = sharedPreferences.getInt("vibrate_calls", 0);
                        } else {
                            i10 = sharedPreferences.getInt("calls_vibrate_" + j3, 0);
                        }
                        if ((i10 != 2 && i10 != 4 && (audioManager.getRingerMode() == 1 || audioManager.getRingerMode() == 2)) || (i10 == 4 && audioManager.getRingerMode() == 1)) {
                            vibrator = (Vibrator) context.getSystemService("vibrator");
                            long[] jArr = {0, i10 == 1 ? 350L : i10 == 3 ? 1400L : 700L, 500};
                            if (Build.VERSION.SDK_INT >= 33) {
                                vibrator.vibrate(VibrationEffect.createWaveform(jArr, 0), new VibrationAttributes.Builder().setUsage(33).build());
                            } else {
                                vibrator.vibrate(jArr, 0);
                            }
                        }
                    }
                    parse = RingtoneManager.getDefaultUri(1);
                }
                z9 = true;
                a8.b("start ringtone with " + z9 + " " + parse);
                ringtonePlayer.setDataSource(context, parse);
                ringtonePlayer.prepareAsync();
                if (sharedPreferences.getBoolean("custom_" + j3, false)) {
                }
                if (i10 != 2) {
                    vibrator = (Vibrator) context.getSystemService("vibrator");
                    long[] jArr2 = {0, i10 == 1 ? 350L : i10 == 3 ? 1400L : 700L, 500};
                    if (Build.VERSION.SDK_INT >= 33) {
                    }
                }
                vibrator = (Vibrator) context.getSystemService("vibrator");
                long[] jArr22 = {0, i10 == 1 ? 350L : i10 == 3 ? 1400L : 700L, 500};
                if (Build.VERSION.SDK_INT >= 33) {
                }
            }
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Vibrator vibrator2 = vibrator;
        if (vibrator2 != null) {
            vibrator2.cancel();
            vibrator = null;
        }
    }
}
