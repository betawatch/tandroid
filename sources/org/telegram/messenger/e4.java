package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        Account[] accountArr;
        i5 i5Var = (i5) this.b;
        tu0 tu0Var = (tu0) this.c;
        AccountManager accountManager = AccountManager.get(w0.b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            i5Var.a = null;
            int i10 = 0;
            while (i10 < accountsByType.length) {
                Account account = accountsByType[i10];
                int i11 = 0;
                while (true) {
                    if (i11 >= 4) {
                        accountArr = accountsByType;
                        break;
                    }
                    TLRPC.User f7 = e20.i(i11).f();
                    if (f7 != null) {
                        String str = account.name;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        accountArr = accountsByType;
                        sb2.append(f7.id);
                        if (str.equals(sb2.toString())) {
                            accountManager.removeAccount(account, null, null);
                            break;
                        }
                    } else {
                        accountArr = accountsByType;
                    }
                    i11++;
                    accountsByType = accountArr;
                }
                i10++;
                accountsByType = accountArr;
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + i5Var.getUserConfig().e(), "org.telegram.messenger");
            i5Var.a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        i5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        i5Var.getMessagesStorage().c1(new ArrayList(), true);
        i5Var.a0.clear();
        i5Var.e0.clear();
        i5Var.f0.clear();
        i5Var.g0.clear();
        i5Var.i0.clear();
        i5Var.h0.clear();
        i5Var.b0.clear();
        i5Var.c0.clear();
        i5Var.d0.clear();
        i5Var.x.clear();
        i5Var.j0.clear();
        i5Var.k0.clear();
        i5Var.l0.clear();
        i5Var.getNotificationCenter().k(at.O, new Object[0]);
        i5Var.A(0L, false);
        tu0Var.run();
    }

    private final void b() {
        ((i5) this.b).a((TLRPC.User) this.c);
    }

    private final void c() {
        i5 i5Var = (i5) this.b;
        SparseArray sparseArray = (SparseArray) this.c;
        if (i5Var.s) {
            return;
        }
        i5Var.s = true;
        HashMap hashMap = new HashMap();
        HashMap H = i5Var.H();
        HashMap hashMap2 = new HashMap();
        Iterator it = H.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f5 f5Var = (f5) ((Map.Entry) it.next()).getValue();
            for (int i10 = 0; i10 < f5Var.g.size(); i10++) {
                hashMap2.put((String) f5Var.g.get(i10), f5Var.b);
            }
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            f5 f5Var2 = (f5) sparseArray.valueAt(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= f5Var2.g.size()) {
                    break;
                }
                String str = (String) hashMap2.get((String) f5Var2.g.get(i12));
                if (str != null) {
                    f5Var2.b = str;
                    hashMap.put(str, f5Var2);
                    break;
                }
                i12++;
            }
        }
        if (v2.a) {
            f8.b("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
        }
        i5Var.getMessagesStorage().Z0(hashMap, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b3  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v43 */
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
        int i10 = this.a;
        int i11 = 11;
        ?? r52 = 4;
        ?? r53 = 4;
        ?? r72 = 2;
        ?? r73 = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                at f7 = at.f(((g4) obj2).currentAccount);
                Boolean bool = Boolean.FALSE;
                f7.k(30, (TLRPC.ChatFull) obj, 0, bool, bool);
                return;
            case 1:
                i5 i5Var = (i5) obj2;
                i5Var.D = false;
                SharedPreferences.Editor edit = wp.r1(i5Var.currentAccount).f7.edit();
                String str = ((TLRPC.TL_help_inviteText) obj).message;
                i5Var.y = str;
                edit.putString("invitelink", str);
                edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
                edit.commit();
                return;
            case 2:
                b6 b6Var = (b6) obj2;
                TLObject tLObject = (TLObject) obj;
                a6 a6Var = b6Var.O;
                a6 a6Var2 = b6Var.N;
                a6 a6Var3 = b6Var.M;
                a6 a6Var4 = b6Var.L;
                a6 a6Var5 = b6Var.K;
                a6 a6Var6 = b6Var.J;
                b6Var.E = false;
                b6Var.getUserConfig().a0 = System.currentTimeMillis();
                b6Var.getUserConfig().v(false);
                if (tLObject != null) {
                    TL_account.autoDownloadSettings autodownloadsettings = (TL_account.autoDownloadSettings) tLObject;
                    a6Var6.d(autodownloadsettings.low);
                    a6Var6.e = false;
                    a6Var5.d(autodownloadsettings.medium);
                    a6Var4.d(autodownloadsettings.high);
                    int i12 = 0;
                    while (i12 < 3) {
                        a6 a6Var7 = i12 == 0 ? a6Var3 : i12 == 1 ? a6Var2 : a6Var;
                        if (a6Var7.a(a6Var6)) {
                            a6Var7.d(autodownloadsettings.low);
                            a6Var7.e = false;
                        } else if (a6Var7.a(a6Var5)) {
                            a6Var7.d(autodownloadsettings.medium);
                        } else if (a6Var7.a(a6Var4)) {
                            a6Var7.d(autodownloadsettings.high);
                        }
                        i12++;
                    }
                    SharedPreferences.Editor edit2 = wp.r1(b6Var.currentAccount).f7.edit();
                    edit2.putString("mobilePreset", a6Var3.toString());
                    edit2.putString("wifiPreset", a6Var2.toString());
                    edit2.putString("roamingPreset", a6Var.toString());
                    edit2.putString("preset0", a6Var6.toString());
                    edit2.putString("preset1", a6Var5.toString());
                    edit2.putString("preset2", a6Var4.toString());
                    edit2.commit();
                    a6Var6.toString();
                    a6Var5.toString();
                    a6Var4.toString();
                    b6Var.g();
                    return;
                }
                return;
            case 3:
                b6 b6Var2 = (b6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                try {
                    SQLitePreparedStatement executeFast = b6Var2.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        executeFast.requery();
                        executeFast.bindInteger(1, ((kj) arrayList2.get(i13)).F0().dc_id);
                        executeFast.bindLong(2, ((kj) arrayList2.get(i13)).F0().id);
                        executeFast.step();
                        try {
                            b8.G(b6Var2.currentAccount);
                            b8.N(((kj) arrayList2.get(i13)).k, false, true).delete();
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                    executeFast.dispose();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 4:
                wp.r1(((y9) obj2).currentAccount).L3(((TLRPC.TL_payments_paymentResult) obj).updates, false);
                return;
            case 5:
                wp wpVar = (wp) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                rz sendMessagesHelper = wpVar.getSendMessagesHelper();
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
                        org.telegram.ui.Wallet.k0.x(wpVar.currentAccount).g.o(message.id, tL_messageActionWalletTonConnectRequest.session_id);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                wp wpVar2 = (wp) obj2;
                TLRPC.TL_config tL_config = (TLRPC.TL_config) obj;
                wpVar2.getDownloadController().s(false);
                wpVar2.P2(true);
                wpVar2.M(true);
                wpVar2.k4 = true;
                wpVar2.X2 = tL_config.megagroup_size_max;
                wpVar2.V2 = tL_config.chat_size_max;
                wpVar2.Y2 = tL_config.edit_time_limit;
                wpVar2.Z2 = tL_config.rating_e_decay;
                wpVar2.d3 = tL_config.stickers_recent_limit;
                wpVar2.a3 = tL_config.revoke_time_limit;
                wpVar2.b3 = tL_config.revoke_pm_time_limit;
                wpVar2.c3 = tL_config.revoke_pm_inbox;
                String str2 = tL_config.me_url_prefix;
                wpVar2.U2 = str2;
                boolean z10 = tL_config.force_try_ipv6;
                if (str2.endsWith("/")) {
                    wpVar2.U2 = c3.i0.m(1, 0, wpVar2.U2);
                }
                if (wpVar2.U2.startsWith("https://")) {
                    wpVar2.U2 = wpVar2.U2.substring(8);
                } else if (wpVar2.U2.startsWith("http://")) {
                    wpVar2.U2 = wpVar2.U2.substring(7);
                }
                wpVar2.g3 = tL_config.call_receive_timeout_ms;
                wpVar2.h3 = tL_config.call_ring_timeout_ms;
                wpVar2.i3 = tL_config.call_connect_timeout_ms;
                wpVar2.j3 = tL_config.call_packet_timeout_ms;
                wpVar2.t3 = tL_config.message_length_max;
                wpVar2.u3 = tL_config.caption_length_max;
                wpVar2.z3 = tL_config.preload_featured_stickers;
                String str3 = tL_config.venue_search_username;
                if (str3 != null) {
                    wpVar2.K3 = str3;
                }
                String str4 = tL_config.gif_search_username;
                if (str4 != null) {
                    wpVar2.M3 = str4;
                }
                if (wpVar2.N3 != null) {
                    wpVar2.N3 = tL_config.img_search_username;
                }
                wpVar2.y3 = tL_config.blocked_mode;
                wpVar2.O3 = tL_config.dc_txt_domain_name;
                wpVar2.P3 = tL_config.webfile_dc_id;
                String str5 = tL_config.suggested_lang_code;
                if (str5 != null) {
                    String str6 = wpVar2.Q3;
                    boolean z11 = str6 == null || !str6.equals(str5);
                    wpVar2.Q3 = tL_config.suggested_lang_code;
                    if (z11) {
                        dd.D0().S0(wpVar2.currentAccount, true);
                    }
                }
                org.telegram.ui.ActionBar.t6.m1(wpVar2.currentAccount, false);
                org.telegram.ui.ActionBar.t6.G(false);
                if (tL_config.static_maps_provider == null) {
                    tL_config.static_maps_provider = "telegram";
                }
                wpVar2.s3 = null;
                wpVar2.m3 = 2;
                wpVar2.n3 = 0;
                a1.g.z(tL_config.static_maps_provider, new StringBuilder("map providers = "));
                String[] split = tL_config.static_maps_provider.split(",");
                for (int i14 = 0; i14 < split.length; i14++) {
                    String[] split2 = split[i14].split("\\+");
                    if (split2.length > 0) {
                        String[] split3 = split2[0].split(":");
                        if (split3.length > 0) {
                            if ("yandex".equals(split3[0])) {
                                if (i14 == 0) {
                                    if (split2.length > 1) {
                                        wpVar2.m3 = 3;
                                    } else {
                                        wpVar2.m3 = 1;
                                    }
                                }
                                wpVar2.n3 |= 4;
                            } else if ("google".equals(split3[0])) {
                                if (i14 == 0 && split2.length > 1) {
                                    wpVar2.m3 = 4;
                                }
                                wpVar2.n3 |= 1;
                            } else if ("telegram".equals(split3[0])) {
                                if (i14 == 0) {
                                    wpVar2.m3 = 2;
                                }
                                wpVar2.n3 |= 2;
                            }
                            if (split3.length > 1) {
                                wpVar2.s3 = split3[1];
                            }
                        }
                    }
                }
                SharedPreferences.Editor edit3 = wpVar2.f7.edit();
                edit3.putBoolean("remoteConfigLoaded", wpVar2.k4);
                edit3.putInt("maxGroupCount", wpVar2.V2);
                edit3.putInt("maxMegagroupCount", wpVar2.X2);
                edit3.putInt("maxEditTime", wpVar2.Y2);
                edit3.putInt("ratingDecay", wpVar2.Z2);
                edit3.putInt("maxRecentGifsCount", wpVar2.f3);
                edit3.putInt("maxRecentStickersCount", wpVar2.d3);
                edit3.putInt("maxFaveStickersCount", wpVar2.e3);
                edit3.putInt("callReceiveTimeout", wpVar2.g3);
                edit3.putInt("callRingTimeout", wpVar2.h3);
                edit3.putInt("callConnectTimeout", wpVar2.i3);
                edit3.putInt("callPacketTimeout", wpVar2.j3);
                edit3.putString("linkPrefix", wpVar2.U2);
                edit3.putInt("maxFolderPinnedDialogsCountDefault", wpVar2.k3);
                edit3.putInt("maxFolderPinnedDialogsCountPremium", wpVar2.l3);
                edit3.putInt("maxMessageLength", wpVar2.t3);
                edit3.putInt("maxCaptionLength", wpVar2.u3);
                edit3.putBoolean("preloadFeaturedStickers", wpVar2.z3);
                edit3.putInt("revokeTimeLimit", wpVar2.a3);
                edit3.putInt("revokeTimePmLimit", wpVar2.b3);
                edit3.putInt("mapProvider", wpVar2.m3);
                String str7 = wpVar2.s3;
                if (str7 != null) {
                    edit3.putString("pk", str7);
                } else {
                    edit3.remove("pk");
                }
                edit3.putBoolean("canRevokePmInbox", wpVar2.c3);
                edit3.putBoolean("blockedCountry", wpVar2.y3);
                edit3.putString("venueSearchBot", wpVar2.K3);
                edit3.putString("gifSearchBot", wpVar2.M3);
                edit3.putString("imageSearchBot", wpVar2.N3);
                edit3.putString("dcDomainName2", wpVar2.O3);
                edit3.putInt("webFileDatacenterId", wpVar2.P3);
                edit3.putString("suggestedLangCode", wpVar2.Q3);
                edit3.putBoolean("forceTryIpV6", z10);
                String str8 = tL_config.autologin_token;
                wpVar2.h4 = str8;
                edit3.putString("autologinToken", str8);
                edit3.commit();
                wpVar2.getConnectionsManager().setForceTryIpV6(z10);
                dd D0 = dd.D0();
                int i15 = wpVar2.currentAccount;
                int i16 = tL_config.lang_pack_version;
                int i17 = tL_config.base_lang_pack_version;
                ad adVar = D0.B;
                if (adVar != null && (adVar.i() || D0.B.j())) {
                    if (D0.B.g()) {
                        if (D0.B.i < i17) {
                            f8.b("LocaleController checkUpdateForCurrentRemoteLocale base version is out of date, applying (local is " + D0.B.i + ", remote is " + i17 + ")");
                            D0.P = true;
                            ad adVar2 = D0.B;
                            D0.f(adVar2, adVar2.e, false, i15, new wc(D0, i15, 0));
                        } else {
                            f8.b("LocaleController checkUpdateForCurrentRemoteLocale base version is up to date (local is " + D0.B.i + ", remote is " + i17 + ")");
                        }
                    }
                    if (D0.B.h < i16) {
                        f8.b("LocaleController checkUpdateForCurrentRemoteLocale version is out of date, applying (local is " + D0.B.h + ", remote is " + i16 + ")");
                        D0.P = true;
                        ad adVar3 = D0.B;
                        D0.f(adVar3, adVar3.c, false, i15, new wc(D0, i15, 1));
                    } else {
                        f8.b("LocaleController checkUpdateForCurrentRemoteLocale version is up to date (local is " + D0.B.h + ", remote is " + i16 + ")");
                    }
                }
                wpVar2.getNotificationCenter().k(at.J2, new Object[0]);
                return;
            case 7:
                wp wpVar3 = (wp) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                wpVar3.V3(tL_messages_invitedUsers.updates.users, false);
                wpVar3.P3(tL_messages_invitedUsers.updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList3 = tL_messages_invitedUsers.updates.chats;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    wpVar3.getNotificationCenter().k(29, new Object[0]);
                    return;
                } else {
                    wpVar3.getNotificationCenter().k(28, Long.valueOf(tL_messages_invitedUsers.updates.chats.get(0).id));
                    org.telegram.ui.Components.s4.f(wpVar3.currentAccount, tL_messages_invitedUsers.updates.chats.get(0), tL_messages_invitedUsers);
                    return;
                }
            case 8:
                is isVar = (is) obj2;
                kj kjVar = (kj) obj;
                isVar.getClass();
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(kjVar.k.getObjectSize());
                    kjVar.k.serializeToStream(nativeByteBuffer);
                    int i18 = kjVar.a == 2 ? 1 : 0;
                    if (kjVar.f) {
                        i18 |= 2;
                    }
                    SQLitePreparedStatement executeFast2 = isVar.b.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    executeFast2.bindLong(1, kj.B0(kjVar.k));
                    executeFast2.bindInteger(2, kjVar.f1());
                    executeFast2.bindLong(3, kjVar.k.random_id);
                    executeFast2.bindInteger(4, kjVar.k.date);
                    executeFast2.bindByteBuffer(5, nativeByteBuffer);
                    CharSequence charSequence = kjVar.v;
                    if (charSequence == null) {
                        executeFast2.bindNull(6);
                    } else {
                        executeFast2.bindString(6, charSequence.toString());
                    }
                    String str9 = kjVar.b;
                    if (str9 == null) {
                        executeFast2.bindNull(7);
                    } else {
                        executeFast2.bindString(7, str9);
                    }
                    String str10 = kjVar.c;
                    if (str10 == null) {
                        executeFast2.bindNull(8);
                    } else {
                        executeFast2.bindString(8, str10);
                    }
                    executeFast2.bindInteger(9, i18);
                    executeFast2.bindLong(10, kj.c2(isVar.currentAccount, kjVar.k, false, false));
                    executeFast2.bindInteger(11, (kjVar.I ? 1 : 0) + (kjVar.J ? 1 : 0));
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                    executeFast2.dispose();
                    return;
                } catch (Exception e10) {
                    isVar.o(e10, true);
                    return;
                }
            case 9:
                rh.e6.y(((rz) obj2).currentAccount, false).d0((ArrayList) obj);
                return;
            case 10:
                y00 y00Var = (y00) obj2;
                HashMap hashMap = (HashMap) obj;
                HashSet hashSet = new HashSet();
                for (hs hsVar : hashMap.keySet()) {
                    int intValue = ((Integer) hashMap.get(hsVar)).intValue();
                    TLRPC.TL_forumTopic f10 = y00Var.f(-hsVar.a, hsVar.b);
                    if (f10 != null) {
                        f10.read_outbox_max_id = Math.max(f10.read_outbox_max_id, intValue);
                        hashSet.add(Long.valueOf(-hsVar.a));
                        TLRPC.Message message2 = f10.topMessage;
                        if (message2 != null && f10.read_outbox_max_id >= message2.id) {
                            message2.unread = false;
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    at.f(y00Var.currentAccount).k(at.q5, (Long) it2.next(), Boolean.TRUE);
                }
                return;
            case 11:
                y00 y00Var2 = (y00) obj2;
                List list2 = (List) obj;
                a0.h hVar = y00Var2.e;
                HashSet hashSet2 = new HashSet();
                a0.h hVar2 = null;
                for (int i19 = 0; i19 < list2.size(); i19++) {
                    w00 w00Var = (w00) list2.get(i19);
                    if (w00Var.i) {
                        if (hVar2 == null) {
                            hVar2 = new a0.h();
                        }
                        ArrayList arrayList4 = (ArrayList) hVar2.f(w00Var.b);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            hVar2.k(arrayList4, w00Var.b);
                        }
                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                        if (w3.o0(y00Var2.currentAccount, w00Var.b)) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_forumTopic.from_id = tL_peerUser;
                            tL_peerUser.user_id = w00Var.c;
                        } else {
                            tL_forumTopic.id = (int) w00Var.c;
                        }
                        arrayList4.add(tL_forumTopic);
                    } else {
                        TLRPC.TL_forumTopic f11 = y00Var2.f(-w00Var.b, w00Var.c);
                        if (f11 != null) {
                            if (w00Var.j) {
                                int i20 = w00Var.e;
                                if (i20 >= 0) {
                                    f11.unread_count = i20;
                                }
                                int i21 = w00Var.d;
                                if (i21 >= 0) {
                                    f11.unread_mentions_count = i21;
                                }
                            } else {
                                hVar.l(y00.p(f11.top_message, -w00Var.b));
                                f11.topMessage = w00Var.g;
                                f11.groupedMessages = w00Var.h;
                                int i22 = w00Var.f;
                                f11.top_message = i22;
                                f11.unread_count = w00Var.e;
                                f11.unread_mentions_count = w00Var.d;
                                hVar.k(f11, y00.p(i22, -w00Var.b));
                            }
                            int i23 = w00Var.a;
                            if (i23 > 0) {
                                f11.totalMessagesCount = i23;
                            }
                            hashSet2.add(Long.valueOf(-w00Var.b));
                        }
                        if (f11 != null && w00Var.k) {
                            f11.totalMessagesCount = 0;
                            y00Var2.k(w00Var.b, w00Var.c);
                        }
                    }
                }
                Iterator it3 = hashSet2.iterator();
                while (it3.hasNext()) {
                    y00Var2.y(((Long) it3.next()).longValue(), true);
                }
                if (hVar2 != null) {
                    for (int i24 = 0; i24 < hVar2.m(); i24++) {
                        y00Var2.v(-hVar2.j(i24), (ArrayList) hVar2.n(i24), null);
                    }
                    return;
                }
                return;
            case 12:
                y00 y00Var3 = (y00) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                y00Var3.getClass();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getContext());
                String L0 = dd.L0(2131748988, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = dd.a0(null, null, 2131748958, Integer.valueOf(wp.r1(y00Var3.currentAccount).e5));
                alertDialog$Builder.k(dd.L0(2131747847, null), null);
                k2Var.showDialog(x1Var);
                return;
            case 13:
                k1 k1Var = (k1) obj2;
                File file = (File) obj;
                if (file == null) {
                    k1Var.j = false;
                    at.e().k(at.Q4, new Object[0]);
                    return;
                }
                if (!TextUtils.isEmpty(k1Var.d)) {
                    try {
                        new File(k1Var.d).delete();
                    } catch (Exception e11) {
                        f8.g(e11, true);
                    }
                }
                k1Var.d = file.getAbsolutePath();
                k1Var.f();
                k1Var.k = 1.0f;
                k1Var.j = false;
                at.e().k(at.Q4, new Object[0]);
                return;
            case 14:
                y1 y1Var = (y1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i25 = y1Var.a;
                if (tLObject2 instanceof TL_account.contactBirthdays) {
                    y1Var.b = System.currentTimeMillis();
                    TL_account.contactBirthdays contactbirthdays = (TL_account.contactBirthdays) tLObject2;
                    y1Var.c = w1.b(contactbirthdays);
                    wp.r1(i25).V3(contactbirthdays.users, false);
                    is.a0(i25).m1(contactbirthdays.users, null, true, true);
                    SharedPreferences.Editor edit4 = wp.r1(i25).f7.edit();
                    edit4.putLong("bday_check", y1Var.b);
                    x1 x1Var2 = new x1();
                    x1Var2.a = contactbirthdays.contacts;
                    SerializedData serializedData = new SerializedData(x1Var2.getObjectSize());
                    x1Var2.serializeToStream(serializedData);
                    edit4.putString("bday_contacts", Utilities.f(serializedData.toByteArray()));
                    edit4.apply();
                    at.f(i25).k(at.g5, new Object[0]);
                    y1Var.e = false;
                    return;
                }
                return;
            case 15:
                ((l3) obj2).a.getMessagesController().O1().k.j((ArrayList) obj);
                return;
            case 16:
                org.telegram.ui.ActionBar.v3 v3Var = (org.telegram.ui.ActionBar.v3) obj;
                try {
                    try {
                        fileInputStream = new FileInputStream((File) obj2);
                    } catch (Exception e12) {
                        e = e12;
                        r52 = 0;
                        r72 = 0;
                        f8.g(e, true);
                        bitmap = r52;
                        arrayList = r72;
                        i0.g3(new e4(19, v3Var, bitmap != null ? new wf.a(bitmap, 1, arrayList) : null));
                        return;
                    }
                } catch (Exception e13) {
                    e = e13;
                    f8.g(e, true);
                    bitmap = r52;
                    arrayList = r72;
                    i0.g3(new e4(19, v3Var, bitmap != null ? new wf.a(bitmap, 1, arrayList) : null));
                    return;
                }
                try {
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
                        try {
                            ArrayList arrayList5 = new ArrayList(1);
                            Bitmap d = w7.a9.d(gZIPInputStream, arrayList5);
                            try {
                                int size = arrayList5.size();
                                ArrayList arrayList6 = null;
                                int i26 = 0;
                                while (i26 < size) {
                                    try {
                                        Object obj3 = arrayList5.get(i26);
                                        i26++;
                                        String str11 = (String) obj3;
                                        if (str11.startsWith("patterns = ")) {
                                            byte[] v = Utilities.v(str11.substring(i11));
                                            int length = v.length / 52;
                                            SerializedData serializedData2 = new SerializedData(v);
                                            ArrayList arrayList7 = new ArrayList(length);
                                            for (int i27 = 0; i27 < length; i27++) {
                                                try {
                                                    arrayList7.add(wf.c.a(serializedData2));
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
                                        i11 = 11;
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
                                i0.g3(new e4(19, v3Var, bitmap != null ? new wf.a(bitmap, 1, arrayList) : null));
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
                        r52 = r53;
                        r72 = r73;
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
                    r52 = 0;
                    r72 = 0;
                    fileInputStream.close();
                    throw th2;
                }
            case 17:
                ((ResultCallback) obj2).onError((TLRPC.TL_error) obj);
                return;
            case 18:
                ((s1) obj2).onComplete((Bitmap) obj);
                return;
            case 19:
                ((org.telegram.ui.ActionBar.v3) obj2).a((wf.a) obj);
                return;
            case 20:
                ((org.telegram.ui.Components.ap) obj2).onError((TLRPC.TL_error) obj);
                return;
            case 21:
                i2.w1 w1Var = ((g4) obj2).f;
                w1Var.b = System.currentTimeMillis();
                w1Var.c = true;
                ((org.telegram.ui.Components.ap) obj).onComplete(null);
                return;
            case 22:
                Bitmap bitmap2 = (Bitmap) obj;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream((File) obj2);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e14) {
                    f8.g(e14, true);
                    return;
                }
            case 23:
                File file2 = (File) obj2;
                s1 s1Var = (s1) obj;
                try {
                    if (file2.exists()) {
                        r8 = BitmapFactory.decodeFile(file2.getAbsolutePath());
                    }
                } catch (Exception e15) {
                    f8.g(e15, true);
                }
                i0.g3(new e4(18, s1Var, r8));
                return;
            case 24:
                i5 i5Var2 = (i5) obj2;
                i5Var2.getClass();
                i5Var2.j(((Long) obj).longValue());
                return;
            case 25:
                i5 i5Var3 = (i5) obj2;
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    TLRPC.User user = (TLRPC.User) entry.getKey();
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
                    user.contact = true;
                    i5Var3.e0.add(tL_contact);
                    i5Var3.f0.put(Long.valueOf(user.id), tL_contact);
                }
                i5Var3.d(true);
                at notificationCenter = i5Var3.getNotificationCenter();
                int i28 = wp.D8;
                notificationCenter.k(2, 1);
                i5Var3.getNotificationCenter().k(25, new Object[0]);
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                t5 t5Var = (t5) obj2;
                s5 s5Var = (s5) obj;
                t5Var.g--;
                SparseIntArray sparseIntArray = t5Var.b;
                int i29 = sparseIntArray.get(s5Var.index) - 1;
                if (i29 != 0) {
                    sparseIntArray.put(s5Var.index, i29);
                    return;
                }
                sparseIntArray.delete(s5Var.index);
                t5Var.c.remove(s5Var);
                t5Var.a.add(s5Var);
                return;
        }
    }
}
