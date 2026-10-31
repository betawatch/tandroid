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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bo;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i5;
import org.telegram.messenger.tn;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.be1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class VoIPGroupNotification {
    public static long currentCallId;
    public static State currentState;
    private static HashSet<Integer> ignoreCalls;
    private static Runnable missRunnable;

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

        public State(int i10, long j10, long j11, int i11, boolean z10, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> arrayList) {
            this.currentAccount = i10;
            this.dialogId = j10;
            this.call_id = j11;
            this.msg_id = i11;
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            this.inputGroupCall = tL_inputGroupCallInviteMessage;
            tL_inputGroupCallInviteMessage.msg_id = i11;
            this.groupCall = groupCall;
            this.participants = arrayList;
            this.video = z10;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void acceptIncomingCall() {
            VoIPGroupNotification.answer(org.telegram.messenger.w0.b, this.currentAccount, this.msg_id);
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void declineIncomingCall() {
            VoIPGroupNotification.decline(org.telegram.messenger.w0.b, this.currentAccount, this.msg_id);
        }

        public void destroy() {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            be1 be1Var = be1.n1;
            if (be1Var != null) {
                be1Var.onStateChanged(getCallState());
            }
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public final /* synthetic */ long getCallDuration() {
            return z0.a(this);
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
            return vp.r1(this.currentAccount).Z1(Long.valueOf(this.dialogId));
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
            org.telegram.messenger.i0.r(runnable);
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
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = i11;
        m1.g(LaunchActivity.I1, i10, tL_inputGroupCallInviteMessage, isCallingVideo, groupCall, null);
    }

    public static void decline(Context context, int i10, int i11) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = i11;
        ConnectionsManager.getInstance(i10).sendRequest(declineconferencecallinvite, new q(i10, 0));
        be1 be1Var = be1.n1;
        if (be1Var != null) {
            be1Var.f();
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
                org.telegram.messenger.i0.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            be1 be1Var = be1.n1;
            if (be1Var != null) {
                be1Var.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decline$3(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            vp.r1(i10).L3((TLRPC.Updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$0(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (ignoreCalls == null) {
                ignoreCalls = new HashSet<>();
            }
            ignoreCalls.add(Integer.valueOf(i11));
        } else {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            vp.r1(i10).V3(groupcall.users, false);
            vp.r1(i10).P3(groupcall.chats, false);
            currentState = new State(i10, j10, j11, i11, z10, groupcall.call, groupcall.participants);
            showNotification(context, i10, j11, i11, j10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$1(int i10, long j10, long j11, int i11, boolean z10, Context context, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new bo(tLObject, i10, j10, j11, i11, z10, context, str));
    }

    public static void open(Context context, int i10, int i11) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i11) {
            return;
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        Activity W = org.telegram.messenger.i0.W(org.telegram.messenger.w0.b);
        if (W == null) {
            W = LaunchActivity.I1;
        }
        if (W != null) {
            be1.v(W, i10);
        }
    }

    public static void request(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
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
                if (vp.r1(i10).R6) {
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
                    ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new tn(context, i10, j10, str, j11, i11, z10));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void showNotification(Context context, int i10, long j10, int i11, long j11, String str) {
        boolean z10;
        Class cls;
        Intent intent;
        int i12;
        NotificationManager notificationManager;
        int i13;
        int i14;
        String o10;
        Runnable runnable;
        boolean z11;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        Intent putExtra = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip").putExtra("group_call_invite_msg_id", i11).putExtra("currentAccount", i10);
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(cd.L0(2131743403, null)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, putExtra, 301989888));
        SharedPreferences e12 = vp.e1();
        int i15 = e12.getInt("calls_notification_channel", 0);
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
                z10 = false;
                if (z10) {
                    cls = LaunchActivity.class;
                    intent = putExtra;
                } else {
                    AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                    intent = putExtra;
                    cls = LaunchActivity.class;
                    NotificationChannel notificationChannel4 = new NotificationChannel("incoming_calls4" + i15, cd.L0(2131749212, null), 4);
                    try {
                        notificationChannel4.setSound(null, build);
                        z11 = true;
                    } catch (Exception e) {
                        z11 = true;
                        f8.g(e, true);
                    }
                    notificationChannel4.setDescription(cd.L0(2131749211, null));
                    notificationChannel4.enableVibration(false);
                    notificationChannel4.enableLights(false);
                    notificationChannel4.setBypassDnd(z11);
                    try {
                        notificationManager2.createNotificationChannel(notificationChannel4);
                    } catch (Exception e7) {
                        f8.g(e7, z11);
                    }
                }
                contentIntent.setChannelId("incoming_calls4" + i15);
                Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent2.setAction(context.getPackageName() + ".DECLINE_CALL");
                intent2.putExtra("call_id", j10);
                intent2.putExtra("group_call_invite_msg_id", i11);
                intent2.putExtra("currentAccount", i10);
                String L0 = cd.L0(2131743444, null);
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 24 || i12 >= 31) {
                    notificationManager = notificationManager2;
                    i13 = 0;
                } else {
                    SpannableString spannableString = new SpannableString(L0);
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
                String L02 = cd.L0(2131743530, null);
                if (i12 >= 24 || i12 >= 31) {
                    i14 = 0;
                } else {
                    SpannableString spannableString2 = new SpannableString(L02);
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
                Intent intent4 = new Intent(org.telegram.messenger.w0.b, (Class<?>) VoIPActionsReceiver.class);
                intent4.setAction(context.getPackageName() + ".HIDE_CALL");
                intent4.putExtra("group_call_invite_msg_id", i11);
                intent4.putExtra("currentAccount", i10);
                contentIntent.setDeleteIntent(PendingIntent.getBroadcast(org.telegram.messenger.w0.b, 0, intent4, 167772160));
                TLObject d22 = vp.r1(i10).d2(j11);
                Bitmap roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i10, d22);
                o10 = TextUtils.isEmpty(str) ? str : i5.o(d22);
                if (TextUtils.isEmpty(o10)) {
                    o10 = "___";
                }
                if (i12 >= 31) {
                    contentIntent.setStyle(Notification.CallStyle.forIncomingCall(new Person.Builder().setName(o10).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
                }
                notificationManager.notify(203, contentIntent.build());
                VoIPPreNotificationService.startRinging(context, i10, j11);
                runnable = missRunnable;
                if (runnable != null) {
                    org.telegram.messenger.i0.r(runnable);
                }
                i2.u uVar = new i2.u(context, i10, i11, 5);
                missRunnable = uVar;
                org.telegram.messenger.i0.h3(uVar, vp.r1(i10).h3);
            }
            if (v2.a) {
                f8.b("User messed up the notification channel; deleting it and creating a proper one");
            }
            notificationManager2.deleteNotificationChannel("incoming_calls4" + i15);
            i15++;
            e12.edit().putInt("calls_notification_channel", i15).commit();
        }
        z10 = true;
        if (z10) {
        }
        contentIntent.setChannelId("incoming_calls4" + i15);
        Intent intent22 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent22.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent22.putExtra("call_id", j10);
        intent22.putExtra("group_call_invite_msg_id", i11);
        intent22.putExtra("currentAccount", i10);
        String L03 = cd.L0(2131743444, null);
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
        String L022 = cd.L0(2131743530, null);
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
        Intent intent42 = new Intent(org.telegram.messenger.w0.b, (Class<?>) VoIPActionsReceiver.class);
        intent42.setAction(context.getPackageName() + ".HIDE_CALL");
        intent42.putExtra("group_call_invite_msg_id", i11);
        intent42.putExtra("currentAccount", i10);
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(org.telegram.messenger.w0.b, 0, intent42, 167772160));
        TLObject d222 = vp.r1(i10).d2(j11);
        Bitmap roundAvatarBitmap2 = VoIPService.getRoundAvatarBitmap(context, i10, d222);
        if (TextUtils.isEmpty(str)) {
        }
        if (TextUtils.isEmpty(o10)) {
        }
        if (i12 >= 31) {
        }
        notificationManager.notify(203, contentIntent.build());
        VoIPPreNotificationService.startRinging(context, i10, j11);
        runnable = missRunnable;
        if (runnable != null) {
        }
        i2.u uVar2 = new i2.u(context, i10, i11, 5);
        missRunnable = uVar2;
        org.telegram.messenger.i0.h3(uVar2, vp.r1(i10).h3);
    }

    public static void hide(Context context, int i10, int i11) {
        State state = currentState;
        if (state != null && state.currentAccount == i10 && currentState.msg_id == i11) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            be1 be1Var = be1.n1;
            if (be1Var != null) {
                be1Var.f();
            }
        }
    }
}
