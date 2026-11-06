package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.ox;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.messenger.r3;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.z5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.v4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;
import org.telegram.ui.qu0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class y1 {
    public static long a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            Iterator<String> it = qp.s1(p10.s0).d7.getStringSet("calls_access_hashes", Collections.EMPTY_SET).iterator();
            while (it.hasNext()) {
                String[] split = it.next().split(" ");
                if (split.length >= 2) {
                    if (split[0].equals(tL_messageActionPhoneCall.call_id + "")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void b(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z9, final boolean z10, final boolean z11, final boolean z12, final Activity activity, final org.telegram.ui.ActionBar.f2 f2Var, final org.telegram.messenger.c cVar, boolean z13, boolean z14, boolean z15) {
        r3 g12;
        TLRPC.ChatFull N0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.ChatFull N02;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - a < (chat != null ? qs.e3 : 2000)) {
                return;
            }
            if (z13 && chat != null && !z12 && (N02 = qp.s1(cVar.a).N0(chat.id)) != null && (peer = N02.groupcall_default_join_as) != null) {
                final TLRPC.InputPeer j12 = qp.s1(cVar.a).j1(ij.C1(peer));
                t60.J0(activity, -chat.id, cVar, new qr() { // from class: org.telegram.ui.Components.voip.q1
                    @Override // org.telegram.messenger.qr
                    public final void k(boolean z16) {
                        String str2 = str;
                        Activity activity2 = activity;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user2 = user;
                        TLRPC.InputPeer inputPeer2 = j12;
                        boolean z17 = z10;
                        boolean z18 = z11;
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        org.telegram.messenger.c cVar2 = cVar;
                        if (z16 || str2 == null) {
                            y1.b(user2, chat2, str2, inputPeer2, !z16, z17, z18, false, activity2, f2Var2, cVar2, false, false, false);
                            return;
                        }
                        w1 w1Var = new w1(activity2, chat2, user2, chat2, str2, inputPeer2, z17, z18, activity2, f2Var2, cVar2);
                        if (f2Var2 != null) {
                            f2Var2.showDialog(w1Var);
                        }
                    }
                });
                return;
            }
            if (z13 && chat != null) {
                t60.K0(activity, -chat.id, cVar, f2Var, !z12 ? 1 : 0, null, new r1(z12, activity, cVar, chat, str, user, z10, z11, f2Var));
                return;
            }
            if (z14 && !z9 && (inputPeer instanceof TLRPC.TL_inputPeerUser) && chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous && (!t3.T(chat) || chat.megagroup)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = hd.M0(t3.W(chat) ? 2131743448 : 2131743307, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = hd.M0(t3.W(chat) ? 2131743478 : 2131743370, null);
                alertDialog$Builder.k(hd.M0(2131743443, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Components.voip.s1
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                        y1.b(TLRPC.User.this, chat, str, inputPeer, false, z10, z11, z12, activity, f2Var, cVar, false, false, false);
                    }
                });
                jg.g.w(null, 2131752589, alertDialog$Builder, null);
                return;
            }
            if (chat != null && inputPeer != null && (N0 = qp.s1(cVar.a).N0(chat.id)) != null) {
                if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    N0.groupcall_default_join_as = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    N0.groupcall_default_join_as = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    N0.groupcall_default_join_as = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                }
                if (N0 instanceof TLRPC.TL_chatFull) {
                    N0.flags |= 32768;
                } else {
                    N0.flags |= 67108864;
                }
            }
            if (chat != null && !z12 && (g12 = qp.s1(cVar.a).g1(chat.id, false, null)) != null && g12.j()) {
                c40.e1((LaunchActivity) activity, cVar, chat, inputPeer, z9, str);
                return;
            }
            a = SystemClock.elapsedRealtime();
            Intent intent = new Intent(activity, (Class<?>) VoIPService.class);
            if (user != null) {
                intent.putExtra("user_id", user.id);
            } else {
                intent.putExtra("chat_id", chat.id);
                intent.putExtra("createGroupCall", z12);
                intent.putExtra("hasFewPeers", z9);
                intent.putExtra("isRtmpStream", z15);
                intent.putExtra("hash", str);
                if (inputPeer != null) {
                    intent.putExtra("peerChannelId", inputPeer.channel_id);
                    intent.putExtra("peerChatId", inputPeer.chat_id);
                    intent.putExtra("peerUserId", inputPeer.user_id);
                    intent.putExtra("peerAccessHash", inputPeer.access_hash);
                }
            }
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", true);
            intent.putExtra("video_call", z10);
            intent.putExtra("can_video_call", z11);
            intent.putExtra("account", p10.s0);
            try {
                activity.startService(intent);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
    }

    public static int c() {
        boolean z9 = z5.q(0).J.f;
        boolean z10 = z5.q(0).K.f;
        boolean z11 = z5.q(0).L.f;
        if (z9 || z10 || z11) {
            if (z9 && !z10 && !z11) {
                return 3;
            }
            if (z9 && z10 && !z11) {
                return 1;
            }
            if (z9 && z10 && z11) {
                return 2;
            }
            if (org.telegram.messenger.r2.a) {
                a8.l("Invalid call data saving preset configuration: " + z9 + "/" + z10 + "/" + z11);
            }
        }
        return 0;
    }

    public static String d(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(org.telegram.messenger.t0.b.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static String e(String str) {
        File file = new File(org.telegram.messenger.t0.b.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean z9 = org.telegram.messenger.r2.a;
        return new File(file, rf.b.q(str, "_stats.log")).getAbsolutePath();
    }

    public static void f(TLRPC.User user, TLRPC.Chat chat, String str, boolean z9, boolean z10, boolean z11, Boolean bool, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar) {
        org.telegram.messenger.c cVar2;
        char c10;
        long j3;
        String str2;
        int i7;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null) {
                if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    b(user, chat, str, null, false, z9, z10, z11, activity, f2Var, cVar, bool != null ? bool.booleanValue() : true, true, false);
                    return;
                }
                return;
            }
            long j10 = user != null ? user.id : -chat.id;
            long callerId = sharedInstance.getCallerId();
            if (callerId == j10) {
                cVar2 = cVar;
                if (sharedInstance.getAccount() == cVar2.a) {
                    if (user != null || !(activity instanceof LaunchActivity)) {
                        activity.startActivity(new Intent(activity, (Class<?>) LaunchActivity.class).setAction(user != null ? "voip" : "voip_chat"));
                        return;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        sharedInstance.setGroupCallHash(str);
                    }
                    c40.e1((LaunchActivity) activity, org.telegram.messenger.c.a(p10.s0), null, null, false, null);
                    return;
                }
            } else {
                cVar2 = cVar;
            }
            if (sharedInstance.isConference()) {
                StringBuilder sb2 = new StringBuilder();
                c10 = 1;
                if (sharedInstance.groupCall != null) {
                    int account = sharedInstance.getAccount();
                    int i10 = 0;
                    int i11 = 0;
                    j3 = 0;
                    while (i10 < sharedInstance.groupCall.d.m()) {
                        int i12 = i10;
                        long o4 = m5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.n(i10)).peer);
                        if (o4 != p10.i(account).e()) {
                            i11++;
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(m5.s(account, o4));
                            if (i11 >= 2) {
                                break;
                            }
                        }
                        i10 = i12 + 1;
                    }
                    if (i11 < sharedInstance.groupCall.d.m() - 1) {
                        sb2.append(hd.G((sharedInstance.groupCall.d.m() - 1) - i11, "AndOther", new Object[0]));
                    }
                } else {
                    j3 = 0;
                }
                i7 = j10 > j3 ? 2131743268 : 2131743267;
                str2 = sb2.toString();
            } else {
                c10 = 1;
                j3 = 0;
                if (callerId > 0) {
                    TLRPC.User user2 = sharedInstance.getUser();
                    str2 = g5.m(0, user2.first_name, user2.last_name);
                    i7 = j10 > 0 ? 2131743274 : 2131743273;
                } else {
                    str2 = sharedInstance.getChat().title;
                    i7 = j10 > 0 ? 2131743270 : 2131743271;
                }
            }
            String m10 = user != null ? g5.m(0, user.first_name, user.last_name) : chat.title;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String M0 = hd.M0(callerId < j3 ? 2131743269 : 2131743272, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            Object[] objArr = new Object[2];
            objArr[0] = str2;
            objArr[c10] = m10;
            u1Var.T = org.telegram.messenger.g0.X2(hd.a0(null, null, i7, objArr));
            alertDialog$Builder.k(hd.M0(2131747830, null), new r1(user, chat, str, z9, z10, z11, activity, f2Var, cVar2));
            jg.g.w(null, 2131752589, alertDialog$Builder, null);
        }
    }

    public static void g(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z9, TLRPC.GroupCall groupCall, HashSet hashSet) {
        if (activity == null) {
            return;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(new li.p2(activity, i7, inputGroupCall, z9, groupCall, hashSet));
            return;
        }
        a = SystemClock.elapsedRealtime();
        Intent intent = new Intent(activity, (Class<?>) VoIPService.class);
        intent.putExtra("chat_id", 0L);
        int i10 = 0;
        intent.putExtra("createGroupCall", false);
        intent.putExtra("hasFewPeers", false);
        intent.putExtra("isRtmpStream", false);
        intent.putExtra("hash", (String) null);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", true);
        intent.putExtra("video_call", false);
        SerializedData serializedData = new SerializedData(inputGroupCall.getObjectSize());
        inputGroupCall.serializeToStream(serializedData);
        intent.putExtra("joinConference", serializedData.toByteArray());
        if (groupCall != null) {
            SerializedData serializedData2 = new SerializedData(groupCall.getObjectSize());
            groupCall.serializeToStream(serializedData2);
            intent.putExtra("joinConferenceCall", serializedData2.toByteArray());
        }
        if (hashSet != null) {
            long[] jArr = new long[hashSet.size()];
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                jArr[i10] = ((Long) it.next()).longValue();
                i10++;
            }
            intent.putExtra("inviteUsers", jArr);
        }
        intent.putExtra("account", i7);
        intent.putExtra("video_call", z9);
        intent.putExtra("can_video_call", true);
        try {
            activity.startService(intent);
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public static void h(Activity activity, Runnable runnable, int i7) {
        int i10 = 1;
        boolean z9 = i7 == 102;
        if (!activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") || (z9 && !activity.shouldShowRequestPermissionRationale("android.permission.CAMERA"))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.M0(z9 ? 2131743285 : 2131743284, null));
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.T = X2;
            alertDialog$Builder.k(hd.M0(2131745496, null), new hi.l0(activity, i10));
            alertDialog$Builder.h(hd.M0(2131751772, null), null);
            u1Var.setOnDismissListener(new org.telegram.ui.ActionBar.j2(1, runnable));
            int i11 = z9 ? R.raw.permission_request_camera : R.raw.permission_request_microphone;
            int i12 = k6.L5;
            alertDialog$Builder.m(i11, 72, k6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    public static void i(Activity activity) {
        final SharedPreferences e12 = qp.e1();
        final int i7 = 1;
        LinearLayout e10 = k5.e(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        r6.V(textView, k6.j5, null);
        e10.addView(textView, ha.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
        final r8 r8Var = new r8(activity);
        final int i10 = 0;
        r8Var.f("Force TCP", e12.getBoolean("dbg_force_tcp_in_calls", false), false);
        r8Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        SharedPreferences sharedPreferences = e12;
                        boolean z9 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        boolean z10 = !z9;
                        edit.putBoolean("dbg_force_tcp_in_calls", z10);
                        edit.commit();
                        r8Var.setChecked(z10);
                        break;
                    case 1:
                        SharedPreferences sharedPreferences2 = e12;
                        boolean z11 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        boolean z12 = !z11;
                        edit2.putBoolean("dbg_dump_call_stats", z12);
                        edit2.commit();
                        r8Var.setChecked(z12);
                        break;
                    default:
                        SharedPreferences sharedPreferences3 = e12;
                        boolean z13 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                        boolean z14 = !z13;
                        edit3.putBoolean("dbg_force_connection_service", z14);
                        edit3.commit();
                        r8Var.setChecked(z14);
                        break;
                }
            }
        });
        e10.addView(r8Var);
        if (org.telegram.messenger.r2.a) {
            final r8 r8Var2 = new r8(activity);
            r8Var2.f("Dump detailed stats", e12.getBoolean("dbg_dump_call_stats", false), false);
            r8Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.u1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            SharedPreferences sharedPreferences = e12;
                            boolean z9 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z10 = !z9;
                            edit.putBoolean("dbg_force_tcp_in_calls", z10);
                            edit.commit();
                            r8Var2.setChecked(z10);
                            break;
                        case 1:
                            SharedPreferences sharedPreferences2 = e12;
                            boolean z11 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z12 = !z11;
                            edit2.putBoolean("dbg_dump_call_stats", z12);
                            edit2.commit();
                            r8Var2.setChecked(z12);
                            break;
                        default:
                            SharedPreferences sharedPreferences3 = e12;
                            boolean z13 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                            boolean z14 = !z13;
                            edit3.putBoolean("dbg_force_connection_service", z14);
                            edit3.commit();
                            r8Var2.setChecked(z14);
                            break;
                    }
                }
            });
            e10.addView(r8Var2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final r8 r8Var3 = new r8(activity);
            r8Var3.f("Enable ConnectionService", e12.getBoolean("dbg_force_connection_service", false), false);
            final int i11 = 2;
            r8Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.u1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            SharedPreferences sharedPreferences = e12;
                            boolean z9 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z10 = !z9;
                            edit.putBoolean("dbg_force_tcp_in_calls", z10);
                            edit.commit();
                            r8Var3.setChecked(z10);
                            break;
                        case 1:
                            SharedPreferences sharedPreferences2 = e12;
                            boolean z11 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z12 = !z11;
                            edit2.putBoolean("dbg_dump_call_stats", z12);
                            edit2.commit();
                            r8Var3.setChecked(z12);
                            break;
                        default:
                            SharedPreferences sharedPreferences3 = e12;
                            boolean z13 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                            boolean z14 = !z13;
                            edit3.putBoolean("dbg_force_connection_service", z14);
                            edit3.commit();
                            r8Var3.setChecked(z14);
                            break;
                    }
                }
            });
            e10.addView(r8Var3);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.R = hd.M0(2131751646, null);
        alertDialog$Builder.o(e10);
        alertDialog$Builder.p();
    }

    public static void j(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        Iterator<String> it = qp.s1(p10.s0).d7.getStringSet("calls_access_hashes", Collections.EMPTY_SET).iterator();
        while (it.hasNext()) {
            String[] split = it.next().split(" ");
            if (split.length >= 2) {
                if (split[0].equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        k(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(split[1]), p10.s0, true);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void k(final Context context, qu0 qu0Var, boolean z9, final long j3, final long j10, final int i7, final boolean z10) {
        File file;
        String M0;
        String str;
        boolean z11 = org.telegram.messenger.r2.a;
        File file2 = new File(org.telegram.messenger.t0.b.getExternalFilesDir(null), "logs");
        String[] list = file2.list();
        if (list != null) {
            for (String str2 : list) {
                if (str2.endsWith("voip" + j3 + ".txt")) {
                    file = new File(file2, str2);
                    break;
                }
            }
        }
        File file3 = new File(org.telegram.messenger.t0.b.getCacheDir(), "voip_logs");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        file = new File(file3, j3 + ".log");
        final File file4 = file;
        final int[] iArr = {0};
        int i10 = 1;
        LinearLayout f10 = k5.f(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        f10.setPadding(L, L, L, 0);
        final TextView textView = new TextView(context);
        textView.setTextSize(2, 16.0f);
        r6.V(textView, k6.j5, null);
        k5.m(textView, 17, null, 2131743257);
        f10.addView(textView);
        final p9 p9Var = new p9(context);
        p9Var.c = new Paint();
        p9Var.d = 5;
        p9Var.e = 0;
        p9Var.a = BitmapFactory.decodeResource(p9Var.getResources(), R.drawable.ic_rating_star_filled).extractAlpha();
        p9Var.b = BitmapFactory.decodeResource(p9Var.getResources(), R.drawable.ic_rating_star).extractAlpha();
        f10.addView(p9Var, ha.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bi.l1 l1Var = new bi.l1(13);
        String[] strArr = {z9 ? "distorted_video" : null, z9 ? "pixelated_video" : null, "echo", "noise", "interruptions", "distorted_speech", "silent_local", "silent_remote", "dropped"};
        int i11 = 0;
        while (i11 < 9) {
            if (strArr[i11] != null) {
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, i10);
                c2Var.setClipToPadding(false);
                c2Var.setTag(strArr[i11]);
                switch (i11) {
                    case 0:
                        M0 = hd.M0(2131746415, null);
                        str = M0;
                        break;
                    case 1:
                        M0 = hd.M0(2131746414, null);
                        str = M0;
                        break;
                    case 2:
                        M0 = hd.M0(2131746420, null);
                        str = M0;
                        break;
                    case 3:
                        M0 = hd.M0(2131746418, null);
                        str = M0;
                        break;
                    case 4:
                        M0 = hd.M0(2131746419, null);
                        str = M0;
                        break;
                    case 5:
                        M0 = hd.M0(2131746422, null);
                        str = M0;
                        break;
                    case 6:
                        M0 = hd.M0(2131746417, null);
                        str = M0;
                        break;
                    case 7:
                        M0 = hd.M0(2131746416, null);
                        str = M0;
                        break;
                    case 8:
                        M0 = hd.M0(2131746421, null);
                        str = M0;
                        break;
                    default:
                        str = null;
                        break;
                }
                c2Var.e(str, null, false, false, false);
                c2Var.setOnClickListener(l1Var);
                c2Var.setTag(strArr[i11]);
                linearLayout.addView(c2Var);
            }
            i11++;
            i10 = 1;
        }
        f10.addView(linearLayout, ha.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setHint(hd.M0(2131743408, null));
        editTextBoldCursor.setInputType(147457);
        r6.V(editTextBoldCursor, k6.j5, null);
        r6.E(editTextBoldCursor, k6.t5, null);
        editTextBoldCursor.setBackground(null);
        r6.G(editTextBoldCursor, k6.u5, k6.v5, k6.q7, null);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        f10.addView(editTextBoldCursor, ha.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context, 1);
        n41 n41Var = new n41(3, zArr, c2Var2);
        c2Var2.e(hd.M0(2131752604, null), null, true, false, false);
        c2Var2.setClipToPadding(false);
        c2Var2.setOnClickListener(n41Var);
        f10.addView(c2Var2, ha.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(2, 14.0f);
        org.telegram.messenger.camera.q.o(textView2, k6.r5, null, null, 2131752603);
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setOnClickListener(n41Var);
        f10.addView(textView2);
        c2Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file4.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = hd.M0(2131752614, null);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131745641, null), new v0.j(14));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.a.setOnDismissListener(new org.telegram.ui.ActionBar.j2(2, qu0Var));
        final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (org.telegram.messenger.r2.a && file4.exists()) {
            org.telegram.ui.Components.f2 f2Var = new org.telegram.ui.Components.f2(23, context, file4);
            u1Var.r0 = "Send log";
            u1Var.s0 = f2Var;
        }
        u1Var.show();
        u1Var.getWindow().setSoftInputMode(3);
        final View d = u1Var.d(-1);
        d.setEnabled(false);
        p9Var.setOnRatingChangeListener(new o1(d));
        d.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p9 p9Var2 = p9.this;
                int rating = p9Var2.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file5 = file4;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        p9Var2.setVisibility(8);
                        textView.setVisibility(8);
                        u1Var2.setTitle(hd.M0(2131752605, null));
                        editTextBoldCursor2.setVisibility(0);
                        if (file5.exists()) {
                            c2Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) d).setText(hd.M0(2131745641, null).toUpperCase());
                        return;
                    }
                }
                int i12 = p10.s0;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = p9Var2.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < linearLayout2.getChildCount(); i13++) {
                    org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) linearLayout2.getChildAt(i13);
                    if (c2Var3.b()) {
                        arrayList.add("#" + c2Var3.getTag());
                    }
                }
                if (setcallrating.rating < 5) {
                    setcallrating.comment = editTextBoldCursor2.getText().toString();
                } else {
                    setcallrating.comment = "";
                }
                boolean isEmpty = arrayList.isEmpty();
                boolean[] zArr2 = zArr;
                if (!isEmpty && !zArr2[0]) {
                    setcallrating.comment += " " + TextUtils.join(" ", arrayList);
                }
                TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
                setcallrating.peer = tL_inputPhoneCall;
                tL_inputPhoneCall.access_hash = j10;
                tL_inputPhoneCall.id = j3;
                setcallrating.user_initiative = z10;
                ConnectionsManager.getInstance(i7).sendRequest(setcallrating, new ox(i12, zArr2, file5, setcallrating, arrayList, context));
                u1Var2.dismiss();
            }
        });
    }

    public static void l(TLRPC.Chat chat, String str, boolean z9, Boolean bool, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar) {
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(p10.s0).getConnectionState() == 3) {
            f(null, chat, str, false, false, z9, bool, activity, f2Var, cVar);
            return;
        }
        int i7 = 1;
        boolean z10 = Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = hd.M0(z10 ? 2131743277 : 2131743275, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = hd.M0(z10 ? 2131743356 : 2131743357, null);
        alertDialog$Builder.k(hd.M0(2131747830, null), null);
        if (z10) {
            Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                alertDialog$Builder.i(hd.M0(2131743276, null), new v1(activity, intent, i7));
            }
        }
        try {
            alertDialog$Builder.p();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void m(TLRPC.User user, boolean z9, boolean z10, Activity activity, TLRPC.UserFull userFull, org.telegram.messenger.c cVar) {
        if (cVar != null ? qp.s1(cVar.a).v2() : qp.s1(p10.s0).v2()) {
            org.telegram.ui.b.b(cVar == null ? p10.s0 : cVar.a);
            return;
        }
        if (userFull != null && userFull.phone_calls_private) {
            v4.i0(activity, cVar.a, user.id);
            return;
        }
        int i7 = 0;
        if (ConnectionsManager.getInstance(p10.s0).getConnectionState() == 3) {
            ArrayList arrayList = new ArrayList();
            if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                arrayList.add("android.permission.RECORD_AUDIO");
            }
            if (z9 && activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                arrayList.add("android.permission.CAMERA");
            }
            if (arrayList.isEmpty()) {
                f(user, null, null, z9, z10, false, null, activity, null, cVar);
                return;
            } else {
                activity.requestPermissions((String[]) arrayList.toArray(new String[0]), z9 ? qs.n1 : 101);
                return;
            }
        }
        boolean z11 = Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = hd.M0(z11 ? 2131743277 : 2131743275, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = hd.M0(z11 ? 2131743278 : 2131743279, null);
        alertDialog$Builder.k(hd.M0(2131747830, null), null);
        if (z11) {
            Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                alertDialog$Builder.i(hd.M0(2131743276, null), new v1(activity, intent, i7));
            }
        }
        try {
            alertDialog$Builder.p();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
