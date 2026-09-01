package org.telegram.messenger.voip;

import android.app.Activity;
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
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.lb;
import org.telegram.messenger.wb;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ci1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class VoIPGroupNotification {
    public static long currentCallId;
    public static State currentState;
    private static HashSet<Integer> ignoreCalls;
    private static Runnable missRunnable;

    /* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
    public static final class State implements VoIPServiceState {
        public final long call_id;
        private final int currentAccount;
        private boolean destroyed;
        public final long dialogId;
        private final TLRPC.GroupCall groupCall;
        private final TLRPC.InputGroupCall inputGroupCall;
        public final int msg_id;
        private final ArrayList<TLRPC.GroupCallParticipant> participants;
        private final boolean video;

        public State(int i10, long j10, long j11, int i11, boolean z4, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> arrayList) {
            this.currentAccount = i10;
            this.dialogId = j10;
            this.call_id = j11;
            this.msg_id = i11;
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            this.inputGroupCall = tL_inputGroupCallInviteMessage;
            tL_inputGroupCallInviteMessage.msg_id = i11;
            this.groupCall = groupCall;
            this.participants = arrayList;
            this.video = z4;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void acceptIncomingCall() {
            VoIPGroupNotification.answer(ApplicationLoader.applicationContext, this.currentAccount, this.msg_id);
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void declineIncomingCall() {
            VoIPGroupNotification.decline(ApplicationLoader.applicationContext, this.currentAccount, this.msg_id);
        }

        public void destroy() {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            ci1 ci1Var = ci1.k1;
            if (ci1Var != null) {
                ci1Var.onStateChanged(getCallState());
            }
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public final /* synthetic */ long getCallDuration() {
            return w0.a(this);
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public int getCallState() {
            return this.destroyed ? 11 : 15;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public TLRPC.GroupCall getGroupCall() {
            return this.groupCall;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
            return this.participants;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public TL_phone.PhoneCall getPrivateCall() {
            return null;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public TLRPC.User getUser() {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public boolean isCallingVideo() {
            return this.video;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public boolean isConference() {
            return true;
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

    public static void answer(Context context, int i10, int i11) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i11) {
            return;
        }
        TLRPC.GroupCall groupCall = state.groupCall;
        boolean isCallingVideo = currentState.isCallingVideo();
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION);
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = i11;
        g2.h(LaunchActivity.D1, i10, tL_inputGroupCallInviteMessage, isCallingVideo, groupCall, null);
    }

    public static void decline(Context context, int i10, int i11) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION);
        VoIPPreNotificationService.stopRinging();
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = i11;
        ConnectionsManager.getInstance(i10).sendRequest(declineconferencecallinvite, new o(i10, 0));
        ci1 ci1Var = ci1.k1;
        if (ci1Var != null) {
            ci1Var.n();
        }
    }

    public static void hide(Context context) {
        State state = currentState;
        if (state == null) {
            return;
        }
        hide(context, state.currentAccount, currentState.msg_id);
    }

    public static void hideByCallId(Context context, int i10, long j10) {
        State state = currentState;
        if (state != null && state.currentAccount == i10 && currentState.call_id == j10) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION);
            VoIPPreNotificationService.stopRinging();
            ci1 ci1Var = ci1.k1;
            if (ci1Var != null) {
                ci1Var.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decline$3(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i10).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$0(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z4, Context context, String str) {
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (ignoreCalls == null) {
                ignoreCalls = new HashSet<>();
            }
            ignoreCalls.add(Integer.valueOf(i11));
        } else {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i10).putUsers(groupcall.users, false);
            MessagesController.getInstance(i10).putChats(groupcall.chats, false);
            currentState = new State(i10, j10, j11, i11, z4, groupcall.call, groupcall.participants);
            showNotification(context, i10, j11, i11, j10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$1(int i10, long j10, long j11, int i11, boolean z4, Context context, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new lb(tLObject, i10, j10, j11, i11, z4, context, str));
    }

    public static void open(Context context, int i10, int i11) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i11) {
            return;
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION);
        VoIPPreNotificationService.stopRinging();
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        if (findActivity == null) {
            findActivity = LaunchActivity.D1;
        }
        if (findActivity != null) {
            ci1.w(findActivity, i10);
        }
    }

    public static void request(Context context, int i10, long j10, String str, long j11, int i11, boolean z4) {
        if (Build.VERSION.SDK_INT < 26 || currentCallId == j11) {
            return;
        }
        State state = currentState;
        if (state == null || state.call_id != j11) {
            if (VoIPService.getSharedInstance() != null) {
                if (currentState != null) {
                    hide(context);
                }
            } else {
                if (MessagesController.getInstance(i10).callRequestsDisabled) {
                    return;
                }
                HashSet<Integer> hashSet = ignoreCalls;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(i11))) {
                    currentCallId = j11;
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    tL_inputGroupCallInviteMessage.msg_id = i11;
                    getgroupcall.limit = 3;
                    ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new wb(context, i10, j10, str, j11, i11, z4));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void showNotification(Context context, int i10, long j10, int i11, long j11, String str) {
        boolean z4;
        Class cls;
        Intent intent;
        int i12;
        NotificationManager notificationManager;
        int i13;
        int i14;
        String formatName;
        Runnable runnable;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        Intent putExtra = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip").putExtra("group_call_invite_msg_id", i11).putExtra("currentAccount", i10);
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(LocaleController.getString(R.string.VoipGroupInCallBranding)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, putExtra, 301989888));
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        int i15 = globalNotificationsSettings.getInt("calls_notification_channel", 0);
        NotificationChannel notificationChannel = notificationManager2.getNotificationChannel("incoming_calls2" + i15);
        if (notificationChannel != null) {
            notificationManager2.deleteNotificationChannel(notificationChannel.getId());
        }
        NotificationChannel notificationChannel2 = notificationManager2.getNotificationChannel("incoming_calls3" + i15);
        if (notificationChannel2 != null) {
            notificationManager2.deleteNotificationChannel(notificationChannel2.getId());
        }
        NotificationChannel notificationChannel3 = notificationManager2.getNotificationChannel("incoming_calls4" + i15);
        if (notificationChannel3 != null) {
            if (notificationChannel3.getImportance() >= 4 && notificationChannel3.getSound() == null) {
                z4 = false;
                if (z4) {
                    cls = LaunchActivity.class;
                    intent = putExtra;
                } else {
                    AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                    intent = putExtra;
                    cls = LaunchActivity.class;
                    NotificationChannel notificationChannel4 = new NotificationChannel("incoming_calls4" + i15, LocaleController.getString(R.string.IncomingCallsSystemSetting), 4);
                    try {
                        notificationChannel4.setSound(null, build);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    notificationChannel4.setDescription(LocaleController.getString(R.string.IncomingCallsSystemSettingDescription));
                    notificationChannel4.enableVibration(false);
                    notificationChannel4.enableLights(false);
                    notificationChannel4.setBypassDnd(true);
                    try {
                        notificationManager2.createNotificationChannel(notificationChannel4);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                contentIntent.setChannelId("incoming_calls4" + i15);
                Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent2.setAction(context.getPackageName() + ".DECLINE_CALL");
                intent2.putExtra("call_id", j10);
                intent2.putExtra("group_call_invite_msg_id", i11);
                intent2.putExtra("currentAccount", i10);
                String string = LocaleController.getString(R.string.VoipDeclineCall);
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 24 || i12 >= 31) {
                    notificationManager = notificationManager2;
                    i13 = 0;
                } else {
                    SpannableString spannableString = new SpannableString(string);
                    notificationManager = notificationManager2;
                    i13 = 0;
                    spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(context, i13, intent2, 301989888);
                Intent intent3 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent3.setAction(context.getPackageName() + ".ANSWER_CALL");
                intent3.putExtra("call_id", j10);
                intent3.putExtra("group_call_invite_msg_id", i11);
                intent3.putExtra("currentAccount", i10);
                String string2 = LocaleController.getString(R.string.VoipAnswerCall);
                if (i12 >= 24 || i12 >= 31) {
                    i14 = 0;
                } else {
                    SpannableString spannableString2 = new SpannableString(string2);
                    i14 = 0;
                    spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
                }
                PendingIntent activity = PendingIntent.getActivity(context, i14, new Intent(context, (Class<?>) cls).setAction("voip_answer").putExtra("group_call_invite_msg_id", i11).putExtra("currentAccount", i10), 301989888);
                contentIntent.setPriority(2);
                contentIntent.setShowWhen(i14);
                contentIntent.setColor(-13851168);
                contentIntent.setVibrate(new long[i14]);
                contentIntent.setCategory("call");
                contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i14, intent, 33554432), true);
                Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) VoIPActionsReceiver.class);
                intent4.setAction(context.getPackageName() + ".HIDE_CALL");
                intent4.putExtra("group_call_invite_msg_id", i11);
                intent4.putExtra("currentAccount", i10);
                contentIntent.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent4, 167772160));
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j11);
                Bitmap roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i10, userOrChat);
                formatName = TextUtils.isEmpty(str) ? str : ContactsController.formatName(userOrChat);
                if (TextUtils.isEmpty(formatName)) {
                    formatName = "___";
                }
                if (i12 >= 31) {
                    contentIntent.setStyle(Notification.CallStyle.forIncomingCall(new Person.Builder().setName(formatName).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
                }
                notificationManager.notify(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, contentIntent.build());
                VoIPPreNotificationService.startRinging(context, i10, j11);
                runnable = missRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                j3.v vVar = new j3.v(context, i10, i11, 2);
                missRunnable = vVar;
                AndroidUtilities.runOnUIThread(vVar, MessagesController.getInstance(i10).callRingTimeout);
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("User messed up the notification channel; deleting it and creating a proper one");
            }
            notificationManager2.deleteNotificationChannel("incoming_calls4" + i15);
            i15++;
            globalNotificationsSettings.edit().putInt("calls_notification_channel", i15).commit();
        }
        z4 = true;
        if (z4) {
        }
        contentIntent.setChannelId("incoming_calls4" + i15);
        Intent intent22 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent22.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent22.putExtra("call_id", j10);
        intent22.putExtra("group_call_invite_msg_id", i11);
        intent22.putExtra("currentAccount", i10);
        String string3 = LocaleController.getString(R.string.VoipDeclineCall);
        i12 = Build.VERSION.SDK_INT;
        if (i12 >= 24) {
        }
        notificationManager = notificationManager2;
        i13 = 0;
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, i13, intent22, 301989888);
        Intent intent32 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent32.setAction(context.getPackageName() + ".ANSWER_CALL");
        intent32.putExtra("call_id", j10);
        intent32.putExtra("group_call_invite_msg_id", i11);
        intent32.putExtra("currentAccount", i10);
        String string22 = LocaleController.getString(R.string.VoipAnswerCall);
        if (i12 >= 24) {
        }
        i14 = 0;
        PendingIntent activity2 = PendingIntent.getActivity(context, i14, new Intent(context, (Class<?>) cls).setAction("voip_answer").putExtra("group_call_invite_msg_id", i11).putExtra("currentAccount", i10), 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i14);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i14]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i14, intent, 33554432), true);
        Intent intent42 = new Intent(ApplicationLoader.applicationContext, (Class<?>) VoIPActionsReceiver.class);
        intent42.setAction(context.getPackageName() + ".HIDE_CALL");
        intent42.putExtra("group_call_invite_msg_id", i11);
        intent42.putExtra("currentAccount", i10);
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent42, 167772160));
        TLObject userOrChat2 = MessagesController.getInstance(i10).getUserOrChat(j11);
        Bitmap roundAvatarBitmap2 = VoIPService.getRoundAvatarBitmap(context, i10, userOrChat2);
        if (TextUtils.isEmpty(str)) {
        }
        if (TextUtils.isEmpty(formatName)) {
        }
        if (i12 >= 31) {
        }
        notificationManager.notify(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, contentIntent.build());
        VoIPPreNotificationService.startRinging(context, i10, j11);
        runnable = missRunnable;
        if (runnable != null) {
        }
        j3.v vVar2 = new j3.v(context, i10, i11, 2);
        missRunnable = vVar2;
        AndroidUtilities.runOnUIThread(vVar2, MessagesController.getInstance(i10).callRingTimeout);
    }

    public static void hide(Context context, int i10, int i11) {
        State state = currentState;
        if (state != null && state.currentAccount == i10 && currentState.msg_id == i11) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION);
            VoIPPreNotificationService.stopRinging();
            ci1 ci1Var = ci1.k1;
            if (ci1Var != null) {
                ci1Var.n();
            }
        }
    }
}
