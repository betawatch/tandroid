package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.jt0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b4(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        g5 g5Var = (g5) this.b;
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            g5Var.f0.add(tL_contact);
            g5Var.g0.put(Long.valueOf(user.id), tL_contact);
        }
        g5Var.d(true);
        ns notificationCenter = g5Var.getNotificationCenter();
        int i7 = np.D8;
        notificationCenter.k(ns.r, 1);
        g5Var.getNotificationCenter().k(ns.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        g5 g5Var = (g5) this.b;
        jt0 jt0Var = (jt0) this.c;
        AccountManager accountManager = AccountManager.get(t0.b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            g5Var.a = null;
            int i7 = 0;
            while (i7 < accountsByType.length) {
                Account account = accountsByType[i7];
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        accountArr = accountsByType;
                        break;
                    }
                    TLRPC.User f10 = m10.i(i10).f();
                    if (f10 != null) {
                        String str = account.name;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        accountArr = accountsByType;
                        sb2.append(f10.id);
                        if (str.equals(sb2.toString())) {
                            accountManager.removeAccount(account, null, null);
                            break;
                        }
                    } else {
                        accountArr = accountsByType;
                    }
                    i10++;
                    accountsByType = accountArr;
                }
                i7++;
                accountsByType = accountArr;
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
            g5Var.a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        g5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        g5Var.getMessagesStorage().c1(new ArrayList(), true);
        g5Var.b0.clear();
        g5Var.f0.clear();
        g5Var.g0.clear();
        g5Var.h0.clear();
        g5Var.j0.clear();
        g5Var.i0.clear();
        g5Var.c0.clear();
        g5Var.d0.clear();
        g5Var.e0.clear();
        g5Var.x.clear();
        g5Var.k0.clear();
        g5Var.l0.clear();
        g5Var.m0.clear();
        g5Var.getNotificationCenter().k(ns.O, new Object[0]);
        g5Var.A(0L, false);
        jt0Var.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0136  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v44 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        Bitmap bitmap;
        FileInputStream fileInputStream;
        Throwable th2;
        Throwable th3;
        int i7 = this.a;
        int i10 = 11;
        ?? r52 = 4;
        ?? r53 = 4;
        ?? r72 = 2;
        ?? r73 = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ns f10 = ns.f(((d4) obj2).currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(30, (TLRPC.ChatFull) obj, 0, bool, bool);
                return;
            case 1:
                g5 g5Var = (g5) obj2;
                g5Var.E = false;
                SharedPreferences.Editor edit = np.s1(g5Var.currentAccount).f7.edit();
                String str = ((TLRPC.TL_help_inviteText) obj).message;
                g5Var.y = str;
                edit.putString("invitelink", str);
                edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
                edit.commit();
                return;
            case 2:
                z5 z5Var = (z5) obj2;
                TLObject tLObject = (TLObject) obj;
                y5 y5Var = z5Var.P;
                y5 y5Var2 = z5Var.O;
                y5 y5Var3 = z5Var.N;
                y5 y5Var4 = z5Var.M;
                y5 y5Var5 = z5Var.L;
                y5 y5Var6 = z5Var.K;
                z5Var.F = false;
                z5Var.getUserConfig().b0 = System.currentTimeMillis();
                z5Var.getUserConfig().v(false);
                if (tLObject != null) {
                    TL_account.autoDownloadSettings autodownloadsettings = (TL_account.autoDownloadSettings) tLObject;
                    y5Var6.d(autodownloadsettings.low);
                    y5Var6.e = false;
                    y5Var5.d(autodownloadsettings.medium);
                    y5Var4.d(autodownloadsettings.high);
                    int i11 = 0;
                    while (i11 < 3) {
                        y5 y5Var7 = i11 == 0 ? y5Var3 : i11 == 1 ? y5Var2 : y5Var;
                        if (y5Var7.a(y5Var6)) {
                            y5Var7.d(autodownloadsettings.low);
                            y5Var7.e = false;
                        } else if (y5Var7.a(y5Var5)) {
                            y5Var7.d(autodownloadsettings.medium);
                        } else if (y5Var7.a(y5Var4)) {
                            y5Var7.d(autodownloadsettings.high);
                        }
                        i11++;
                    }
                    SharedPreferences.Editor edit2 = np.s1(z5Var.currentAccount).f7.edit();
                    edit2.putString("mobilePreset", y5Var3.toString());
                    edit2.putString("wifiPreset", y5Var2.toString());
                    edit2.putString("roamingPreset", y5Var.toString());
                    edit2.putString("preset0", y5Var6.toString());
                    edit2.putString("preset1", y5Var5.toString());
                    edit2.putString("preset2", y5Var4.toString());
                    edit2.commit();
                    y5Var6.toString();
                    y5Var5.toString();
                    y5Var4.toString();
                    z5Var.g();
                    return;
                }
                return;
            case 3:
                z5 z5Var2 = (z5) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                try {
                    SQLitePreparedStatement executeFast = z5Var2.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        executeFast.requery();
                        executeFast.bindInteger(1, ((gj) arrayList2.get(i12)).F0().dc_id);
                        executeFast.bindLong(2, ((gj) arrayList2.get(i12)).F0().id);
                        executeFast.step();
                        try {
                            w7.G(z5Var2.currentAccount);
                            w7.M(((gj) arrayList2.get(i12)).k, false, true).delete();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    executeFast.dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 4:
                np.s1(((v9) obj2).currentAccount).O3(((TLRPC.TL_payments_paymentResult) obj).updates, false);
                return;
            case 5:
                np npVar = (np) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                ez sendMessagesHelper = npVar.getSendMessagesHelper();
                sendMessagesHelper.getClass();
                if (message != null && message.reply_markup != null) {
                    List list = (List) sendMessagesHelper.s.remove(message.dialog_id + "_" + message.id);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            sendMessagesHelper.r.remove((String) it.next());
                        }
                    }
                }
                if (message.out || message.dialog_id != 777000) {
                    return;
                }
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.accepted || tL_messageActionWalletTonConnectRequest.declined) {
                        org.telegram.ui.Wallet.l0.x(npVar.currentAccount).g.o(message.id, tL_messageActionWalletTonConnectRequest.session_id);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                np npVar2 = (np) obj2;
                npVar2.getClass();
                hd E0 = hd.E0();
                TLRPC.TL_langPackDifference tL_langPackDifference = ((TL_update.TL_updateLangPack) obj).difference;
                int i13 = npVar2.currentAccount;
                if (E0.B == null) {
                    return;
                }
                String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
                if (lowerCase.equals(E0.B.c) || lowerCase.equals(E0.B.e)) {
                    E0.b1(E0.B, tL_langPackDifference, i13, false, null);
                    return;
                }
                return;
            case 7:
                hd.E0().Z0(((np) obj2).currentAccount, ((TL_update.TL_updateLangPackTooLong) obj).lang_code, false, null);
                return;
            case 8:
                np npVar3 = (np) obj2;
                TLRPC.TL_config tL_config = (TLRPC.TL_config) obj;
                npVar3.getDownloadController().s(false);
                npVar3.R2(true);
                npVar3.M(true);
                npVar3.j4 = true;
                npVar3.Y2 = tL_config.megagroup_size_max;
                npVar3.W2 = tL_config.chat_size_max;
                npVar3.Z2 = tL_config.edit_time_limit;
                npVar3.a3 = tL_config.rating_e_decay;
                npVar3.e3 = tL_config.stickers_recent_limit;
                npVar3.b3 = tL_config.revoke_time_limit;
                npVar3.c3 = tL_config.revoke_pm_time_limit;
                npVar3.d3 = tL_config.revoke_pm_inbox;
                npVar3.k4 = tL_config.fpnv_allowed;
                String str2 = tL_config.me_url_prefix;
                npVar3.V2 = str2;
                boolean z10 = tL_config.force_try_ipv6;
                if (str2.endsWith("/")) {
                    npVar3.V2 = com.google.android.gms.internal.vision.e2.k(npVar3.V2, 1, 0);
                }
                if (npVar3.V2.startsWith("https://")) {
                    npVar3.V2 = npVar3.V2.substring(8);
                } else if (npVar3.V2.startsWith("http://")) {
                    npVar3.V2 = npVar3.V2.substring(7);
                }
                npVar3.h3 = tL_config.call_receive_timeout_ms;
                npVar3.i3 = tL_config.call_ring_timeout_ms;
                npVar3.j3 = tL_config.call_connect_timeout_ms;
                npVar3.k3 = tL_config.call_packet_timeout_ms;
                npVar3.u3 = tL_config.message_length_max;
                npVar3.v3 = tL_config.caption_length_max;
                npVar3.A3 = tL_config.preload_featured_stickers;
                String str3 = tL_config.gif_search_username;
                if (str3 != null) {
                    npVar3.L3 = str3;
                }
                if (npVar3.M3 != null) {
                    npVar3.M3 = tL_config.img_search_username;
                }
                npVar3.z3 = tL_config.blocked_mode;
                npVar3.N3 = tL_config.dc_txt_domain_name;
                npVar3.O3 = tL_config.webfile_dc_id;
                String str4 = tL_config.suggested_lang_code;
                if (str4 != null) {
                    String str5 = npVar3.P3;
                    boolean z11 = str5 == null || !str5.equals(str4);
                    npVar3.P3 = tL_config.suggested_lang_code;
                    if (z11) {
                        hd.E0().V0(npVar3.currentAccount, true);
                    }
                }
                org.telegram.ui.ActionBar.j6.m1(npVar3.currentAccount, false);
                org.telegram.ui.ActionBar.j6.G(false);
                if (tL_config.static_maps_provider == null) {
                    tL_config.static_maps_provider = "telegram";
                }
                npVar3.t3 = null;
                npVar3.n3 = 2;
                npVar3.o3 = 0;
                org.telegram.ui.Cells.y0.t(tL_config.static_maps_provider, new StringBuilder("map providers = "));
                String[] split = tL_config.static_maps_provider.split(",");
                for (int i14 = 0; i14 < split.length; i14++) {
                    String[] split2 = split[i14].split("\\+");
                    if (split2.length > 0) {
                        String[] split3 = split2[0].split(":");
                        if (split3.length > 0) {
                            if ("yandex".equals(split3[0])) {
                                if (i14 == 0) {
                                    if (split2.length > 1) {
                                        npVar3.n3 = 3;
                                    } else {
                                        npVar3.n3 = 1;
                                    }
                                }
                                npVar3.o3 |= 4;
                            } else if ("google".equals(split3[0])) {
                                if (i14 == 0 && split2.length > 1) {
                                    npVar3.n3 = 4;
                                }
                                npVar3.o3 |= 1;
                            } else if ("telegram".equals(split3[0])) {
                                if (i14 == 0) {
                                    npVar3.n3 = 2;
                                }
                                npVar3.o3 |= 2;
                            }
                            if (split3.length > 1) {
                                npVar3.t3 = split3[1];
                            }
                        }
                    }
                }
                SharedPreferences.Editor edit3 = npVar3.f7.edit();
                edit3.putBoolean("remoteConfigLoaded", npVar3.j4);
                edit3.putInt("maxGroupCount", npVar3.W2);
                edit3.putInt("maxMegagroupCount", npVar3.Y2);
                edit3.putInt("maxEditTime", npVar3.Z2);
                edit3.putInt("ratingDecay", npVar3.a3);
                edit3.putInt("maxRecentGifsCount", npVar3.g3);
                edit3.putInt("maxRecentStickersCount", npVar3.e3);
                edit3.putInt("maxFaveStickersCount", npVar3.f3);
                edit3.putInt("callReceiveTimeout", npVar3.h3);
                edit3.putInt("callRingTimeout", npVar3.i3);
                edit3.putInt("callConnectTimeout", npVar3.j3);
                edit3.putInt("callPacketTimeout", npVar3.k3);
                edit3.putString("linkPrefix", npVar3.V2);
                edit3.putInt("maxFolderPinnedDialogsCountDefault", npVar3.l3);
                edit3.putInt("maxFolderPinnedDialogsCountPremium", npVar3.m3);
                edit3.putInt("maxMessageLength", npVar3.u3);
                edit3.putInt("maxCaptionLength", npVar3.v3);
                edit3.putBoolean("preloadFeaturedStickers", npVar3.A3);
                edit3.putInt("revokeTimeLimit", npVar3.b3);
                edit3.putInt("revokeTimePmLimit", npVar3.c3);
                edit3.putInt("mapProvider", npVar3.n3);
                String str6 = npVar3.t3;
                if (str6 != null) {
                    edit3.putString("pk", str6);
                } else {
                    edit3.remove("pk");
                }
                edit3.putBoolean("canRevokePmInbox", npVar3.d3);
                edit3.putBoolean("fpnvAllowed", npVar3.k4);
                edit3.putBoolean("blockedCountry", npVar3.z3);
                edit3.putString("gifSearchBot", npVar3.L3);
                edit3.putString("imageSearchBot", npVar3.M3);
                edit3.putString("dcDomainName2", npVar3.N3);
                edit3.putInt("webFileDatacenterId", npVar3.O3);
                edit3.putString("suggestedLangCode", npVar3.P3);
                edit3.putBoolean("forceTryIpV6", z10);
                String str7 = tL_config.autologin_token;
                npVar3.g4 = str7;
                edit3.putString("autologinToken", str7);
                edit3.commit();
                npVar3.getConnectionsManager().setForceTryIpV6(z10);
                hd E02 = hd.E0();
                int i15 = npVar3.currentAccount;
                int i16 = tL_config.lang_pack_version;
                int i17 = tL_config.base_lang_pack_version;
                dd ddVar = E02.B;
                if (ddVar != null && (ddVar.i() || E02.B.j())) {
                    if (E02.B.g()) {
                        if (E02.B.i < i17) {
                            a8.b("LocaleController checkUpdateForCurrentRemoteLocale base version is out of date, applying (local is " + E02.B.i + ", remote is " + i17 + ")");
                            E02.P = true;
                            dd ddVar2 = E02.B;
                            E02.f(ddVar2, ddVar2.e, false, i15, new uc(E02, i15, 0));
                        } else {
                            a8.b("LocaleController checkUpdateForCurrentRemoteLocale base version is up to date (local is " + E02.B.i + ", remote is " + i17 + ")");
                        }
                    }
                    if (E02.B.h < i16) {
                        a8.b("LocaleController checkUpdateForCurrentRemoteLocale version is out of date, applying (local is " + E02.B.h + ", remote is " + i16 + ")");
                        E02.P = true;
                        dd ddVar3 = E02.B;
                        E02.f(ddVar3, ddVar3.c, false, i15, new uc(E02, i15, 1));
                    } else {
                        a8.b("LocaleController checkUpdateForCurrentRemoteLocale version is up to date (local is " + E02.B.h + ", remote is " + i16 + ")");
                    }
                }
                npVar3.getNotificationCenter().k(ns.J2, new Object[0]);
                return;
            case 9:
                np npVar4 = (np) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                npVar4.Y3(tL_messages_invitedUsers.updates.users, false);
                npVar4.S3(tL_messages_invitedUsers.updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList3 = tL_messages_invitedUsers.updates.chats;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    npVar4.getNotificationCenter().k(29, new Object[0]);
                    return;
                } else {
                    npVar4.getNotificationCenter().k(28, Long.valueOf(tL_messages_invitedUsers.updates.chats.get(0).id));
                    org.telegram.ui.Components.t4.f(npVar4.currentAccount, tL_messages_invitedUsers.updates.chats.get(0), tL_messages_invitedUsers);
                    return;
                }
            case 10:
                vr vrVar = (vr) obj2;
                gj gjVar = (gj) obj;
                vrVar.getClass();
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(gjVar.k.getObjectSize());
                    gjVar.k.serializeToStream(nativeByteBuffer);
                    int i18 = gjVar.a == 2 ? 1 : 0;
                    if (gjVar.f) {
                        i18 |= 2;
                    }
                    SQLitePreparedStatement executeFast2 = vrVar.b.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    executeFast2.bindLong(1, gj.B0(gjVar.k));
                    executeFast2.bindInteger(2, gjVar.e1());
                    executeFast2.bindLong(3, gjVar.k.random_id);
                    executeFast2.bindInteger(4, gjVar.k.date);
                    executeFast2.bindByteBuffer(5, nativeByteBuffer);
                    CharSequence charSequence = gjVar.v;
                    if (charSequence == null) {
                        executeFast2.bindNull(6);
                    } else {
                        executeFast2.bindString(6, charSequence.toString());
                    }
                    String str8 = gjVar.b;
                    if (str8 == null) {
                        executeFast2.bindNull(7);
                    } else {
                        executeFast2.bindString(7, str8);
                    }
                    String str9 = gjVar.c;
                    if (str9 == null) {
                        executeFast2.bindNull(8);
                    } else {
                        executeFast2.bindString(8, str9);
                    }
                    executeFast2.bindInteger(9, i18);
                    executeFast2.bindLong(10, gj.b2(vrVar.currentAccount, gjVar.k, false, false));
                    executeFast2.bindInteger(11, (gjVar.I ? 1 : 0) + (gjVar.J ? 1 : 0));
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                    executeFast2.dispose();
                    return;
                } catch (Exception e12) {
                    vrVar.o(e12, true);
                    return;
                }
            case 11:
                di.v8.y(((ez) obj2).currentAccount, false).d0((ArrayList) obj);
                return;
            case 12:
                h00 h00Var = (h00) obj2;
                HashMap hashMap = (HashMap) obj;
                HashSet hashSet = new HashSet();
                for (ur urVar : hashMap.keySet()) {
                    int intValue = ((Integer) hashMap.get(urVar)).intValue();
                    TLRPC.TL_forumTopic f11 = h00Var.f(-urVar.a, urVar.b);
                    if (f11 != null) {
                        f11.read_outbox_max_id = Math.max(f11.read_outbox_max_id, intValue);
                        hashSet.add(Long.valueOf(-urVar.a));
                        TLRPC.Message message2 = f11.topMessage;
                        if (message2 != null && f11.read_outbox_max_id >= message2.id) {
                            message2.unread = false;
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ns.f(h00Var.currentAccount).k(ns.q5, (Long) it2.next(), Boolean.TRUE);
                }
                return;
            case 13:
                h00 h00Var2 = (h00) obj2;
                List list2 = (List) obj;
                a0.h hVar = h00Var2.e;
                HashSet hashSet2 = new HashSet();
                a0.h hVar2 = null;
                for (int i19 = 0; i19 < list2.size(); i19++) {
                    f00 f00Var = (f00) list2.get(i19);
                    if (f00Var.i) {
                        if (hVar2 == null) {
                            hVar2 = new a0.h();
                        }
                        ArrayList arrayList4 = (ArrayList) hVar2.f(f00Var.b);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            hVar2.k(arrayList4, f00Var.b);
                        }
                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                        if (t3.o0(h00Var2.currentAccount, f00Var.b)) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_forumTopic.from_id = tL_peerUser;
                            tL_peerUser.user_id = f00Var.c;
                        } else {
                            tL_forumTopic.id = (int) f00Var.c;
                        }
                        arrayList4.add(tL_forumTopic);
                    } else {
                        TLRPC.TL_forumTopic f12 = h00Var2.f(-f00Var.b, f00Var.c);
                        if (f12 != null) {
                            if (f00Var.j) {
                                int i20 = f00Var.e;
                                if (i20 >= 0) {
                                    f12.unread_count = i20;
                                }
                                int i21 = f00Var.d;
                                if (i21 >= 0) {
                                    f12.unread_mentions_count = i21;
                                }
                            } else {
                                hVar.l(h00.p(f12.top_message, -f00Var.b));
                                f12.topMessage = f00Var.g;
                                f12.groupedMessages = f00Var.h;
                                int i22 = f00Var.f;
                                f12.top_message = i22;
                                f12.unread_count = f00Var.e;
                                f12.unread_mentions_count = f00Var.d;
                                hVar.k(f12, h00.p(i22, -f00Var.b));
                            }
                            int i23 = f00Var.a;
                            if (i23 > 0) {
                                f12.totalMessagesCount = i23;
                            }
                            hashSet2.add(Long.valueOf(-f00Var.b));
                        }
                        if (f12 != null && f00Var.k) {
                            f12.totalMessagesCount = 0;
                            h00Var2.k(f00Var.b, f00Var.c);
                        }
                    }
                }
                Iterator it3 = hashSet2.iterator();
                while (it3.hasNext()) {
                    h00Var2.y(((Long) it3.next()).longValue(), true);
                }
                if (hVar2 != null) {
                    for (int i24 = 0; i24 < hVar2.m(); i24++) {
                        h00Var2.v(-hVar2.j(i24), (ArrayList) hVar2.n(i24), null);
                    }
                    return;
                }
                return;
            case 14:
                h00 h00Var3 = (h00) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                h00Var3.getClass();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var.getContext());
                String M0 = hd.M0(2131748978, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = hd.a0(null, null, 2131748948, Integer.valueOf(np.s1(h00Var3.currentAccount).e5));
                alertDialog$Builder.k(hd.M0(2131747831, null), null);
                e2Var.showDialog(t1Var);
                return;
            case 15:
                h1 h1Var = (h1) obj2;
                File file = (File) obj;
                if (file == null) {
                    h1Var.j = false;
                    ns.e().k(ns.Q4, new Object[0]);
                    return;
                }
                if (!TextUtils.isEmpty(h1Var.d)) {
                    try {
                        new File(h1Var.d).delete();
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                }
                h1Var.d = file.getAbsolutePath();
                h1Var.f();
                h1Var.k = 1.0f;
                h1Var.j = false;
                ns.e().k(ns.Q4, new Object[0]);
                return;
            case 16:
                v1 v1Var = (v1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i25 = v1Var.a;
                if (tLObject2 instanceof TL_account.contactBirthdays) {
                    v1Var.b = System.currentTimeMillis();
                    TL_account.contactBirthdays contactbirthdays = (TL_account.contactBirthdays) tLObject2;
                    v1Var.c = t1.b(contactbirthdays);
                    np.s1(i25).Y3(contactbirthdays.users, false);
                    vr.a0(i25).m1(contactbirthdays.users, null, true, true);
                    SharedPreferences.Editor edit4 = np.s1(i25).f7.edit();
                    edit4.putLong("bday_check", v1Var.b);
                    u1 u1Var = new u1();
                    u1Var.a = contactbirthdays.contacts;
                    SerializedData serializedData = new SerializedData(u1Var.getObjectSize());
                    u1Var.serializeToStream(serializedData);
                    edit4.putString("bday_contacts", Utilities.f(serializedData.toByteArray()));
                    edit4.apply();
                    ns.f(i25).k(ns.g5, new Object[0]);
                    v1Var.e = false;
                    return;
                }
                return;
            case 17:
                ((i3) obj2).a.getMessagesController().P1().k.j((ArrayList) obj);
                return;
            case 18:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj;
                try {
                    try {
                        fileInputStream = new FileInputStream((File) obj2);
                    } catch (Exception e14) {
                        e = e14;
                        r52 = 0;
                        r72 = 0;
                        a8.g(e, true);
                        bitmap = r52;
                        arrayList = r72;
                        g0.h3(new b4(21, n3Var, bitmap != null ? new gg.a(bitmap, 1, arrayList) : null));
                        return;
                    }
                } catch (Exception e15) {
                    e = e15;
                    a8.g(e, true);
                    bitmap = r52;
                    arrayList = r72;
                    g0.h3(new b4(21, n3Var, bitmap != null ? new gg.a(bitmap, 1, arrayList) : null));
                    return;
                }
                try {
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
                        try {
                            ArrayList arrayList5 = new ArrayList(1);
                            Bitmap d = c8.f0.d(gZIPInputStream, arrayList5);
                            try {
                                int size = arrayList5.size();
                                ArrayList arrayList6 = null;
                                int i26 = 0;
                                while (i26 < size) {
                                    try {
                                        Object obj3 = arrayList5.get(i26);
                                        i26++;
                                        String str10 = (String) obj3;
                                        if (str10.startsWith("patterns = ")) {
                                            byte[] v = Utilities.v(str10.substring(i10));
                                            int length = v.length / 52;
                                            SerializedData serializedData2 = new SerializedData(v);
                                            ArrayList arrayList7 = new ArrayList(length);
                                            for (int i27 = 0; i27 < length; i27++) {
                                                try {
                                                    arrayList7.add(gg.c.a(serializedData2));
                                                } catch (Throwable th4) {
                                                    th3 = th4;
                                                    r73 = arrayList7;
                                                    r53 = d;
                                                    try {
                                                        gZIPInputStream.close();
                                                        throw th3;
                                                    } catch (Throwable th5) {
                                                        th3.addSuppressed(th5);
                                                        throw th3;
                                                    }
                                                }
                                            }
                                            serializedData2.cleanup();
                                            arrayList6 = arrayList7;
                                        }
                                        i10 = 11;
                                        arrayList6 = arrayList6;
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                        r53 = d;
                                        r73 = arrayList6;
                                    }
                                }
                                gZIPInputStream.close();
                                fileInputStream.close();
                                bitmap = d;
                                arrayList = arrayList6;
                                g0.h3(new b4(21, n3Var, bitmap != null ? new gg.a(bitmap, 1, arrayList) : null));
                                return;
                            } catch (Throwable th7) {
                                th3 = th7;
                                r73 = 0;
                                r53 = d;
                            }
                        } catch (Throwable th8) {
                            th3 = th8;
                            r53 = 0;
                            r73 = 0;
                        }
                    } catch (Throwable th9) {
                        th2 = th9;
                        r52 = 0;
                        r72 = 0;
                        try {
                            fileInputStream.close();
                            throw th2;
                        } catch (Throwable th10) {
                            th2.addSuppressed(th10);
                            throw th2;
                        }
                    }
                } catch (Throwable th11) {
                    th2 = th11;
                    r52 = r53;
                    r72 = r73;
                    fileInputStream.close();
                    throw th2;
                }
            case 19:
                ((ResultCallback) obj2).onError((TLRPC.TL_error) obj);
                return;
            case 20:
                ((j1) obj2).onComplete((Bitmap) obj);
                return;
            case 21:
                ((org.telegram.ui.ActionBar.n3) obj2).a((gg.a) obj);
                return;
            case 22:
                ((org.telegram.ui.Components.bp) obj2).onError((TLRPC.TL_error) obj);
                return;
            case 23:
                l2.q1 q1Var = ((d4) obj2).f;
                q1Var.b = System.currentTimeMillis();
                q1Var.c = true;
                ((org.telegram.ui.Components.bp) obj).onComplete(null);
                return;
            case 24:
                Bitmap bitmap2 = (Bitmap) obj;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream((File) obj2);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e16) {
                    a8.g(e16, true);
                    return;
                }
            case 25:
                File file2 = (File) obj2;
                j1 j1Var = (j1) obj;
                try {
                    if (file2.exists()) {
                        r8 = BitmapFactory.decodeFile(file2.getAbsolutePath());
                    }
                } catch (Exception e17) {
                    a8.g(e17, true);
                }
                g0.h3(new b4(20, j1Var, r8));
                return;
            case 26:
                g5 g5Var2 = (g5) obj2;
                g5Var2.getClass();
                g5Var2.j(((Long) obj).longValue());
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                ((g5) obj2).a((TLRPC.User) obj);
                return;
        }
    }
}
