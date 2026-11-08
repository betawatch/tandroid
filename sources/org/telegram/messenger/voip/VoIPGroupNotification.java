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
import hi.g2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.on;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.messenger.xn;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.y1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class VoIPGroupNotification {
    public static long currentCallId;
    public static State currentState;
    private static HashSet<Integer> ignoreCalls;
    private static Runnable missRunnable;

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

        public State(int i7, long j3, long j10, int i10, boolean z9, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> arrayList) {
            this.currentAccount = i7;
            this.dialogId = j3;
            this.call_id = j10;
            this.msg_id = i10;
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            this.inputGroupCall = tL_inputGroupCallInviteMessage;
            tL_inputGroupCallInviteMessage.msg_id = i10;
            this.groupCall = groupCall;
            this.participants = arrayList;
            this.video = z9;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void acceptIncomingCall() {
            VoIPGroupNotification.answer(org.telegram.messenger.t0.b, this.currentAccount, this.msg_id);
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void declineIncomingCall() {
            VoIPGroupNotification.decline(org.telegram.messenger.t0.b, this.currentAccount, this.msg_id);
        }

        public void destroy() {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            fc1 fc1Var = fc1.l1;
            if (fc1Var != null) {
                fc1Var.onStateChanged(getCallState());
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
            return qp.s1(this.currentAccount).a2(Long.valueOf(this.dialogId));
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

    public static void answer(Context context, int i7, int i10) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i10) {
            return;
        }
        TLRPC.GroupCall groupCall = state.groupCall;
        boolean isCallingVideo = currentState.isCallingVideo();
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = i10;
        y1.g(LaunchActivity.G1, i7, tL_inputGroupCallInviteMessage, isCallingVideo, groupCall, null);
    }

    public static void decline(Context context, int i7, int i10) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = i10;
        ConnectionsManager.getInstance(i7).sendRequest(declineconferencecallinvite, new g2(i7, 1));
        fc1 fc1Var = fc1.l1;
        if (fc1Var != null) {
            fc1Var.e();
        }
    }

    public static void hide(Context context) {
        State state = currentState;
        if (state == null) {
            return;
        }
        hide(context, state.currentAccount, currentState.msg_id);
    }

    public static void hideByCallId(Context context, int i7, long j3) {
        State state = currentState;
        if (state != null && state.currentAccount == i7 && currentState.call_id == j3) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            fc1 fc1Var = fc1.l1;
            if (fc1Var != null) {
                fc1Var.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decline$3(int i7, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            qp.s1(i7).O3((TLRPC.Updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$0(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z9, Context context, String str) {
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (ignoreCalls == null) {
                ignoreCalls = new HashSet<>();
            }
            ignoreCalls.add(Integer.valueOf(i10));
        } else {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            qp.s1(i7).Y3(groupcall.users, false);
            qp.s1(i7).S3(groupcall.chats, false);
            currentState = new State(i7, j3, j10, i10, z9, groupcall.call, groupcall.participants);
            showNotification(context, i7, j10, i10, j3, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$1(int i7, long j3, long j10, int i10, boolean z9, Context context, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new xn(tLObject, i7, j3, j10, i10, z9, context, str));
    }

    public static void open(Context context, int i7, int i10) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i10) {
            return;
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        if (W == null) {
            W = LaunchActivity.G1;
        }
        if (W != null) {
            fc1.n(W, i7);
        }
    }

    public static void request(Context context, int i7, long j3, String str, long j10, int i10, boolean z9) {
        if (Build.VERSION.SDK_INT < 26 || currentCallId == j10) {
            return;
        }
        State state = currentState;
        if (state == null || state.call_id != j10) {
            if (VoIPService.getSharedInstance() != null) {
                if (currentState != null) {
                    hide(context);
                }
            } else {
                if (qp.s1(i7).Q6) {
                    return;
                }
                HashSet<Integer> hashSet = ignoreCalls;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(i10))) {
                    currentCallId = j10;
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    tL_inputGroupCallInviteMessage.msg_id = i10;
                    getgroupcall.limit = 3;
                    ConnectionsManager.getInstance(i7).sendRequest(getgroupcall, new on(context, i7, j3, str, j10, i10, z9));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void showNotification(Context context, int i7, long j3, int i10, long j10, String str) {
        boolean z9;
        Class cls;
        Intent intent;
        int i11;
        NotificationManager notificationManager;
        int i12;
        String M0;
        String o4;
        Runnable runnable;
        boolean z10;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        Intent putExtra = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip").putExtra("group_call_invite_msg_id", i10).putExtra("currentAccount", i7);
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(id.M0(2131743380, null)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, putExtra, 301989888));
        SharedPreferences f12 = qp.f1();
        int i13 = f12.getInt("calls_notification_channel", 0);
        NotificationChannel notificationChannel = notificationManager2.getNotificationChannel("incoming_calls2" + i13);
        if (notificationChannel != null) {
            notificationManager2.deleteNotificationChannel(notificationChannel.getId());
        }
        NotificationChannel notificationChannel2 = notificationManager2.getNotificationChannel("incoming_calls3" + i13);
        if (notificationChannel2 != null) {
            notificationManager2.deleteNotificationChannel(notificationChannel2.getId());
        }
        NotificationChannel notificationChannel3 = notificationManager2.getNotificationChannel("incoming_calls4" + i13);
        if (notificationChannel3 != null) {
            if (notificationChannel3.getImportance() >= 4 && notificationChannel3.getSound() == null) {
                z9 = false;
                if (z9) {
                    cls = LaunchActivity.class;
                    intent = putExtra;
                } else {
                    AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                    intent = putExtra;
                    cls = LaunchActivity.class;
                    NotificationChannel notificationChannel4 = new NotificationChannel("incoming_calls4" + i13, id.M0(2131749204, null), 4);
                    try {
                        notificationChannel4.setSound(null, build);
                        z10 = true;
                    } catch (Exception e10) {
                        z10 = true;
                        a8.g(e10, true);
                    }
                    notificationChannel4.setDescription(id.M0(2131749203, null));
                    notificationChannel4.enableVibration(false);
                    notificationChannel4.enableLights(false);
                    notificationChannel4.setBypassDnd(z10);
                    try {
                        notificationManager2.createNotificationChannel(notificationChannel4);
                    } catch (Exception e11) {
                        a8.g(e11, z10);
                    }
                }
                contentIntent.setChannelId("incoming_calls4" + i13);
                Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent2.setAction(context.getPackageName() + ".DECLINE_CALL");
                intent2.putExtra("call_id", j3);
                intent2.putExtra("group_call_invite_msg_id", i10);
                intent2.putExtra("currentAccount", i7);
                String M02 = id.M0(2131743421, null);
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 24 || i11 >= 31) {
                    notificationManager = notificationManager2;
                    i12 = 0;
                } else {
                    SpannableString spannableString = new SpannableString(M02);
                    notificationManager = notificationManager2;
                    i12 = 0;
                    spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(context, i12, intent2, 301989888);
                Intent intent3 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent3.setAction(context.getPackageName() + ".ANSWER_CALL");
                intent3.putExtra("call_id", j3);
                intent3.putExtra("group_call_invite_msg_id", i10);
                intent3.putExtra("currentAccount", i7);
                M0 = id.M0(2131743507, null);
                if (i11 >= 24 && i11 < 31) {
                    SpannableString spannableString2 = new SpannableString(M0);
                    spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
                }
                PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) cls).setAction("voip_answer").putExtra("voip_answer_token", LaunchActivity.B1).putExtra("group_call_invite_msg_id", i10).putExtra("currentAccount", i7), 301989888);
                contentIntent.setPriority(2);
                contentIntent.setShowWhen(false);
                contentIntent.setColor(-13851168);
                contentIntent.setVibrate(new long[0]);
                contentIntent.setCategory("call");
                contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, 0, intent, 33554432), true);
                Intent intent4 = new Intent(org.telegram.messenger.t0.b, (Class<?>) VoIPActionsReceiver.class);
                intent4.setAction(context.getPackageName() + ".HIDE_CALL");
                intent4.putExtra("group_call_invite_msg_id", i10);
                intent4.putExtra("currentAccount", i7);
                contentIntent.setDeleteIntent(PendingIntent.getBroadcast(org.telegram.messenger.t0.b, 0, intent4, 167772160));
                TLObject e22 = qp.s1(i7).e2(j10);
                Bitmap roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i7, e22);
                o4 = TextUtils.isEmpty(str) ? str : g5.o(e22);
                if (TextUtils.isEmpty(o4)) {
                    o4 = "___";
                }
                if (i11 >= 31) {
                    contentIntent.setStyle(Notification.CallStyle.forIncomingCall(new Person.Builder().setName(o4).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
                }
                notificationManager.notify(203, contentIntent.build());
                VoIPPreNotificationService.startRinging(context, i7, j10);
                runnable = missRunnable;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                jg.r rVar = new jg.r(context, i7, i10, 6);
                missRunnable = rVar;
                org.telegram.messenger.g0.i3(rVar, qp.s1(i7).h3);
            }
            if (r2.a) {
                a8.b("User messed up the notification channel; deleting it and creating a proper one");
            }
            notificationManager2.deleteNotificationChannel("incoming_calls4" + i13);
            i13++;
            f12.edit().putInt("calls_notification_channel", i13).commit();
        }
        z9 = true;
        if (z9) {
        }
        contentIntent.setChannelId("incoming_calls4" + i13);
        Intent intent22 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent22.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent22.putExtra("call_id", j3);
        intent22.putExtra("group_call_invite_msg_id", i10);
        intent22.putExtra("currentAccount", i7);
        String M022 = id.M0(2131743421, null);
        i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
        }
        notificationManager = notificationManager2;
        i12 = 0;
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, i12, intent22, 301989888);
        Intent intent32 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent32.setAction(context.getPackageName() + ".ANSWER_CALL");
        intent32.putExtra("call_id", j3);
        intent32.putExtra("group_call_invite_msg_id", i10);
        intent32.putExtra("currentAccount", i7);
        M0 = id.M0(2131743507, null);
        if (i11 >= 24) {
            SpannableString spannableString22 = new SpannableString(M0);
            spannableString22.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString22.length(), 0);
        }
        PendingIntent activity2 = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) cls).setAction("voip_answer").putExtra("voip_answer_token", LaunchActivity.B1).putExtra("group_call_invite_msg_id", i10).putExtra("currentAccount", i7), 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(false);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[0]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, 0, intent, 33554432), true);
        Intent intent42 = new Intent(org.telegram.messenger.t0.b, (Class<?>) VoIPActionsReceiver.class);
        intent42.setAction(context.getPackageName() + ".HIDE_CALL");
        intent42.putExtra("group_call_invite_msg_id", i10);
        intent42.putExtra("currentAccount", i7);
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(org.telegram.messenger.t0.b, 0, intent42, 167772160));
        TLObject e222 = qp.s1(i7).e2(j10);
        Bitmap roundAvatarBitmap2 = VoIPService.getRoundAvatarBitmap(context, i7, e222);
        if (TextUtils.isEmpty(str)) {
        }
        if (TextUtils.isEmpty(o4)) {
        }
        if (i11 >= 31) {
        }
        notificationManager.notify(203, contentIntent.build());
        VoIPPreNotificationService.startRinging(context, i7, j10);
        runnable = missRunnable;
        if (runnable != null) {
        }
        jg.r rVar2 = new jg.r(context, i7, i10, 6);
        missRunnable = rVar2;
        org.telegram.messenger.g0.i3(rVar2, qp.s1(i7).h3);
    }

    public static void hide(Context context, int i7, int i10) {
        State state = currentState;
        if (state != null && state.currentAccount == i7 && currentState.msg_id == i10) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            fc1 fc1Var = fc1.l1;
            if (fc1Var != null) {
                fc1Var.e();
            }
        }
    }
}
