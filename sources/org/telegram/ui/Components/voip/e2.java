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
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.d5;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.em;
import org.telegram.messenger.qi;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.u10;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j60;
import org.telegram.ui.k01;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class e2 {
    public static long a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            Iterator<String> it = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).getStringSet("calls_access_hashes", Collections.EMPTY_SET).iterator();
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

    public static void b(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z10, final boolean z11, final boolean z12, final boolean z13, final Activity activity, final org.telegram.ui.ActionBar.p2 p2Var, final AccountInstance accountInstance, boolean z14, boolean z15, boolean z16) {
        ChatObject.Call groupCall;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - a < (chat != null ? 200 : 2000)) {
                return;
            }
            if (z14 && chat != null && !z13 && (chatFull2 = accountInstance.getMessagesController().getChatFull(chat.id)) != null && (peer = chatFull2.groupcall_default_join_as) != null) {
                final TLRPC.InputPeer inputPeer2 = accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(peer));
                f80.t(activity, -chat.id, accountInstance, new MessagesStorage.BooleanCallback() { // from class: org.telegram.ui.Components.voip.v1
                    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
                    public final void run(boolean z17) {
                        String str2 = str;
                        Activity activity2 = activity;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user2 = user;
                        TLRPC.InputPeer inputPeer3 = inputPeer2;
                        boolean z18 = z11;
                        boolean z19 = z12;
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        AccountInstance accountInstance2 = accountInstance;
                        if (z17 || str2 == null) {
                            e2.b(user2, chat2, str2, inputPeer3, !z17, z18, z19, false, activity2, p2Var2, accountInstance2, false, false, false);
                            return;
                        }
                        c2 c2Var = new c2(activity2, chat2, user2, chat2, str2, inputPeer3, z18, z19, activity2, p2Var2, accountInstance2);
                        if (p2Var2 != null) {
                            p2Var2.showDialog(c2Var);
                        }
                    }
                });
                return;
            }
            if (z14 && chat != null) {
                f80.u(activity, -chat.id, accountInstance, p2Var, !z13 ? 1 : 0, null, new w1(z13, activity, accountInstance, chat, str, user, z11, z12, p2Var));
                return;
            }
            if (z15 && !z10 && (inputPeer instanceof TLRPC.TL_inputPeerUser) && ChatObject.shouldSendAnonymously(chat) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                alertDialog$Builder.a.R = LocaleController.getString(ChatObject.isChannelOrGiga(chat) ? R.string.VoipChannelVoiceChat : R.string.VoipGroupVoiceChat);
                alertDialog$Builder.a.T = LocaleController.getString(ChatObject.isChannelOrGiga(chat) ? R.string.VoipChannelJoinAnonymouseAlert : R.string.VoipGroupJoinAnonymouseAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipChatJoin), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.voip.x1
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                        e2.b(TLRPC.User.this, chat, str, inputPeer, false, z11, z12, z13, activity, p2Var, accountInstance, false, false, false);
                    }
                });
                hc.b.s(R.string.Cancel, alertDialog$Builder, null);
                return;
            }
            if (chat != null && inputPeer != null && (chatFull = accountInstance.getMessagesController().getChatFull(chat.id)) != null) {
                if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    chatFull.groupcall_default_join_as = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    chatFull.groupcall_default_join_as = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    chatFull.groupcall_default_join_as = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                }
                if (chatFull instanceof TLRPC.TL_chatFull) {
                    chatFull.flags |= 32768;
                } else {
                    chatFull.flags |= 67108864;
                }
            }
            if (chat != null && !z13 && (groupCall = accountInstance.getMessagesController().getGroupCall(chat.id, false)) != null && groupCall.isScheduled()) {
                j60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
                return;
            }
            a = SystemClock.elapsedRealtime();
            Intent intent = new Intent(activity, (Class<?>) VoIPService.class);
            if (user != null) {
                intent.putExtra("user_id", user.id);
            } else {
                intent.putExtra("chat_id", chat.id);
                intent.putExtra("createGroupCall", z13);
                intent.putExtra("hasFewPeers", z10);
                intent.putExtra("isRtmpStream", z16);
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
            intent.putExtra("video_call", z11);
            intent.putExtra("can_video_call", z12);
            intent.putExtra("account", UserConfig.selectedAccount);
            try {
                activity.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    public static int c() {
        boolean z10 = DownloadController.getInstance(0).lowPreset.lessCallData;
        boolean z11 = DownloadController.getInstance(0).mediumPreset.lessCallData;
        boolean z12 = DownloadController.getInstance(0).highPreset.lessCallData;
        if (!z10 && !z11 && !z12) {
            return 0;
        }
        if (z10 && !z11 && !z12) {
            return 3;
        }
        if (z10 && z11 && !z12) {
            return 1;
        }
        if (z10 && z11 && z12) {
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.w("Invalid call data saving preset configuration: " + z10 + "/" + z11 + "/" + z12);
        }
        return 0;
    }

    public static String d(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static String e(String str, boolean z10) {
        File[] listFiles;
        File file = new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!BuildVars.DEBUG_VERSION && (listFiles = file.listFiles()) != null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(listFiles));
            while (arrayList.size() > 20) {
                int i10 = 0;
                File file2 = (File) arrayList.get(0);
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    File file3 = (File) obj;
                    if (file3.getName().endsWith(".log") && file3.lastModified() < file2.lastModified()) {
                        file2 = file3;
                    }
                }
                file2.delete();
                arrayList.remove(file2);
            }
        }
        return z10 ? new File(file, r6.t(str, "_stats.log")).getAbsolutePath() : new File(file, r6.t(str, ".log")).getAbsolutePath();
    }

    public static void f(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Boolean bool, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        char c10;
        long j3;
        String str2;
        int i10;
        int i11;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null) {
                if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    b(user, chat, str, null, false, z10, z11, z12, activity, p2Var, accountInstance, bool != null ? bool.booleanValue() : true, true, false);
                    return;
                }
                return;
            }
            long j10 = user != null ? user.id : -chat.id;
            long callerId = sharedInstance.getCallerId();
            if (callerId == j10 && sharedInstance.getAccount() == accountInstance.getCurrentAccount()) {
                if (user != null || !(activity instanceof LaunchActivity)) {
                    activity.startActivity(new Intent(activity, (Class<?>) LaunchActivity.class).setAction(user != null ? "voip" : "voip_chat"));
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    sharedInstance.setGroupCallHash(str);
                }
                j60.c1((LaunchActivity) activity, AccountInstance.getInstance(UserConfig.selectedAccount), null, null, false, null);
                return;
            }
            if (sharedInstance.isConference()) {
                StringBuilder sb2 = new StringBuilder();
                if (sharedInstance.groupCall != null) {
                    int account = sharedInstance.getAccount();
                    int i12 = 0;
                    c10 = 1;
                    int i13 = 0;
                    j3 = 0;
                    while (true) {
                        if (i12 >= sharedInstance.groupCall.participants.m()) {
                            i11 = i13;
                            break;
                        }
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.n(i12)).peer);
                        if (peerDialogId != UserConfig.getInstance(account).getClientUserId()) {
                            i11 = i13 + 1;
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(DialogObject.getShortName(account, peerDialogId));
                            if (i11 >= 2) {
                                break;
                            } else {
                                i13 = i11;
                            }
                        }
                        i12++;
                    }
                    if (i11 < sharedInstance.groupCall.participants.m() - 1) {
                        sb2.append(LocaleController.formatPluralString("AndOther", (sharedInstance.groupCall.participants.m() - 1) - i11, new Object[0]));
                    }
                } else {
                    c10 = 1;
                    j3 = 0;
                }
                i10 = j10 > j3 ? R.string.VoipOngoingConferenceChatAlert : R.string.VoipOngoingConferenceChatAlert2;
                str2 = sb2.toString();
            } else {
                c10 = 1;
                j3 = 0;
                if (callerId > 0) {
                    TLRPC.User user2 = sharedInstance.getUser();
                    str2 = ContactsController.formatName(user2.first_name, user2.last_name);
                    i10 = j10 > 0 ? R.string.VoipOngoingAlert : R.string.VoipOngoingAlert2;
                } else {
                    str2 = sharedInstance.getChat().title;
                    i10 = j10 > 0 ? R.string.VoipOngoingChatAlert2 : R.string.VoipOngoingChatAlert;
                }
            }
            String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : chat.title;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String string = LocaleController.getString(callerId < j3 ? R.string.VoipOngoingChatAlertTitle : R.string.VoipOngoingAlertTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.R = string;
            Object[] objArr = new Object[2];
            objArr[0] = str2;
            objArr[c10] = formatName;
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new w1(user, chat, str, z10, z11, z12, activity, p2Var, accountInstance));
            hc.b.s(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void g(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        if (activity == null) {
            return;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(new hi.u2(activity, i10, inputGroupCall, z10, groupCall, hashSet));
            return;
        }
        a = SystemClock.elapsedRealtime();
        Intent intent = new Intent(activity, (Class<?>) VoIPService.class);
        intent.putExtra("chat_id", 0L);
        int i11 = 0;
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
                jArr[i11] = ((Long) it.next()).longValue();
                i11++;
            }
            intent.putExtra("inviteUsers", jArr);
        }
        intent.putExtra("account", i10);
        intent.putExtra("video_call", z10);
        intent.putExtra("can_video_call", true);
        try {
            activity.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public static void h(Activity activity, Runnable runnable, int i10) {
        boolean z10 = i10 == 102;
        if (!activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") || (z10 && !activity.shouldShowRequestPermissionRationale("android.permission.CAMERA"))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.VoipNeedMicCameraPermissionWithHint : R.string.VoipNeedMicPermissionWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.Settings), new di.t0(activity, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.a.setOnDismissListener(new b2(0, runnable));
            alertDialog$Builder.m(z10 ? R.raw.permission_request_camera : R.raw.permission_request_microphone, 72, j6.w0(null, j6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    public static void i(Activity activity) {
        final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        textView.setTextColor(j6.w0(null, j6.j5, false));
        f7.addView(textView, a6.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
        final x8 x8Var = new x8(activity);
        x8Var.f("Force TCP", globalMainSettings.getBoolean("dbg_force_tcp_in_calls", false), false);
        final int i10 = 0;
        x8Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        SharedPreferences sharedPreferences = globalMainSettings;
                        boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        boolean z11 = !z10;
                        edit.putBoolean("dbg_force_tcp_in_calls", z11);
                        edit.commit();
                        x8Var.setChecked(z11);
                        break;
                    case 1:
                        SharedPreferences sharedPreferences2 = globalMainSettings;
                        boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        boolean z13 = !z12;
                        edit2.putBoolean("dbg_dump_call_stats", z13);
                        edit2.commit();
                        x8Var.setChecked(z13);
                        break;
                    default:
                        SharedPreferences sharedPreferences3 = globalMainSettings;
                        boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                        boolean z15 = !z14;
                        edit3.putBoolean("dbg_force_connection_service", z15);
                        edit3.commit();
                        x8Var.setChecked(z15);
                        break;
                }
            }
        });
        f7.addView(x8Var);
        if (BuildVars.DEBUG_VERSION && BuildVars.LOGS_ENABLED) {
            final x8 x8Var2 = new x8(activity);
            x8Var2.f("Dump detailed stats", globalMainSettings.getBoolean("dbg_dump_call_stats", false), false);
            final int i11 = 1;
            x8Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.z1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            SharedPreferences sharedPreferences = globalMainSettings;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("dbg_force_tcp_in_calls", z11);
                            edit.commit();
                            x8Var2.setChecked(z11);
                            break;
                        case 1:
                            SharedPreferences sharedPreferences2 = globalMainSettings;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            edit2.putBoolean("dbg_dump_call_stats", z13);
                            edit2.commit();
                            x8Var2.setChecked(z13);
                            break;
                        default:
                            SharedPreferences sharedPreferences3 = globalMainSettings;
                            boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                            boolean z15 = !z14;
                            edit3.putBoolean("dbg_force_connection_service", z15);
                            edit3.commit();
                            x8Var2.setChecked(z15);
                            break;
                    }
                }
            });
            f7.addView(x8Var2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final x8 x8Var3 = new x8(activity);
            x8Var3.f("Enable ConnectionService", globalMainSettings.getBoolean("dbg_force_connection_service", false), false);
            final int i12 = 2;
            x8Var3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.z1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            SharedPreferences sharedPreferences = globalMainSettings;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("dbg_force_tcp_in_calls", z11);
                            edit.commit();
                            x8Var3.setChecked(z11);
                            break;
                        case 1:
                            SharedPreferences sharedPreferences2 = globalMainSettings;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            edit2.putBoolean("dbg_dump_call_stats", z13);
                            edit2.commit();
                            x8Var3.setChecked(z13);
                            break;
                        default:
                            SharedPreferences sharedPreferences3 = globalMainSettings;
                            boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                            boolean z15 = !z14;
                            edit3.putBoolean("dbg_force_connection_service", z15);
                            edit3.commit();
                            x8Var3.setChecked(z15);
                            break;
                    }
                }
            });
            f7.addView(x8Var3);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DebugMenuCallSettings);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.o();
    }

    public static void j(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        Iterator<String> it = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).getStringSet("calls_access_hashes", Collections.EMPTY_SET).iterator();
        while (it.hasNext()) {
            String[] split = it.next().split(" ");
            if (split.length >= 2) {
                if (split[0].equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        k(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(split[1]), UserConfig.selectedAccount, true);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void k(final Context context, k01 k01Var, boolean z10, final long j3, final long j10, final int i10, final boolean z11) {
        File file;
        String string;
        String str;
        File file2;
        String[] list;
        if (BuildVars.DEBUG_VERSION && (list = (file2 = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "logs")).list()) != null) {
            for (String str2 : list) {
                if (str2.endsWith("voip" + j3 + ".txt")) {
                    file = new File(file2, str2);
                    break;
                }
            }
        }
        File file3 = new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        file = new File(file3, j3 + ".log");
        final File file4 = file;
        final int[] iArr = {0};
        int i11 = 1;
        LinearLayout f7 = em.f(context, 1);
        int dp = AndroidUtilities.dp(16.0f);
        f7.setPadding(dp, dp, dp, 0);
        final TextView textView = new TextView(context);
        textView.setTextSize(2, 16.0f);
        com.google.android.gms.internal.vision.e2.p(j6.j5, null, false, textView, 17);
        textView.setText(LocaleController.getString(R.string.VoipRateCallAlert));
        f7.addView(textView);
        final aa aaVar = new aa(context);
        aaVar.c = new Paint();
        aaVar.d = 5;
        aaVar.e = 0;
        aaVar.a = BitmapFactory.decodeResource(aaVar.getResources(), R.drawable.ic_rating_star_filled).extractAlpha();
        aaVar.b = BitmapFactory.decodeResource(aaVar.getResources(), R.drawable.ic_rating_star).extractAlpha();
        f7.addView(aaVar, a6.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        d5 d5Var = new d5(13);
        String[] strArr = {z10 ? "distorted_video" : null, z10 ? "pixelated_video" : null, "echo", "noise", "interruptions", "distorted_speech", "silent_local", "silent_remote", "dropped"};
        int i12 = 0;
        while (i12 < 9) {
            if (strArr[i12] != null) {
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, i11);
                z1Var.setClipToPadding(false);
                z1Var.setTag(strArr[i12]);
                switch (i12) {
                    case 0:
                        string = LocaleController.getString(R.string.RateCallVideoDistorted);
                        str = string;
                        break;
                    case 1:
                        string = LocaleController.getString(R.string.RateCallVideoPixelated);
                        str = string;
                        break;
                    case 2:
                        string = LocaleController.getString(R.string.RateCallEcho);
                        str = string;
                        break;
                    case 3:
                        string = LocaleController.getString(R.string.RateCallNoise);
                        str = string;
                        break;
                    case 4:
                        string = LocaleController.getString(R.string.RateCallInterruptions);
                        str = string;
                        break;
                    case 5:
                        string = LocaleController.getString(R.string.RateCallDistorted);
                        str = string;
                        break;
                    case 6:
                        string = LocaleController.getString(R.string.RateCallSilentLocal);
                        str = string;
                        break;
                    case 7:
                        string = LocaleController.getString(R.string.RateCallSilentRemote);
                        str = string;
                        break;
                    case 8:
                        string = LocaleController.getString(R.string.RateCallDropped);
                        str = string;
                        break;
                    default:
                        str = null;
                        break;
                }
                z1Var.e(str, null, false, false, false);
                z1Var.setOnClickListener(d5Var);
                z1Var.setTag(strArr[i12]);
                linearLayout.addView(z1Var);
            }
            i12++;
            i11 = 1;
        }
        f7.addView(linearLayout, a6.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipFeedbackCommentHint));
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setTextColor(j6.w0(null, j6.j5, false));
        editTextBoldCursor.setHintTextColor(j6.w0(null, j6.t5, false));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(j6.w0(null, j6.u5, false), j6.w0(null, j6.v5, false), j6.w0(null, j6.q7, false));
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        f7.addView(editTextBoldCursor, a6.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(context, 1);
        u10 u10Var = new u10(22, zArr, z1Var2);
        z1Var2.e(LocaleController.getString(R.string.CallReportIncludeLogs), null, true, false, false);
        z1Var2.setClipToPadding(false);
        z1Var2.setOnClickListener(u10Var);
        f7.addView(z1Var2, a6.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(2, 14.0f);
        textView2.setTextColor(j6.w0(null, j6.r5, false));
        textView2.setPadding(r6.b(8.0f, R.string.CallReportLogsExplain, textView2), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setOnClickListener(u10Var);
        f7.addView(textView2);
        z1Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file4.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.CallMessageReportProblem);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Send), new s0.b(22));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.a.setOnDismissListener(new b2(1, k01Var));
        final org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (BuildVars.LOGS_ENABLED && file4.exists()) {
            km kmVar = new km(15, context, file4);
            d2Var.r0 = "Send log";
            d2Var.s0 = kmVar;
        }
        d2Var.show();
        d2Var.getWindow().setSoftInputMode(3);
        final View d = d2Var.d(-1);
        d.setEnabled(false);
        aaVar.setOnRatingChangeListener(new le.a(d));
        d.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aa aaVar2 = aa.this;
                int rating = aaVar2.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file5 = file4;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        aaVar2.setVisibility(8);
                        textView.setVisibility(8);
                        d2Var2.setTitle(LocaleController.getString(R.string.CallReportHint));
                        editTextBoldCursor2.setVisibility(0);
                        if (file5.exists()) {
                            z1Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) d).setText(LocaleController.getString(R.string.Send).toUpperCase());
                        return;
                    }
                }
                int i13 = UserConfig.selectedAccount;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = aaVar2.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < linearLayout2.getChildCount(); i14++) {
                    org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) linearLayout2.getChildAt(i14);
                    if (z1Var3.b()) {
                        arrayList.add("#" + z1Var3.getTag());
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
                setcallrating.user_initiative = z11;
                ConnectionsManager.getInstance(i10).sendRequest(setcallrating, new qi(i13, zArr2, file5, setcallrating, arrayList, context));
                d2Var2.dismiss();
            }
        });
    }

    public static void l(TLRPC.Chat chat, String str, boolean z10, Boolean bool, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() == 3) {
            f(null, chat, str, false, false, z10, bool, activity, p2Var, accountInstance);
            return;
        }
        boolean z11 = Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.R = LocaleController.getString(z11 ? R.string.VoipOfflineAirplaneTitle : R.string.VoipOfflineTitle);
        alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.VoipGroupOfflineAirplane : R.string.VoipGroupOffline);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z11) {
            Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                alertDialog$Builder.i(LocaleController.getString(R.string.VoipOfflineOpenSettings), new a2(activity, intent, 1));
            }
        }
        try {
            alertDialog$Builder.o();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m(TLRPC.User user, boolean z10, boolean z11, Activity activity, TLRPC.UserFull userFull, AccountInstance accountInstance) {
        if (accountInstance != null ? accountInstance.getMessagesController().isFrozen() : MessagesController.getInstance(UserConfig.selectedAccount).isFrozen()) {
            org.telegram.ui.b.b(accountInstance == null ? UserConfig.selectedAccount : accountInstance.getCurrentAccount());
            return;
        }
        if (userFull != null && userFull.phone_calls_private) {
            org.telegram.ui.Components.d5.l0(activity, accountInstance.getCurrentAccount(), user.id);
            return;
        }
        if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() != 3) {
            boolean z12 = Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.a.R = LocaleController.getString(z12 ? R.string.VoipOfflineAirplaneTitle : R.string.VoipOfflineTitle);
            alertDialog$Builder.a.T = LocaleController.getString(z12 ? R.string.VoipOfflineAirplane : R.string.VoipOffline);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            if (z12) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(LocaleController.getString(R.string.VoipOfflineOpenSettings), new a2(activity, intent, 0));
                }
            }
            try {
                alertDialog$Builder.o();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            f(user, null, null, z10, z11, false, null, activity, null, accountInstance);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (z10 && activity.checkSelfPermission("android.permission.CAMERA") != 0) {
            arrayList.add("android.permission.CAMERA");
        }
        if (arrayList.isEmpty()) {
            f(user, null, null, z10, z11, false, null, activity, null, accountInstance);
        } else {
            activity.requestPermissions((String[]) arrayList.toArray(new String[0]), z10 ? 102 : 101);
        }
    }
}
