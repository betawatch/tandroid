package org.telegram.messenger.voip;

import android.app.Activity;
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
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class VoIPGroupNotification {
    public static long currentCallId;
    public static State currentState;
    private static HashSet<Integer> ignoreCalls;
    private static Runnable missRunnable;

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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

        public State(int i, long j, long j2, int i2, boolean z, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> arrayList) {
            this.currentAccount = i;
            this.dialogId = j;
            this.call_id = j2;
            this.msg_id = i2;
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            this.inputGroupCall = tL_inputGroupCallInviteMessage;
            tL_inputGroupCallInviteMessage.msg_id = i2;
            this.groupCall = groupCall;
            this.participants = arrayList;
            this.video = z;
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void acceptIncomingCall() {
            VoIPGroupNotification.answer(org.telegram.messenger.a.b, this.currentAccount, this.msg_id);
        }

        @Override // org.telegram.messenger.voip.VoIPServiceState
        public void declineIncomingCall() {
            VoIPGroupNotification.decline(org.telegram.messenger.a.b, this.currentAccount, this.msg_id);
        }

        public void destroy() {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            mkc mkcVar = mkc.m1;
            if (mkcVar != null) {
                mkcVar.onStateChanged(getCallState());
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
            return uc7.s1(this.currentAccount).X1(Long.valueOf(this.dialogId));
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

    public static void answer(Context context, int i, int i2) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            hl.r(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i2) {
            return;
        }
        TLRPC.GroupCall groupCall = state.groupCall;
        boolean isCallingVideo = currentState.isCallingVideo();
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = i2;
        xkc.g(LaunchActivity.H1, i, tL_inputGroupCallInviteMessage, isCallingVideo, groupCall, null);
    }

    public static void decline(Context context, int i, int i2) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            hl.r(runnable);
        }
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = i2;
        ConnectionsManager.getInstance(i).sendRequest(declineconferencecallinvite, new fw0(i, (byte) 5));
        mkc mkcVar = mkc.m1;
        if (mkcVar != null) {
            mkcVar.d();
        }
    }

    public static void hide(Context context, int i, int i2) {
        State state = currentState;
        if (state != null && state.currentAccount == i && currentState.msg_id == i2) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                hl.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            mkc mkcVar = mkc.m1;
            if (mkcVar != null) {
                mkcVar.d();
            }
        }
    }

    public static void hideByCallId(Context context, int i, long j) {
        State state = currentState;
        if (state != null && state.currentAccount == i && currentState.call_id == j) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                hl.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            mkc mkcVar = mkc.m1;
            if (mkcVar != null) {
                mkcVar.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decline$3(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            uc7.s1(i).Y3((TLRPC.Updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$0(TLObject tLObject, int i, long j, long j2, int i2, boolean z, Context context, String str) {
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            uc7.s1(i).j4(groupcall.users, false);
            uc7.s1(i).c4(groupcall.chats, false);
            currentState = new State(i, j, j2, i2, z, groupcall.call, groupcall.participants);
            showNotification(context, i, j2, i2, j, str);
            return;
        }
        HashSet<Integer> hashSet = ignoreCalls;
        if (hashSet == null) {
            hashSet = new HashSet<>();
            ignoreCalls = hashSet;
        }
        hashSet.add(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$request$1(int i, long j, long j2, int i2, boolean z, Context context, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new jb7(tLObject, i, j, j2, i2, z, context, str));
    }

    public static void open(Context context, int i, int i2) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            hl.r(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i2) {
            return;
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        Activity W = hl.W(org.telegram.messenger.a.b);
        if (W == null) {
            W = LaunchActivity.H1;
        }
        if (W != null) {
            mkc.n(W, i);
        }
    }

    public static void request(Context context, int i, long j, String str, long j2, int i2, boolean z) {
        if (Build.VERSION.SDK_INT < 26 || currentCallId == j2) {
            return;
        }
        State state = currentState;
        if (state == null || state.call_id != j2) {
            if (VoIPService.getSharedInstance() != null) {
                if (currentState != null) {
                    hide(context);
                }
            } else {
                if (uc7.s1(i).k4.O2.f) {
                    return;
                }
                HashSet<Integer> hashSet = ignoreCalls;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(i2))) {
                    currentCallId = j2;
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    tL_inputGroupCallInviteMessage.msg_id = i2;
                    getgroupcall.limit = 3;
                    ConnectionsManager.getInstance(i).sendRequest(getgroupcall, new bb7(context, i, j, str, j2, i2, z));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void showNotification(Context context, int i, long j, int i2, long j2, String str) {
        boolean z;
        Class cls;
        Intent intent;
        int i3;
        NotificationManager notificationManager;
        int i4;
        String M0;
        String o;
        Runnable runnable;
        boolean z2;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        Intent putExtra = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip").putExtra("group_call_invite_msg_id", i2).putExtra("currentAccount", i);
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(ob6.M0(2131743029, null)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, putExtra, 301989888));
        SharedPreferences f1 = uc7.f1();
        int i5 = f1.getInt("calls_notification_channel", 0);
        NotificationChannel notificationChannel = notificationManager2.getNotificationChannel("incoming_calls2" + i5);
        if (notificationChannel != null) {
            notificationManager2.deleteNotificationChannel(notificationChannel.getId());
        }
        NotificationChannel notificationChannel2 = notificationManager2.getNotificationChannel("incoming_calls3" + i5);
        if (notificationChannel2 != null) {
            notificationManager2.deleteNotificationChannel(notificationChannel2.getId());
        }
        NotificationChannel notificationChannel3 = notificationManager2.getNotificationChannel("incoming_calls4" + i5);
        if (notificationChannel3 != null) {
            if (notificationChannel3.getImportance() >= 4 && notificationChannel3.getSound() == null) {
                z = false;
                if (z) {
                    cls = LaunchActivity.class;
                    intent = putExtra;
                } else {
                    AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                    gk.g();
                    intent = putExtra;
                    cls = LaunchActivity.class;
                    NotificationChannel notificationChannel4 = new NotificationChannel(uh9.k(i5, "incoming_calls4"), ob6.M0(2131748957, null), 4);
                    try {
                        notificationChannel4.setSound(null, build);
                        z2 = true;
                    } catch (Exception e) {
                        z2 = true;
                        cc4.g(e, true);
                    }
                    notificationChannel4.setDescription(ob6.M0(2131748956, null));
                    notificationChannel4.enableVibration(false);
                    notificationChannel4.enableLights(false);
                    notificationChannel4.setBypassDnd(z2);
                    try {
                        notificationManager2.createNotificationChannel(notificationChannel4);
                    } catch (Exception e2) {
                        cc4.g(e2, z2);
                    }
                }
                contentIntent.setChannelId("incoming_calls4" + i5);
                Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent2.setAction(context.getPackageName() + ".DECLINE_CALL");
                intent2.putExtra("call_id", j);
                intent2.putExtra("group_call_invite_msg_id", i2);
                intent2.putExtra("currentAccount", i);
                String M02 = ob6.M0(2131743070, null);
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 24 || i3 >= 31) {
                    notificationManager = notificationManager2;
                    i4 = 0;
                } else {
                    SpannableString spannableString = new SpannableString(M02);
                    notificationManager = notificationManager2;
                    i4 = 0;
                    spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(context, i4, intent2, 301989888);
                Intent intent3 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
                intent3.setAction(context.getPackageName() + ".ANSWER_CALL");
                intent3.putExtra("call_id", j);
                intent3.putExtra("group_call_invite_msg_id", i2);
                intent3.putExtra("currentAccount", i);
                M0 = ob6.M0(2131743156, null);
                if (i3 >= 24 && i3 < 31) {
                    SpannableString spannableString2 = new SpannableString(M0);
                    spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
                }
                PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) cls).setAction("voip_answer").putExtra("voip_answer_token", LaunchActivity.C1).putExtra("group_call_invite_msg_id", i2).putExtra("currentAccount", i), 301989888);
                contentIntent.setPriority(2);
                contentIntent.setShowWhen(false);
                contentIntent.setColor(-13851168);
                contentIntent.setVibrate(new long[0]);
                contentIntent.setCategory("call");
                contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, 0, intent, 33554432), true);
                Intent intent4 = new Intent(org.telegram.messenger.a.b, (Class<?>) VoIPActionsReceiver.class);
                intent4.setAction(context.getPackageName() + ".HIDE_CALL");
                intent4.putExtra("group_call_invite_msg_id", i2);
                intent4.putExtra("currentAccount", i);
                contentIntent.setDeleteIntent(PendingIntent.getBroadcast(org.telegram.messenger.a.b, 0, intent4, 167772160));
                TLObject b2 = uc7.s1(i).b2(j2);
                Bitmap roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i, b2);
                o = TextUtils.isEmpty(str) ? str : lv2.o(b2);
                if (TextUtils.isEmpty(o)) {
                    o = "___";
                }
                if (i3 >= 31) {
                    contentIntent.setStyle(Notification.CallStyle.forIncomingCall(l35.a().setName(o).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
                }
                notificationManager.notify(203, contentIntent.build());
                VoIPPreNotificationService.startRinging(context, i, j2);
                runnable = missRunnable;
                if (runnable != null) {
                    hl.r(runnable);
                }
                bt btVar = new bt((Object) context, i, i2, (byte) 17);
                missRunnable = btVar;
                hl.d3(btVar, uc7.s1(i).a3);
            }
            if (f11.a) {
                cc4.b("User messed up the notification channel; deleting it and creating a proper one");
            }
            notificationManager2.deleteNotificationChannel("incoming_calls4" + i5);
            i5++;
            f1.edit().putInt("calls_notification_channel", i5).commit();
        }
        z = true;
        if (z) {
        }
        contentIntent.setChannelId("incoming_calls4" + i5);
        Intent intent22 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent22.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent22.putExtra("call_id", j);
        intent22.putExtra("group_call_invite_msg_id", i2);
        intent22.putExtra("currentAccount", i);
        String M022 = ob6.M0(2131743070, null);
        i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
        }
        notificationManager = notificationManager2;
        i4 = 0;
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, i4, intent22, 301989888);
        Intent intent32 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent32.setAction(context.getPackageName() + ".ANSWER_CALL");
        intent32.putExtra("call_id", j);
        intent32.putExtra("group_call_invite_msg_id", i2);
        intent32.putExtra("currentAccount", i);
        M0 = ob6.M0(2131743156, null);
        if (i3 >= 24) {
            SpannableString spannableString22 = new SpannableString(M0);
            spannableString22.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString22.length(), 0);
        }
        PendingIntent activity2 = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) cls).setAction("voip_answer").putExtra("voip_answer_token", LaunchActivity.C1).putExtra("group_call_invite_msg_id", i2).putExtra("currentAccount", i), 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(false);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[0]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, 0, intent, 33554432), true);
        Intent intent42 = new Intent(org.telegram.messenger.a.b, (Class<?>) VoIPActionsReceiver.class);
        intent42.setAction(context.getPackageName() + ".HIDE_CALL");
        intent42.putExtra("group_call_invite_msg_id", i2);
        intent42.putExtra("currentAccount", i);
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(org.telegram.messenger.a.b, 0, intent42, 167772160));
        TLObject b22 = uc7.s1(i).b2(j2);
        Bitmap roundAvatarBitmap2 = VoIPService.getRoundAvatarBitmap(context, i, b22);
        if (TextUtils.isEmpty(str)) {
        }
        if (TextUtils.isEmpty(o)) {
        }
        if (i3 >= 31) {
        }
        notificationManager.notify(203, contentIntent.build());
        VoIPPreNotificationService.startRinging(context, i, j2);
        runnable = missRunnable;
        if (runnable != null) {
        }
        bt btVar2 = new bt((Object) context, i, i2, (byte) 17);
        missRunnable = btVar2;
        hl.d3(btVar2, uc7.s1(i).a3);
    }

    public static void hide(Context context) {
        State state = currentState;
        if (state == null) {
            return;
        }
        hide(context, state.currentAccount, currentState.msg_id);
    }
}
